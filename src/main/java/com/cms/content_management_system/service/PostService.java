package com.cms.content_management_system.service;

import com.cms.content_management_system.entity.Post;
import com.cms.content_management_system.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }
    public Optional<Post> getPostById(Integer pId) {
//        return postRepository.findById(pId).orElse(null);
        return postRepository.findById(pId);
    }
    public void savePost(Post post) {
        postRepository.save(post);
    }
    public void deletePostById(Integer pId) {
        postRepository.deleteById(pId);
    }

}
