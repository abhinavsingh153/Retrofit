package com.pixelkaveman.retrofit;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Abhinav Singh on 07-11-2019
 */
public interface JsonPlaceHolderApi {

    @GET("posts")
    Call<List<Post>> getPosts();
}
