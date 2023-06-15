package com.example.student.dto;

import com.example.student.entity.StudentEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class StudentDto {

    private Long id;
    private String name;
    private Integer age;
    private String phone;
    private String email;


    public static StudentDto convertEntityToDto(StudentEntity studentEntity){
        StudentDto studentDto = new StudentDto();
        studentDto.setId(studentEntity.getId());
        studentDto.setName(studentEntity.getName());
        studentDto.setAge(studentEntity.getAge());
        studentDto.setPhone(studentEntity.getPhone());
        studentDto.setEmail(studentEntity.getEmail());

        return studentDto;
    }


}
