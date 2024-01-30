package com.api.ConsumeAPI.Service;

import com.api.ConsumeAPI.DTO.PostDTO;
import com.api.ConsumeAPI.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PostService {

    private final String apiUrl = "https://jsonplaceholder.typicode.com/posts";

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private RestTemplate restTemplate;

    public void fetchandPersistData(){
        try{
            PostDTO[] posts = restTemplate.getForObject(apiUrl,PostDTO[].class);

            for(PostDTO post : posts){
                postRepository.save(post);
            }
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
