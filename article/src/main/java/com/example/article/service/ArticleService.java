package com.example.article.service;

import com.example.article.dto.ArticleDto;
import com.example.article.entity.ArticleEntity;
import com.example.article.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository repository;

    public ArticleDto createArticle(ArticleDto dto) {

        ArticleEntity articleEntity = new ArticleEntity();

        articleEntity.setTitle(dto.getTitle());
        articleEntity.setContent(dto.getContent());
        articleEntity.setWriter(dto.getWriter());

        repository.save(articleEntity);

        return dto;
    }

    public ArticleDto readArticle(Long id) {

        Optional<ArticleEntity> optionalArticleEntity = repository.findById(id);

        if(optionalArticleEntity.isPresent()){
            return ArticleDto.fromEntity(optionalArticleEntity.get());
        }
        else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public List<ArticleDto> readArticleAll() {
        List<ArticleEntity> articleEntityList = repository.findAll();
        List<ArticleDto> articleDtoList = new ArrayList<>();

        for (ArticleEntity articleEntity : articleEntityList){
            articleDtoList.add(ArticleDto.fromEntity(articleEntity));
        }

        return articleDtoList;
    }

    public ArticleDto updateArticle(Long id, ArticleDto dto) {
        Optional<ArticleEntity> optionalArticleEntity = repository.findById(id);

        if(optionalArticleEntity.isPresent()){
            ArticleEntity articleEntity = optionalArticleEntity.get();
            articleEntity.setTitle(dto.getTitle());
            articleEntity.setContent(dto.getContent());
            articleEntity.setWriter(dto.getWriter());
            repository.save(articleEntity);

            return ArticleDto.fromEntity(articleEntity);
        }
        else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }



    }

    public void deleteArticle(Long id) {
        Optional<ArticleEntity> optionalArticle = repository.findById(id);

        if(optionalArticle.isPresent()){
            repository.delete(optionalArticle.get());
        }
        else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }
}