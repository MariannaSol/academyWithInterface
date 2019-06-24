package com.java1910.academyWithInterface.controllers.ButtonListener;


import com.java1910.academyWithInterface.model.db.DAO.FormDAO;
import com.java1910.academyWithInterface.model.db.DAO.GroupDAO;
import com.java1910.academyWithInterface.model.db.DAO.SpecializationDAO;
import com.java1910.academyWithInterface.model.db.DAO.impl.hibernate.HibernateFormDAO;
import com.java1910.academyWithInterface.model.db.DAO.impl.hibernate.HibernateGroupDAO;
import com.java1910.academyWithInterface.model.db.DAO.impl.hibernate.HibernateSpecializationDAO;
import com.java1910.academyWithInterface.model.db.entities.Form;
import com.java1910.academyWithInterface.model.db.entities.Group;
import com.java1910.academyWithInterface.model.db.entities.Specialization;
import com.java1910.academyWithInterface.model.db.utils.HibernateUtils;
import com.java1910.academyWithInterface.views.interfaceObjects.IOGroup;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaveNewGroupActionListener implements ActionListener {

    IOGroup ioGroup;

    public SaveNewGroupActionListener(IOGroup ioGroup) {
        this.ioGroup = ioGroup;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try (HibernateUtils hibernateUtils = new HibernateUtils()) {
            // Инициализация
            GroupDAO groupDAO = new HibernateGroupDAO(hibernateUtils);
            SpecializationDAO specializationDAO = new HibernateSpecializationDAO(hibernateUtils);
            FormDAO formDAO = new HibernateFormDAO(hibernateUtils);

            // Создаем сущность
            Group group;
            Specialization spec;
            Form form;

            if(ioGroup.getFormCheckBox().isSelected()) {
                form = new Form((String) ioGroup.getFormComboBox().getSelectedItem());
                formDAO.save(form);
            }
            else {
                form = new Form(ioGroup.getFormTextField().getText());
            }

            if(ioGroup.getSpecCheckBox().isSelected()) {
                spec = new Specialization((String) ioGroup.getSpecComboBox().getSelectedItem());
                specializationDAO.save(spec);
            }
            else {
                spec = new Specialization(ioGroup.getSpecTextField().getText());
            }

            group = new Group((String) ioGroup.getNameTextField().getText(), form, spec);

            specializationDAO.save(spec);
            formDAO.save(form);
            groupDAO.save(group);
        }
    }
}
