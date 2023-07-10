package com.example.nhomspring.repository;

import com.example.nhomspring.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository  extends JpaRepository<Post ,Integer> {
}
