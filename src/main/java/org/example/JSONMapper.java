package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class JSONMapper {

    ObjectMapper objectMapper = new ObjectMapper();

    public Post mapToJava(String str) {
        Post post = new Post();
        try {
            post = objectMapper.readValue(str, Post.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return post;
    }

    public List<Post> mapToJavaList(String str) {

        List<Post> listPost;
        try {
            listPost = objectMapper.readValue(str, new TypeReference<List<Post>>() {
            });
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return listPost;
    }

    public String mapToJson(Post post) {
        String postAsString;
        try {
            postAsString = objectMapper.writeValueAsString(post);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        return postAsString;
    }
}
