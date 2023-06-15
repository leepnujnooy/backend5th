package com.example.student.entity;
/* CREATE TABLE students (
*   id INTEGER PRIMARY KEY AUTOINCREMENT,
*   name TEXT,
*   age INTEGER,
*   phone TEXT,
*   email TEXT
* */

import com.example.student.dto.StudentDto;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "students")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private String phone;
    private String email;



    public static StudentEntity convertDtoToEntity(StudentDto studentDto){

        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setId(studentDto.getId());
        studentEntity.setAge(studentDto.getAge());
        studentEntity.setEmail(studentDto.getEmail());
        studentEntity.setName(studentDto.getName());
        studentEntity.setPhone(studentDto.getPhone());

        return studentEntity;
    }
}