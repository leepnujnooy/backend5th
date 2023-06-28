package com.example.practice230628.application;

import com.example.practice230628.domain.Post;
import com.example.practice230628.domain.PostRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;


    public void createPost(PostCreateRequestDto request){
        Post post = Post
                .builder()
                .title(request.getTitle())
                .content(request.getContent())
                .writer(request.getWriter())
                .build();
        postRepository.save(post);
    }

    public List<PostReadResponse> findAll(){
        return postRepository.findAll()
                .stream()
                .map((post) ->
                        PostReadResponse.builder()
                                .id(post.getId())
                                .title(post.getTitle())
                                .content(post.getContent())
                                .writer(post.getWriter())
                                .build());
    }
}
