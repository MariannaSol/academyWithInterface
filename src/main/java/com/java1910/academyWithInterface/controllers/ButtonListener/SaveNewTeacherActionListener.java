package com.java1910.academyWithInterface.controllers.ButtonListener;

import com.java1910.academyWithInterface.model.db.DAO.PersonDAO;
import com.java1910.academyWithInterface.model.db.DAO.impl.hibernate.HibernatePersonDAO;
import com.java1910.academyWithInterface.model.db.entities.Person;
import com.java1910.academyWithInterface.model.db.entities.Teacher;
import com.java1910.academyWithInterface.model.db.utils.HibernateUtils;
import com.java1910.academyWithInterface.views.interfaceObjects.IOPerson;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

/**
 * Сохраняет нового преподавателя в БД
 */
public class SaveNewTeacherActionListener implements ActionListener{

    IOPerson ioPerson;
    JTextField salaryTextField;

    public SaveNewTeacherActionListener(IOPerson ioPerson, JTextField salaryTextField) {
        this.ioPerson = ioPerson;
        this.salaryTextField = salaryTextField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try (HibernateUtils hibernateUtils = new HibernateUtils()) {
            //Инициализация
            PersonDAO personDAO = new HibernatePersonDAO(hibernateUtils);

            //Создаем сущность
            Person person;
            Teacher teacher;
            person = new Person(ioPerson.getNameField().getText(), null,
                    ioPerson.getPassportField().getText(),
                    ioPerson.getPhoneField().getText());

            teacher = new Teacher(null, null, new BigDecimal(salaryTextField.getText()), person);
            person.addTeacher(teacher);
            personDAO.save(person);
        }
    }
}
