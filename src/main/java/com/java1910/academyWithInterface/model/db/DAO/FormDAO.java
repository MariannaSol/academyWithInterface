package com.java1910.academyWithInterface.model.db.DAO;


import com.java1910.academyWithInterface.model.db.entities.Form;

/**
 * Created by Admin on 07.11.14.
 */
public interface FormDAO {

    Form findById(long id);
    boolean save(Form form);
    boolean delete(Form form);
}
