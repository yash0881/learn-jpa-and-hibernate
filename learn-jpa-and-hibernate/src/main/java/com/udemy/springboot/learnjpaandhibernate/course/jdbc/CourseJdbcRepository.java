package com.udemy.springboot.learnjpaandhibernate.course.jdbc;

import com.udemy.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


//  when class talks to a database we use @Repository annotation
@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;   // used to fire commands to database

    private static String INSERT_Query =
            "insert into course (id, name, author) values (?, ?, ?)";

    private static String DELETE_QUERY =
            "delete from course where id = ?";

    private static String SELECT_QUERY = "select * from course where id = ?";


    public void insert(Course course){
        springJdbcTemplate.update(INSERT_Query, course.getId(), course.getName(), course.getAuthor());
    }

    public  void delete(Integer id){
        springJdbcTemplate.update(DELETE_QUERY, id);
    }

    public Course findById(Integer id){
        return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class),id);
    }
}
