package com.genspark.SpringBootDemoApplication.Service;

import com.genspark.SpringBootDemoApplication.Entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourse();
    Course getCourseByID(int courseID);

    Course addCourse(Course course);

    Course updateCourse(Course course);

    String deleteCourseByID(int courseID);
}
