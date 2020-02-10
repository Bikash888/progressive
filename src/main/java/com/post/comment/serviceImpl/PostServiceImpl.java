package com.post.comment.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.post.comment.model.Post;
import com.post.comment.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private PostRepository postRepo;

	@Override
	public List<Post> getPost(Pageable pageable, int id) {
		Page<Post> postPaging = postRepo.findAll(pageable);
		if (postPaging.hasContent()) {
			return postPaging.getContent();
		} else {
			return new ArrayList<Post>();
		}
	}

}
