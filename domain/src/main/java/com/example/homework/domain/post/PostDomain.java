package com.example.homework.domain.post;

public class PostDomain {
    private Long id;
    private String title;

    public PostDomain() {
    }

    public PostDomain(Long id, String title) {
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
