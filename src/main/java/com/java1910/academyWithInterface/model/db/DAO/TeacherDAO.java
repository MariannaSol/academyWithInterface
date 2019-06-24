package com.java1910.academyWithInterface.model.db.DAO;

import com.java1910.academyWithInterface.model.db.entities.Teacher;

import java.util.List;

public interface TeacherDAO {
    List<Teacher> findAll();
    Teacher findById(long id);

    boolean save(Teacher teacher);

    boolean delete(Teacher teacher);
}
