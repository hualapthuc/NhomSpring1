package com.example.nhomspring.service.Impl;

import com.example.nhomspring.model.Post;
import com.example.nhomspring.repository.PostRepository;
import com.example.nhomspring.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;
    @Override
    public List<Post> getAllPost() {
        return postRepository.findAll();
    }

    @Override
    public void addPost(Post post) {
        postRepository.save(post);
    }

    @Override
    public void deletePost(int id) {
        postRepository.deleteById(id);
    }

    @Override
    public Post updatePost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Post getPostById(Integer id) {
        return postRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("post not found"));
    }
}
