package com.api.ConsumeAPI.Controllers;

import com.api.ConsumeAPI.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("/")
    public String displayMessage(){
        return "Running Fine...";
    }

    @GetMapping("/fetch")
    public String fetchandPersistPosts(){
        postService.fetchandPersistData();
        return "Data has been fetched and persisted";
    }
}
