package com.fedyushkin.service;

import com.fedyushkin.entity.Post;

public interface PostService {
    long createPost(Post post);

    public void deletePostById (long id);
}
