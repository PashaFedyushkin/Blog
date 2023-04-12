package com.fedyushkin.service;

import com.fedyushkin.entity.Post;

public interface PostService {
    long createPost(Post post);

    void deletePostById (long id);
}
