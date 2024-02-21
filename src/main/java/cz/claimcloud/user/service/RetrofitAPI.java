package cz.claimcloud.user.service;

import cz.claimcloud.user.model.api.Post;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface RetrofitAPI {

    @GET(value="/posts")
    Call<List<Post>> getAllPosts();

}
