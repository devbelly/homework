package com.example.homework.domain.post;

import org.springframework.stereotype.Service;

@Service
public class PostService {
    private final PostReader postReader;
    private final PostWriter postWriter;

    public PostService(PostReader postReader, PostWriter postWriter) {
        this.postReader = postReader;
        this.postWriter = postWriter;
    }

    public PostDomain createPost(String title) {
        return postWriter.createPost(title);
    }

    public PostDomain readPost(Long id) {
        return postReader.readPost(id);
    }

    public PostDomain updatePost(Long id, String title) {
        return postWriter.updatePost(id, title);
    }

    public void deletePost(Long id) {
        postWriter.deletePost(id);
    }
}
