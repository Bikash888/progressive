package com.post.comment.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.post.comment.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
