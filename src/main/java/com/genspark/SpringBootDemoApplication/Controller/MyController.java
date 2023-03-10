package com.genspark.SpringBootDemoApplication.Controller;

import com.genspark.SpringBootDemoApplication.Entity.Course;
import com.genspark.SpringBootDemoApplication.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class MyController {

    // autowired because CourseService class is being injected into MyController class
    @Autowired
    private CourseService courseService;
    @GetMapping("/")
    public String home() {
        return "<HTML><H1>Welcome to Course Application</H1></HTML>";
    }

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.courseService.getAllCourse();
    }

    @GetMapping("/courses/{courseID}")
    public Course getCourseByID(@PathVariable String courseID) {
        return this.courseService.getCourseByID(Integer.parseInt(courseID));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return this.courseService.addCourse(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course) {
        return this.courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseID}")
    public String deleteCourse(@PathVariable String courseID) {
        return this.courseService.deleteCourseByID(Integer.parseInt(courseID));
    }
}
