package com.Project2.Joblisting.Controller;

import com.Project2.Joblisting.Model.Post;
import com.Project2.Joblisting.Repository.PostRepo;
import com.Project2.Joblisting.Repository.SearchRepo;
import com.Project2.Joblisting.Repository.SearchRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping(value ="/")

public class PostController {

    @Autowired
    PostRepo repo;
    @Autowired
    SearchRepo srepo;
    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        return repo.findAll();
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post){
        return repo.save(post);

    }

    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text){
        return srepo.findByText(text);
    }
}
