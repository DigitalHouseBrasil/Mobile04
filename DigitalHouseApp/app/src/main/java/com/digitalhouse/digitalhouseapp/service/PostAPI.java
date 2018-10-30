package com.digitalhouse.digitalhouseapp.service;

import com.digitalhouse.digitalhouseapp.model.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostAPI {

    @GET("/posts")
    Call<List<Post>> getPosts();

}
