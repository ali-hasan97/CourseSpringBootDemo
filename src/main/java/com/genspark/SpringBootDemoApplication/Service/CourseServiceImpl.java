package com.genspark.SpringBootDemoApplication.Service;

import com.genspark.SpringBootDemoApplication.Dao.CourseDao;
import com.genspark.SpringBootDemoApplication.Entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseDao courseDao;

    @Override
    public List<Course> getAllCourse() {
        return this.courseDao.findAll();
    }

    @Override
    public Course getCourseByID(int courseID) {
        Optional <Course> c = this.courseDao.findById(courseID);
        Course course = null;
        if (c.isPresent()) {
            course = c.get();
        } else {
            throw new RuntimeException(" Course not found for id :: " + courseID);
        }
        return course;
    }

    @Override
    public Course addCourse(Course course) {
        return this.courseDao.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return this.courseDao.save(course);
    }

    public String deleteCourseByID(int courseID) {
        this.courseDao.deleteById(courseID);
        return "Deleted Successfully";
    }
}
