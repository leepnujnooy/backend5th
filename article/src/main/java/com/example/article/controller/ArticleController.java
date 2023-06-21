package com.example.article.controller;

import com.example.article.dto.ArticleDto;
import com.example.article.service.ArticleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController // @ResponseBody 생략
@RequestMapping("/articles")
@RequiredArgsConstructor
public class ArticleController {
    private final ArticleService service;

    // POST /articles
    @PostMapping
    public ArticleDto create(@RequestBody ArticleDto dto){
        return service.createArticle(dto);
    }




    // GET /articles
    @GetMapping
    public List<ArticleDto> readAll(){
        return service.readArticleAll();
    }



    // GET /articles/{id}
    @GetMapping("/{id}")
    public ArticleDto read(@PathVariable("id") Long id){
        return service.readArticle(id);
    }



    // PUT /articles/{id}
    @PutMapping("/{id}")
    public ArticleDto update(@PathVariable("id") Long id , @RequestBody ArticleDto dto){
        return service.updateArticle(id,dto);
    }


    // DELETE /articles/{id}
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Long id){
        service.deleteArticle(id);
    }

}