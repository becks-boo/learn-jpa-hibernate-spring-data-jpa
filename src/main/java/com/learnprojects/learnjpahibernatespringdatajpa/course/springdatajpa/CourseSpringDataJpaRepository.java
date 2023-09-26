package com.learnprojects.learnjpahibernatespringdatajpa.course.springdatajpa;

import com.learnprojects.learnjpahibernatespringdatajpa.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

}
