package com.post.comment.serviceImpl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.post.comment.model.Post;

public interface PostService {
	public List<Post> getPost(Pageable pageable, int id);
}
