package com.example.demo;

import com.example.demo.model.Course;
import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CourseController {
    @Autowired
    CourseRepository repository;

    @RequestMapping(value="/course",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )@ResponseBody
    public Course insertCourse(@RequestBody Course course){return repository.save(course);}
    @GetMapping("/course:id={id}")
    @ResponseBody
    public Course getCourse(@PathVariable String id){return repository.findById(Long.parseLong(id)).get();}
}
