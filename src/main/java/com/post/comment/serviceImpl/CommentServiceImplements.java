package com.post.comment.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.post.comment.model.Comment;
import com.post.comment.repository.CommentRepository;

@Service
public class CommentServiceImplements implements CommentService{
	
	@Autowired
	private CommentRepository commentRepository;

	@Override
	public Page<Comment> findByPostId(Long postId, Pageable pageable) {
	return null;	
	}

	@Override
	public Optional<Comment> findByIdAndPostId(Long id, Long postId) {
		// TODO Auto-generated method stub
		return null;
	}

}
