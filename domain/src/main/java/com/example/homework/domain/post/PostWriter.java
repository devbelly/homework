package com.example.homework.domain.post;

import org.springframework.stereotype.Component;

@Component
public class PostWriter {
    private final PostRepository postRepository;

    public PostWriter(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public PostDomain createPost(String title) {
        return postRepository.save(title);
    }

    public PostDomain updatePost(Long id, String title) {
        return postRepository.update(id, title);
    }

    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }
}
