package cz.claimcloud.user.service.impl;

import cz.claimcloud.user.configuration.RetrofitConfig;
import cz.claimcloud.user.model.api.Post;
import cz.claimcloud.user.service.RetrofitAPI;
import cz.claimcloud.user.service.ThirdPartyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;

@Service
@Slf4j
public class ThirdPartyServiceImpl implements ThirdPartyService {

    private Retrofit retrofit;
    private RetrofitAPI retrofitAPI;

    public ThirdPartyServiceImpl(){
        retrofit  = RetrofitConfig.getJsonPlaceHolder();
        retrofitAPI = retrofit.create(RetrofitAPI.class);
    }

    public List<Post> getAllPosts() throws IOException {
        Call<List<Post>> resp = retrofitAPI.getAllPosts();
        try {
            Response<List<Post>> finalResp = resp.execute();
            return finalResp.body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
