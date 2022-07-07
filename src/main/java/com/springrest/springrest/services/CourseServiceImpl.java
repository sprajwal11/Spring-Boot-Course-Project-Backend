package com.springrest.springrest.services;

import com.springrest.springrest.entities.Courses;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    List<Courses> list;
    public CourseServiceImpl(){
        list=new ArrayList<>();
        list.add(new Courses(145,"Java Core Course", "This course contains basics of java"));
        list.add(new Courses(155,"SpringBoot Course", "Creating REST APIs using Spring Boot"));
    }

    @Override
    public List<Courses> getCourses() {
        return list;
    }

    @Override
    public Courses getCourse(long courseID) {

        Courses c=null;
        for(Courses course:list)
        {
            if(course.getId()==courseID){
                c=course;
                break;
            }
        }
        return c;
    }

    @Override
    public Courses addCourse(Courses course) {
        list.add(course);
        return course;
    }
}
