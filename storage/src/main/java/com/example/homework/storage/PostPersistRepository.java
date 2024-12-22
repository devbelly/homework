package com.example.homework.storage;

import com.example.homework.domain.post.PostDomain;
import com.example.homework.domain.post.PostRepository;
import java.util.NoSuchElementException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class PostPersistRepository implements PostRepository {

    private final PostJpaRepository postJpaRepository;

    public PostPersistRepository(PostJpaRepository postJpaRepository) {
        this.postJpaRepository = postJpaRepository;
    }


    @Override
    public PostDomain findById(Long id) {
        return postJpaRepository.findById(id).orElseThrow(NoSuchElementException::new).toDomain();
    }

    @Override
    public PostDomain save(String title) {
        return postJpaRepository.save(new Post(title)).toDomain();
    }

    @Override
    public void deleteById(Long id) {
        postJpaRepository.deleteById(id);
    }

    @Override
    public PostDomain update(Long id, String title) {
        Post post = postJpaRepository.findById(id).orElseThrow(NoSuchElementException::new);
        post.setTitle(title);
        return postJpaRepository.save(post).toDomain();
    }
}
