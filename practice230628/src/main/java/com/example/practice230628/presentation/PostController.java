package com.example.practice230628.presentation;

import com.example.practice230628.application.PostCreateRequestDto;
import com.example.practice230628.domain.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {

    @PostMapping
    public void createPost(@RequestBody PostCreateRequest request){
        PostCreateRequestDto requestDto = new PostCreateRequestDto();
    }

}
