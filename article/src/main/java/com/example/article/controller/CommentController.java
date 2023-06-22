package com.example.article.controller;


import com.example.article.dto.CommentDto;
import com.example.article.service.CommentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/articles/{articleId}/comments")
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    //POST 댓글 생성
    //articles/{articlesId}/comments
    @PostMapping
    public CommentDto create(@PathVariable("articleId")Long articleId, @RequestBody CommentDto commentDto){
        return commentService.createComment(articleId , commentDto);
    }

    //GET 전체 조회
    //articles/{articlesId}/comments
    @GetMapping
    public List<CommentDto> readCommentAll(@PathVariable("articleId") Long articleId){
        return commentService.readCommentAll(articleId);
    }

    //POST 댓글 수정
    //articles/{artifactId}/comments/commentId
    @PutMapping("/{commentId}")
    public CommentDto updateComment(@PathVariable("articleId") Long articleId, @PathVariable("commentId") Long commentId, @RequestBody CommentDto commentDto){
        return commentService.updateComment(articleId,commentId,commentDto);
    }

    //DELETE 댓글 삭제
    @DeleteMapping("/{commentId}")
    public void deleteComment(@PathVariable("articleId") Long articleId, @PathVariable("commentId") Long commentId){
        commentService.deleteComment(articleId,commentId);
    }
}
