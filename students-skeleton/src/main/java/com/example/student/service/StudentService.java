package com.example.student;

import com.example.student.dto.StudentDto;
import com.example.student.entity.StudentEntity;
import com.example.student.repository.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    // CREATE
    public void createStudent() {}

    // READ
    public StudentDto readStudent(Long id) {
        Optional<StudentEntity> studentEntityOptional = studentRepository.findById(id);

        if(studentEntityOptional.isPresent()){
            return StudentDto.convert(studentEntityOptional.get());
        }
        else throw new ResponseStatusException(HttpStatus.NOT_FOUND);

    }

    // READ ALL
    public List<StudentDto> readStudentAll() {
        //모든 entity 조회
        List<StudentDto> studentDtoList = new ArrayList<>();



        for(StudentEntity studentEntity : studentRepository.findAll()){
            studentDtoList.add(StudentDto.convert(studentEntity));
        }

        return studentDtoList;

    }

    // UPDATE
    public void updateStudent() {}

    // DELETE
    public void deleteStudent() {}
}
