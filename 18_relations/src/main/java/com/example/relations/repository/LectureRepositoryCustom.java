package com.example.relations.repository;

import com.example.relations.entity.Lecture;

import java.util.List;

public interface LectureRepositoryCustom {
    // 인터페이스 요구사항
    List<Lecture> lectureByTime(String day, Integer startTime, Integer endTime);
}
