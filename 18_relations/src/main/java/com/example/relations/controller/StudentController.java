package com.example.relations.controller;

import com.example.relations.entity.Lecture;
import com.example.relations.entity.Student;
import com.example.relations.repository.LectureRepository;
import com.example.relations.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
@Slf4j
public class StudentController {

    private final StudentRepository studentRepository;
    private final LectureRepository lectureRepository;

    @PutMapping("{id}/lectures/{lectureId}")
    public void UpdateStudentLectures(
            @PathVariable("id")Long id,
            @PathVariable("lectureId")Long lectureId
    ){
        Student student = studentRepository.findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
        Lecture lecture = lectureRepository.findById(lectureId)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));


        student.getAttending().add(lecture);
        studentRepository.save(student);

    }
}
