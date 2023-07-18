package com.example.relations.controller;

import com.example.relations.entity.Instructor;
import com.example.relations.entity.Lecture;
import com.example.relations.repository.InstructorRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/instructor")
@RequiredArgsConstructor
public class InstructorController {
    private final InstructorRepository instructorRepository;

    @GetMapping("{id}/lectures")
    public void readInstructorLectures(@PathVariable("id")Long id){
        Instructor instructor = instructorRepository.findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));

        for(Lecture lecture : instructor.getLectureList()){
            log.info(lecture.getCourseName());
        }
    }

}
