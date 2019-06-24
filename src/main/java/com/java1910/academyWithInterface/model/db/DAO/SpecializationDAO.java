package com.java1910.academyWithInterface.model.db.DAO;

import com.java1910.academyWithInterface.model.db.entities.Specialization;

import java.util.List;

public interface SpecializationDAO {
    Specialization findById(long id);
    List<Specialization> findAll();
    boolean save(Specialization specialization);
    boolean delete(Specialization specialization);
}
