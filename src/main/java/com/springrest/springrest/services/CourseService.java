package com.springrest.springrest.services;

import com.springrest.springrest.entities.Courses;

import java.util.List;

public interface CourseService {

    public List<Courses> getCourses();

    public Courses getCourse(long courseID);

    public Courses addCourse(Courses course);
}
