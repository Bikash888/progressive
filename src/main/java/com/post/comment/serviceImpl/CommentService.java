package com.post.comment.serviceImpl;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import com.post.comment.model.Comment;

public interface CommentService {
	Page<Comment>findByPostId(Long postId,Pageable pageable);
	Optional<Comment>findByIdAndPostId(Long id, Long postId);

}
