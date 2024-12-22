package com.example.homework.domain.post;

public interface PostRepository {
    PostDomain findById(Long id);
    PostDomain save(String title);
    void deleteById(Long id);
    PostDomain update(Long id, String title);
}
