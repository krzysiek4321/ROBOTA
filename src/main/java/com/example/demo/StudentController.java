package com.example.demo;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @Autowired
    StudentRepository repository;

    @RequestMapping("/hello")
    public ModelAndView hello(ModelAndView modelAndView, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        modelAndView.setViewName("hello");
        modelAndView.getModel().put("students", repository.findAll());
        return modelAndView;
    }
    @GetMapping("id=/{id}")
    @ResponseBody
    public Student getStudent(@PathVariable String id) {
        return repository.findById(Long.parseLong(id)).get();
    }

    @RequestMapping(value="/insert",
            method=RequestMethod.POST,
            produces=MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )    @ResponseBody
    public Student insertStudent(@RequestBody Student student) {
        return repository.save(student);
    }
}
