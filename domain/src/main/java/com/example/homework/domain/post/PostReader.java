package com.example.homework.domain.post;

import org.springframework.stereotype.Component;

@Component
public class PostReader {
    private final PostRepository postRepository;

    public PostReader(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public PostDomain readPost(Long id) {
        return postRepository.findById(id);
    }


}
