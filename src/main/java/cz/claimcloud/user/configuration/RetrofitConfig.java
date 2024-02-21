package cz.claimcloud.user.configuration;

import cz.claimcloud.user.constant.ThirdPartyConstant;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitConfig {

    private static Retrofit retrofit = null;

    public static Retrofit getJsonPlaceHolder() {
        if(retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(ThirdPartyConstant.jsonPlaceHolderBaseURL)
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }

}
