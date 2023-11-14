package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        JSONPlaceholderFetcher jsonPlaceholderFetcher = new JSONPlaceholderFetcher();
        JSONMapper jsonMapper = new JSONMapper();

        Post post1 = new Post();
        post1.setUserId(1);
        post1.setId(11);
        post1.setTitle("Kawaleria");
        post1.setBody("Atak na Agnecje Tarczy");
        String json = "{\"userId\":\"2\",\"id\":\"22\",\"title\":\"Film\",\"body\":\"Fajny film\"}";
        System.out.println(json);
        System.out.println("----------------------");
        System.out.println("OBIEKT POST1");
        System.out.println(post1);
        System.out.println("----------------------");
        System.out.println("OBIEKT POST1 ZAMIENIONY NA JSON");
        System.out.println(jsonMapper.mapToJson(post1));
        System.out.println("----------------------");
        System.out.println(jsonMapper.mapToJava(json));
        jsonPlaceholderFetcher.getSinglePost(2);
        System.out.println("START ALL Object POST");
        System.out.println(jsonPlaceholderFetcher.getAllPosts());
        System.out.println("----------------------");

    }
}