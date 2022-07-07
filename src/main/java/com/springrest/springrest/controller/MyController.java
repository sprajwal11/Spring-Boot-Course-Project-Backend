package com.springrest.springrest.controller;

import com.springrest.springrest.entities.Courses;
import com.springrest.springrest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;


    @GetMapping("/home")
    public String home(){

        return "this is home page";
    }
    @GetMapping("/courses")
    public List<Courses> getCourses(){
        return this.courseService.getCourses();
    }

    @GetMapping("/courses/{courseID}")
    public Courses getCourse(@PathVariable String courseID)
    {
        return this.courseService.getCourse(Long.parseLong(courseID));
    }

    @PostMapping("/courses")
    public Courses addCourse(@RequestBody Courses course){

        return this.courseService.addCourse(course);
    }
}
