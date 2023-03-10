package com.genspark.SpringBootDemoApplication.Dao;

import com.genspark.SpringBootDemoApplication.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDao extends JpaRepository<Course, Integer> {
}
