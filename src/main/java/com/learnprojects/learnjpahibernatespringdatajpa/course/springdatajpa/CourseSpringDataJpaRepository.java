package com.learnprojects.learnjpahibernatespringdatajpa.course.springdatajpa;

import com.learnprojects.learnjpahibernatespringdatajpa.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
    List<Course> findByAuthor(String author);
    List<Course> findByName(String name);
}
