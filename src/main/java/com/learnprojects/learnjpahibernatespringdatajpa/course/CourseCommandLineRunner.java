package com.learnprojects.learnjpahibernatespringdatajpa.course;

import com.learnprojects.learnjpahibernatespringdatajpa.course.Course;
import com.learnprojects.learnjpahibernatespringdatajpa.course.jdbc.CourseJdbcRepository;
import com.learnprojects.learnjpahibernatespringdatajpa.course.jpa.CourseJpaRepository;
import com.learnprojects.learnjpahibernatespringdatajpa.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJdbcRepository repository;
//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn AWS Jpa!", "in28minutes"));
        repository.save(new Course(2, "Learn Azure JPA!", "in28minutes"));
        repository.save(new Course(3, "Learn DevOps JPA!", "in28minutes"));

        repository.deleteById(1l);

        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));
    }
}
