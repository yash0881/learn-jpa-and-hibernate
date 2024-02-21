package com.udemy.springboot.learnjpaandhibernate.course;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository <Course, Long> {

    Course findByAuthor(String yash);
}
