package com.example.homework.controller;

public class PostResponse {
    private final Long id;
    private final String title;

    public PostResponse(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
