package com.example.homework.controller;

import com.example.homework.domain.post.PostDomain;
import com.example.homework.domain.post.PostService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public PostResponse create(@RequestBody PostRequest request) {
        PostDomain postDomain = postService.createPost(request.getTitle());
        return new PostResponse(postDomain.getId(), postDomain.getTitle());
    }

    @GetMapping("/{id}")
    public PostResponse read(@PathVariable(name = "id") Long id) {
        PostDomain postDomain = postService.readPost(id);
        return new PostResponse(postDomain.getId(), postDomain.getTitle());
    }

    @PutMapping("/{id}")
    public PostResponse update(@PathVariable(name = "id") Long id, @RequestBody PostRequest title) {
        PostDomain postDomain = postService.updatePost(id, title.getTitle());
        return new PostResponse(postDomain.getId(), postDomain.getTitle());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        postService.deletePost(id);
    }
}
