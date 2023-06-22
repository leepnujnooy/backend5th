package com.example.article.dto;


import com.example.article.entity.CommentEntity;
import lombok.Data;

@Data
public class CommentDto {

    private Long id;
    private Long articleId;
    private String writer;
    private String content;

    public static CommentDto fromEntity(CommentEntity commentEntity){
        CommentDto dto = new CommentDto();
        dto.setId(commentEntity.getId());
        dto.setArticleId(commentEntity.getArticleId());
        dto.setContent(commentEntity.getContent());
        dto.setWriter(commentEntity.getWriter());
        return dto;
    }

}
