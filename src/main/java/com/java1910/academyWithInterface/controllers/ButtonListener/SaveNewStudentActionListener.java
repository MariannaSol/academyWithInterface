package com.java1910.academyWithInterface.controllers.ButtonListener;

import com.java1910.academyWithInterface.model.db.DAO.*;
import com.java1910.academyWithInterface.model.db.DAO.impl.hibernate.*;
import com.java1910.academyWithInterface.model.db.entities.*;
import com.java1910.academyWithInterface.model.db.utils.HibernateUtils;
import com.java1910.academyWithInterface.views.interfaceObjects.IOPerson;
import com.java1910.academyWithInterface.views.interfaceObjects.IOStudent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Сохраняет нового студента в БД
 */
public class SaveNewStudentActionListener implements ActionListener {

    IOPerson ioPerson;
    IOStudent ioStudent;

    public SaveNewStudentActionListener(IOPerson ioPerson, IOStudent ioStudent) {
        this.ioPerson = ioPerson;
        this.ioStudent = ioStudent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try (HibernateUtils hibernateUtils = new HibernateUtils()) {
            //Инициализация
            PersonDAO personDAO = new HibernatePersonDAO(hibernateUtils);
            GroupDAO groupDAO = new HibernateGroupDAO(hibernateUtils);
            ContractDAO contractDAO = new HibernateContractDAO(hibernateUtils);

            //Создаем сущность
            Person person;
            Student student;
            Group group;
            Contract contract;
            Specialization spec = null;
            Form form = null;

            person = new Person(ioPerson.getNameField().getText(), null,
                    ioPerson.getPassportField().getText(),
                    ioPerson.getPhoneField().getText());

            group = new Group((String) ioStudent.getGroupComboBox().getSelectedItem(), form, spec);

            contract = new Contract((String) ioStudent.getContractComboBox().getSelectedItem());

            student = new Student(null, null, person, group, contract);

            person.addStudent(student);

            contractDAO.save(contract);
            groupDAO.save(group);
            personDAO.save(person);
        }
    }
}
