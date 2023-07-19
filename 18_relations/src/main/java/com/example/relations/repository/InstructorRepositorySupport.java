package com.example.relations.repository;

import com.example.relations.entity.Instructor;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import java.util.List;
import static com.example.relations.entity.QInstructor.instructor;

@Repository
public class InstructorRepositorySupport extends QuerydslRepositorySupport {
    /**
     * Creates a new {@link QuerydslRepositorySupport} instance for the given domain type.
     *
     * @param domainClass must not be {@literal null}.
     */

    private final JPAQueryFactory jpaQueryFactory;

    public InstructorRepositorySupport(JPAQueryFactory jpaQueryFactory) {
        super(Instructor.class);
        this.jpaQueryFactory = jpaQueryFactory;
    }

    //first_name 을 기준으로 조회하는 querydsl
    public List<Instructor> findAllByFirstName(String name){
        //SELECT * FROM instructor WHERE first_name = name
        return jpaQueryFactory
                //Q instructor 에 접근
                .selectFrom(instructor)
                //어떤 테이블의 튜플의 어떤 컬럼이 무엇과 일치하는지
                .where(instructor.firstName.eq(name))
                //데이터 반환
                .fetch();
    }

    //last_name 을 기준으로 조회하는 querydsl
}
