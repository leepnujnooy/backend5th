package com.example.relations.controller;


import com.example.relations.entity.Instructor;
import com.example.relations.entity.Lecture;
import com.example.relations.repository.InstructorRepository;
import com.example.relations.repository.LectureRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/lectures")
@RequiredArgsConstructor
public class LectureController {


    private final LectureRepository lectureRepository;
    private final InstructorRepository instructorRepository;


    @PutMapping("{id}/instructor/{instructorId}")
    public void updateLectureInstructor(
            @PathVariable("id") Long id,
            @PathVariable("instructorId") Long instructorID
    ) {
        Optional<Lecture> optionalLecture
                = lectureRepository.findById(id);
        if (optionalLecture.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        Optional<Instructor> optionalInstructor
                = instructorRepository.findById(instructorID);
        if (optionalInstructor.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        Lecture lecture = optionalLecture.get();
        Instructor instructor = optionalInstructor.get();
        // 그냥 Java 객체 쓰듯이
        lecture.setInstructor(instructor);
        lectureRepository.save(lecture);
    }
}

