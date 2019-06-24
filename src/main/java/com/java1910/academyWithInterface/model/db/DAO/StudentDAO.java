package com.java1910.academyWithInterface.model.db.DAO;


import com.java1910.academyWithInterface.model.db.entities.Student;

import java.util.List;

public interface StudentDAO {
    List<Student> findAll();
    Student findById(long id);

    boolean save(Student s);

    boolean delete(Student s);
}
