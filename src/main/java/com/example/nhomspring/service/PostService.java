package com.example.nhomspring.service;

import com.example.nhomspring.model.Position;
import com.example.nhomspring.model.Post;

import java.util.List;

public interface PostService {
    public List<Post> getAllPost();
    public void addPost(Post post);
    public void deletePost(int id);
    public Post updatePost(Post post);
    public Post getPostById(Integer id);
}
