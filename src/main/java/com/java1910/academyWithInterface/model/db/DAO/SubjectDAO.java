package com.java1910.academyWithInterface.model.db.DAO;


import com.java1910.academyWithInterface.model.db.entities.Subject;

import java.util.List;

public interface SubjectDAO {
    Subject findById(long id);
    List<Subject> findAll();
    boolean save(Subject subject);
    boolean delete(Subject subject);
}
