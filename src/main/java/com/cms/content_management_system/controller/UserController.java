package com.cms.content_management_system.controller;

import com.cms.content_management_system.entity.Post;
import com.cms.content_management_system.entity.User;
import com.cms.content_management_system.repository.PostRepository;
import com.cms.content_management_system.repository.UserRepository;
import com.cms.content_management_system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PostRepository postRepository;
    @PostMapping("/{uId}/posts")
    public Optional<Post> addPostByUser(@PathVariable Integer uId, @RequestBody Post post) {
  //      User user = userRepository.findById(uId).orElse(null);
//        if (user != null) {
//            post.setUser(user);
//            return postRepository.save(post);
//        } else {
//            // Handle user not found
//            return null;
//        }
        return postRepository.findById(uId);

    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @GetMapping("/{uId}")
    public User getUserById(@PathVariable Integer uId) {
        return userService.getUserById(uId);
    }
    @PostMapping
    public void saveUser(@RequestBody User user) {
        userService.saveUser(user);
    }
    @DeleteMapping("/{uId}")
    public void deleteUser(@PathVariable Integer uId) {
        userService.deleteUserById(uId);
    }

}
