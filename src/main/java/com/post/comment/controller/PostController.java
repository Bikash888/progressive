package com.post.comment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.post.comment.model.Post;
import com.post.comment.repository.PostRepository;
import com.post.comment.serviceImpl.PostService;

@RestController
@RequestMapping("/admin")
public class PostController {
	
	@Autowired
    private PostService postService;
	
	@Autowired
	private PostRepository postRepo;
	
	@GetMapping("/post/{pazeNo}/{pazesize}/{id}")
	public List<Post>findAllPosts(@RequestParam int pazeNo,@RequestParam int pazeSize,@RequestParam int id)
	{
		Pageable pageable=PageRequest.of(pazeNo, pazeSize);
		return (List<Post>) postService.getPost(pageable,id);	
	}
	
	
	@GetMapping("/post")
	public Page<Post> getAllPosts(Pageable pageable) {
        return postRepo.findAll(pageable);
    } 
}
