package com.example.article.repository;

import com.example.article.entity.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<ArticleEntity, Long> {

    //id가 큰 순서대로 최상위 20개 정렬
    List<ArticleEntity> findTop20ByOrderByIdDesc();

    //id가 특정 값보다 작은 데이터중 큰 순서대로 최상위 20개 정렬
    List<ArticleEntity> findTop20ByIdLessThanOrderByIdDesc(Long id);
}
