package com.post.comment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.post.comment.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
