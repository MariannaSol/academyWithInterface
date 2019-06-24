package com.java1910.academyWithInterface.model.db.DAO;


import com.java1910.academyWithInterface.model.db.entities.Person;

import java.util.Date;
import java.util.List;

public interface PersonDAO {
    int FLAG_NAME = 1;
    int FLAG_PASSPORT = FLAG_NAME << 1;
    int FLAG_PHONE = FLAG_PASSPORT << 1;


    List<Person> findAll();
    Person findById(long id);
    List<Person> findByName(String name);
    List<Person> findByPassport(String passport);
    List<Person> findByBirthday(Date birthday);

    boolean save(Person person);
    boolean delete(Person person);

    List<Person> findBy(int flags, Object... values);

}
