package com.platzi.platzigram.api;

import com.platzi.platzigram.model.Post;

import java.util.ArrayList;

/**
 * Created by isabelpalomar on 9/29/16.
 */

public class PostResponse {
    ArrayList<Post> postList = new ArrayList<Post>();

    public void setPostList(ArrayList<Post> postList) {
        this.postList = postList;
    }

    public ArrayList<Post> getPostList(){
        return postList;
    }
}
