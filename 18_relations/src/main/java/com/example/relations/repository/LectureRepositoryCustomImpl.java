package com.example.relations.repository;

import com.example.relations.entity.Lecture;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.example.relations.entity.QLecture.lecture;

@RequiredArgsConstructor
public class LectureRepositoryCustomImpl implements LectureRepositoryCustom{
    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<Lecture> lectureByTime(String day, Integer startTime, Integer endTime) {
        return jpaQueryFactory
                .selectFrom(lecture)
                .where(lecture.day.eq(day))
                .fetch();
    }
}
