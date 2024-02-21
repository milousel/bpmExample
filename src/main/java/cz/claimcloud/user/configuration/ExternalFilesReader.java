package cz.claimcloud.user.configuration;

import cz.claimcloud.user.model.dto.ErrHandlingDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.reloading.FileChangedReloadingStrategy;
import org.apache.commons.configuration2.YAMLConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.*;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@Slf4j
@RequiredArgsConstructor
public class ExternalFilesReader {

    private final Environment environment;


    public ErrHandlingDto getErrHandlingConfig() throws ConfigurationException {

        PropertiesConfiguration configuration =
                new PropertiesConfiguration(environment.getProperty("externalConfigs.errHandling"));
        configuration.setReloadingStrategy(new FileChangedReloadingStrategy());

        return new ErrHandlingDto((ArrayList<String>) configuration.getProperty("autoRetry"),
                (ArrayList<String>) configuration.getProperty("terminate"),
                (ArrayList<String>) configuration.getProperty("skip"));
    }

    private Object getDataFromYamlConfig(YAMLConfiguration configuration, String propertyName, String type) {
        String str = (String) configuration.getProperty(propertyName);
        switch (type) {
            case "StringArr": return new ArrayList<>(Arrays.asList(str.split(",")));
            default: return str;
        }
    }

    public ErrHandlingDto getStructErrHandlingConfig() throws ConfigurationException, FileNotFoundException, org.apache.commons.configuration2.ex.ConfigurationException {

        PropertiesConfiguration configuration =
                new PropertiesConfiguration(environment.getProperty("externalFiles.errHandlingConfig"));
        configuration.setReloadingStrategy(new FileChangedReloadingStrategy());
        YAMLConfiguration yamlConfiguration = new YAMLConfiguration();
        if(environment.getProperty("externalConfigs.errHandling") == null) {
            throw new ConfigurationException("FilePath is null");
        }
        InputStream inputStream = new FileInputStream(environment.getProperty("externalConfigs.errHandling"));
        yamlConfiguration.read(inputStream);
        List<String> autoRetry = (List<String>)
                getDataFromYamlConfig(yamlConfiguration, "conflict-result-method.autoRetry", "StringArr");
        List<String> terminate = (List<String>)
                getDataFromYamlConfig(yamlConfiguration, "conflict-result-method.terminate", "StringArr");
        List<String> skip = (List<String>)
                getDataFromYamlConfig(yamlConfiguration, "conflict-result-method.skip", "StringArr");

        return new ErrHandlingDto(autoRetry, terminate, skip);
    }

    public PrivateKey getGPWebpayPrivateKey() throws KeyStoreException, KeyException {
        KeyStore ks = KeyStore.getInstance("JCEKS");
        String keystorepass = environment.getProperty("gpwebpay.privateKey.password");
        InputStream fis = null;
        try {
            fis = new FileInputStream(environment.getProperty("gpwebpay.privateKey.path"));
            log.info("fis: {}", fis);
            ks.load(fis, keystorepass.toCharArray());
            log.info("ks: {}", ks);
            PrivateKey priKey = null;
            priKey = (PrivateKey) ks.getKey(environment.getProperty("gpwebpay.privateKey.alias"), keystorepass.toCharArray());
            log.info("priKey: {}", priKey);
            return priKey;
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            throw new KeyException(e);
        }
        catch (CertificateException e) {
            e.printStackTrace();
            throw new KeyException(e);
        }
        catch (FileNotFoundException e) {
            throw new KeyStoreException("KeyStore not found.");

        }
        catch (UnrecoverableKeyException e) {
            e.printStackTrace();
            throw new KeyException(e);
        }
        catch (IOException e) {
            e.printStackTrace();
            throw new KeyException(e);
        }
        finally {
            if (fis != null) {
                try {
                    fis.close();
                }
                catch (IOException e) {
                    // nezajima nas, ze to neslo zavrit
                }
            }
        }
    }

}
