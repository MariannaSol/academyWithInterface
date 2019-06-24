package com.java1910.academyWithInterface.controllers.WindowListener;

import com.java1910.academyWithInterface.model.db.DAO.SpecializationDAO;
import com.java1910.academyWithInterface.model.db.DAO.impl.hibernate.HibernateSpecializationDAO;
import com.java1910.academyWithInterface.model.db.entities.Specialization;
import com.java1910.academyWithInterface.model.db.utils.HibernateUtils;
import com.java1910.academyWithInterface.views.interfaceObjects.IOSubject;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.List;

public class SubjectWindowListener extends WindowAdapter implements WindowListener {

    IOSubject ioSubject;

    public SubjectWindowListener(IOSubject ioSubject) {
        this.ioSubject = ioSubject;
    }

    @Override
    public void windowOpened(WindowEvent e) {
        try (HibernateUtils hibernateUtils = new HibernateUtils()) {

            SpecializationDAO specializationDAO = new HibernateSpecializationDAO(hibernateUtils);

            Specialization spec = new Specialization();

            ioSubject.getSpecComboBox().addItem((display(specializationDAO.findAll())));
        }
    }

    private String[] display(List list) {
        List data = new ArrayList<>();
       // Specialization spec = new Specialization();

        for(Object o: list) {
            Specialization spec = (Specialization) o;
            data.add(spec.getName());
        }
        return (String[]) data.toArray(new String[data.size()]);
    }
}
