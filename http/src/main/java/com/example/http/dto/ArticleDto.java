package com.example.http.dto;


import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

// 블로그 게시글
// 게시글 - 제목
// 게시글 - 내용
/*
{
   "title": "제목",
   "content": "content"
}
* */
@Data
public class ArticleDto {
    private String title;
    private String content;
    private String writer;
    private List<String> comments;


    @PostMapping("/body-3")
    @ResponseBody
    public ResponseDto body3(@RequestBody ArticleDto dto){

        ResponseDto response = new ResponseDto();
        return response;
    }

}