package com.fedyushkin.controller;

import com.fedyushkin.entity.Post;
import com.fedyushkin.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public long addPost (Post post){
        return service.createPost(post);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removePost (@PathVariable long id){
        service.deletePostById(id);
    }
}
