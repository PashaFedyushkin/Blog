package com.fedyushkin.service.impl;

import com.fedyushkin.entity.Post;
import com.fedyushkin.repository.PostRepository;
import com.fedyushkin.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceJpa implements PostService {

    @Autowired
    private PostRepository repository;

    @Override
    public long createPost(Post post) {
        return repository.save(post).getId();
    }

    @Override
    public void deletePostById(long id){
        repository.deleteById(id);
    }
}
