package com.example.article.repository;

import com.example.article.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<CommentEntity, Long> {

    // articleId 인 comment 만 반환하는 메소드
    List<CommentEntity> findAllByArticleId(Long id);

}
