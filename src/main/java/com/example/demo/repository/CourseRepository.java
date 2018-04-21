package com.example.demo.repository;

import com.example.demo.model.Course;
import com.example.demo.model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface CourseRepository  extends CrudRepository<Course,Long> {
    Collection<Student> findAllById(Long id);
}
