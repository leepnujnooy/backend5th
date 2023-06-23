package com.example.file.controller;

import com.example.file.dto.ResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

@Slf4j
@RestController
public class FileController {
    @PostMapping(value="/multipart" , consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseDto multipart(@RequestParam("name")String name,
                          @RequestParam("photo")MultipartFile multipartFile) throws IOException {

//        //방법 1
//        Path upload = Path.of("cat.jpeg");
//        multipartFile.transferTo(upload);

//        //방법 2
//        File file = new File("./cat.jpeg");
//        try(OutputStream outputStream = new FileOutputStream(file)){
//            byte[] fileBytes = multipartFile.getBytes();
//
//            outputStream.write(fileBytes);
//        }
        //방법3
        Files.createDirectories(Path.of("media")); //저장경로 작성
        Path upload = Path.of("media/cat.jpeg"); //저장할 파일이름을 포함한 경로 작성
        multipartFile.transferTo(upload); // 저장



        ResponseDto responseDto = new ResponseDto();
        responseDto.setMessage("success");

        return responseDto;
    }

}
