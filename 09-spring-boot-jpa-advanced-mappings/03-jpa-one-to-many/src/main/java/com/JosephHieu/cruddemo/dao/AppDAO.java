package com.JosephHieu.cruddemo.dao;

import com.JosephHieu.cruddemo.entity.Course;
import com.JosephHieu.cruddemo.entity.Instructor;
import com.JosephHieu.cruddemo.entity.InstructorDetail;

import java.util.List;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorByID(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorDetailById(int theId);

    List<Course> findCoursesByInstructorID(int theId);
}
