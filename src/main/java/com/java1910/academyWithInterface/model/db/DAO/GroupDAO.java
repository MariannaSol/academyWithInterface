package com.java1910.academyWithInterface.model.db.DAO;


import com.java1910.academyWithInterface.model.db.entities.Group;

public interface GroupDAO {
    Group findById(long id);

    boolean save(Group p);

    boolean delete(Group p);
}
