package com.example.article.service;


import com.example.article.dto.CommentDto;
import com.example.article.entity.CommentEntity;
import com.example.article.repository.ArticleRepository;
import com.example.article.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;
    private final ArticleRepository articleRepository;

    //생성
    public CommentDto createComment(Long articleId, CommentDto dto) {
        // articleId를 ID로 가진 ArticleEntity 가 존재 하는지?
        if (!articleRepository.existsById(articleId))
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);  // 자유롭게 상황대처

        CommentEntity newComment = new CommentEntity();
        newComment.setWriter(dto.getWriter());
        newComment.setContent(dto.getContent());
        newComment.setArticleId(articleId);
        newComment = commentRepository.save(newComment);
        return CommentDto.fromEntity(newComment);
    }

    //조회
    public List<CommentDto> readCommentAll(Long articleId){
        List<CommentEntity> commentEntityList = commentRepository.findAllByArticleId(articleId);
        List<CommentDto> commentDtoList = new ArrayList<>();

        for (CommentEntity commentEntity : commentEntityList ){
            commentDtoList.add(CommentDto.fromEntity(commentEntity));
        }

        return commentDtoList;
    }

    //수정
    public CommentDto updateComment(Long articleId, Long commentId, CommentDto commentDto){


        Optional<CommentEntity> optionalCommentEntity = commentRepository.findById(commentId);

        if(optionalCommentEntity.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        CommentEntity commentEntity = optionalCommentEntity.get();

        if(!articleId.equals(commentEntity.getArticleId())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }


        commentEntity.setWriter(commentDto.getWriter());
        commentEntity.setContent(commentDto.getContent());

        return CommentDto.fromEntity(commentRepository.save(commentEntity));
    }

    //삭제
    public void deleteComment(Long articleId, Long commentId){
        Optional<CommentEntity> optionalCommentEntity = commentRepository.findById(commentId);

        if(optionalCommentEntity.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        CommentEntity commentEntity = optionalCommentEntity.get();

        if(!articleId.equals(commentEntity.getArticleId())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        commentRepository.deleteById(commentEntity.getId());
    }
}