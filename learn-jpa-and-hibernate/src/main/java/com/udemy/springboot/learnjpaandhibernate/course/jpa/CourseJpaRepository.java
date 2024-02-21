package com.udemy.springboot.learnjpaandhibernate.course.jpa;


import com.udemy.springboot.learnjpaandhibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {


    // used to talk to database in jpa
    @PersistenceContext
    private  EntityManager entityManager;


    public void insert(Course course){
        entityManager.merge(course);
    }

    public Course findById(long id){
       return entityManager.find(Course.class, id);
    }

    public void deleteById(Integer id){
        Course course = entityManager.find(Course.class,id);
        entityManager.remove(course);
    }

}
