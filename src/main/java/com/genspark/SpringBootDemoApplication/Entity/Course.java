package com.genspark.SpringBootDemoApplication.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="tbl_courses")
public class Course {

    @Id
    @Column(name="c_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int courseID;

    @Column(name="c_title")
    private String title;

    @Column(name="c_instructor")
    private String instructor;

    public Course() {
    }

    public Course(String title, String instructor) {
        this.title = title;
        this.instructor = instructor;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
}
