package com.platzi.platzigram.api;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by isabelpalomar on 9/29/16.
 */
public interface PlatzigramFirebaseService {

    @GET("post.json")
    Call<PostResponse> getPostList();
}
