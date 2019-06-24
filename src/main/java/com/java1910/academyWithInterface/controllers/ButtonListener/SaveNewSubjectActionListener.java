package com.java1910.academyWithInterface.controllers.ButtonListener;


import com.java1910.academyWithInterface.model.db.DAO.SpecializationDAO;
import com.java1910.academyWithInterface.model.db.DAO.SubjectDAO;
import com.java1910.academyWithInterface.model.db.DAO.impl.hibernate.HibernateSpecializationDAO;
import com.java1910.academyWithInterface.model.db.DAO.impl.hibernate.HibernateSubjectDAO;
import com.java1910.academyWithInterface.model.db.entities.Specialization;
import com.java1910.academyWithInterface.model.db.entities.Subject;
import com.java1910.academyWithInterface.model.db.utils.HibernateUtils;
import com.java1910.academyWithInterface.views.interfaceObjects.IOSubject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaveNewSubjectActionListener implements ActionListener{

    IOSubject ioSubject;

    public SaveNewSubjectActionListener(IOSubject ioSubject) {
        this.ioSubject = ioSubject;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try (HibernateUtils hibernateUtils = new HibernateUtils()) {
            SubjectDAO subjectDAO = new HibernateSubjectDAO(hibernateUtils);
            SpecializationDAO specializationDAO = new HibernateSpecializationDAO(hibernateUtils);

            Subject subject;
            Specialization spec;

            subject = new Subject(ioSubject.getNameSubjectTextField().getText());
            spec = new Specialization((String) ioSubject.getSpecComboBox().getSelectedItem());

            subjectDAO.save(subject);
            specializationDAO.save(spec);
        }
    }
}
