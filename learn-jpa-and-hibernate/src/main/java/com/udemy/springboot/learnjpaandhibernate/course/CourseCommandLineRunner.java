package com.udemy.springboot.learnjpaandhibernate.course;

import com.udemy.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.udemy.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository courseJdbcRepository;


//    @Autowired
//    private CourseJpaRepository courseJpaRepository;

    @Autowired
    private CourseSpringDataJpaRepository courseSpringDataJpaRepository;


    @Override
    public void run(String... args) throws Exception {
//        courseJdbcRepository.insert(new Course(1,"DSA","Yash"));
//        courseJdbcRepository.insert(new Course(2,"DSA","Sunil"));
//        courseJdbcRepository.insert(new Course(3,"Dotnet","Anil"));
//        courseJdbcRepository.insert(new Course(4,"CP","Raj"));
//        courseJdbcRepository.insert(new Course(5,"Devops","Suraj"));
//        courseJdbcRepository.insert(new Course(6,"Java","Neeraj"));
//        courseJdbcRepository.insert(new Course(7,"MERN","Keshav"));
//        courseJdbcRepository.delete(5);
//        System.out.println("Hello ......");
//        System.out.println(courseJdbcRepository.findById(2));

//        courseJpaRepository.insert(new Course(1,"DSA","Yash"));
//        courseJpaRepository.insert(new Course(2,"DSA","Sunil"));
//        courseJpaRepository.insert(new Course(3,"Dotnet","Anil"));
//        courseJpaRepository.insert(new Course(4,"CP","Raj"));
//        courseJpaRepository.insert(new Course(5,"Devops","Suraj"));
//        courseJpaRepository.insert(new Course(6,"Java","Neeraj"));
//        courseJpaRepository.insert(new Course(7,"MERN","Keshav"));
//        courseJpaRepository.deleteById(5);
//        System.out.println("Hello ......");
//        System.out.println(courseJpaRepository.findById(2));


        courseSpringDataJpaRepository.save(new Course(1,"DSA","Yash"));
        courseSpringDataJpaRepository.save(new Course(2,"DSA","Sunil"));
        courseSpringDataJpaRepository.save(new Course(3,"Dotnet","Anil"));
        courseSpringDataJpaRepository.save(new Course(4,"CP","Raj"));
        courseSpringDataJpaRepository.save(new Course(5,"Devops","Suraj"));
        courseSpringDataJpaRepository.save(new Course(6,"Java","Neeraj"));
        courseSpringDataJpaRepository.save(new Course(7,"MERN","Keshav"));
        courseSpringDataJpaRepository.deleteById(5l);
        System.out.println("Hello ......");
        System.out.println(courseSpringDataJpaRepository.findById(4l));
        System.out.println("_____________________________________________________");
//        System.out.println(courseSpringDataJpaRepository.findAll());
//        System.out.println(courseSpringDataJpaRepository.count());
        System.out.println(courseSpringDataJpaRepository.findByAuthor("Yash"));
    }
}
