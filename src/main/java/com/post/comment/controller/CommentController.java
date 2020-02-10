package com.post.comment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.post.comment.model.Comment;
import com.post.comment.model.Post;
import com.post.comment.repository.CommentRepository;
import com.post.comment.serviceImpl.CommentServiceImplements;

@RestController
@RequestMapping("/admin")
public class CommentController {

	@Autowired
	private CommentRepository commentRepository;
	
    
 	@GetMapping("/comment")
 	public Page<Comment> getAllPosts(Pageable pageable) {
         return commentRepository.findAll(pageable);
     } 
 	
 	
	
	
}
