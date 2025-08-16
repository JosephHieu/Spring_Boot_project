package com.JosephHieu.cruddemo.dao;

import com.JosephHieu.cruddemo.entity.Instructor;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorByID(int theId);
}
