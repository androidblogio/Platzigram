package com.platzi.platzigram.model;

import java.util.HashMap;

/**
 * Created by lucy on 28/09/16.
 */

public class Post {

    public String uid;
    public String author;
    public String imageUrl;

    public double getTimestampCreated() {
        return timestampCreated;
    }

    public void setTimestampCreated(double timestampCreated) {
        this.timestampCreated = timestampCreated;
    }

    public double timestampCreated;

    public Post(String author, String imageUrl, double timestampCreated) {
        this.author = author;
        this.imageUrl = imageUrl;
        this.timestampCreated = timestampCreated;
    }

    public Post() {

    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
