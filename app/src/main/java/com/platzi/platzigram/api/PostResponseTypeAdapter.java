package com.platzi.platzigram.api;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.platzi.platzigram.model.Post;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by isabelpalomar on 9/29/16.
 */
public class PostResponseTypeAdapter extends TypeAdapter {
    @Override
    public void write(JsonWriter out, Object value) throws IOException {

    }

    @Override
    public PostResponse read(JsonReader in) throws IOException {
        final PostResponse response = new PostResponse();
        ArrayList<Post> postList = new ArrayList<Post>();
        in.beginObject();
        while (in.hasNext()) {
            Post post = readPost(in);
            postList.add(post);
        }

        in.endObject();
        response.setPostList(postList);
        return response;
    }


    public Post readPost(JsonReader reader) throws IOException {
        Post item = new Post();
        reader.nextName();
        reader.beginObject();
        while (reader.hasNext()) {
            String next = reader.nextName();
            switch (next) {
                case "author":
                    item.setAuthor(reader.nextString());
                    break;
                case "imageUrl":
                    item.setImageUrl(reader.nextString());
                    break;
                case "timeStampCreated":
                    item.setTimestampCreated(reader.nextDouble());
                    break;
            }
        }

        reader.endObject();
        return item;
    }

}
