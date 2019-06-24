package com.java1910.academyWithInterface.views.Windows;


import com.java1910.academyWithInterface.controllers.ButtonListener.SaveNewTeacherActionListener;
import com.java1910.academyWithInterface.views.interfaceObjects.IOPerson;

import javax.swing.*;

public class TeacherWindow {

    JFrame teacherFrame = new JFrame("Новый преподаватель");
    JTextField salaryTextField;
    IOPerson ioPerson;

    public TeacherWindow() {
        teacherFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        teacherFrame.setSize(730, 240);
        teacherFrame.setLocationRelativeTo(null);
        teacherFrame.setLayout(null);

        ioPerson = new IOPerson();
        ioPerson.setBounds(5, 5, 700, 50);

        JLabel salaryLabel = new JLabel("Зарплата:");
        salaryLabel.setHorizontalAlignment(salaryLabel.TRAILING);
        salaryLabel.setBounds(445, 65, 80, 20);

        salaryTextField = new JTextField();
        salaryTextField.setBounds(535, 60, 100, 25);

        JButton saveTeacherButton = new JButton("Сохранить");
        saveTeacherButton.setBounds(310, 140, 150, 50);

        saveTeacherButton.addActionListener(new SaveNewTeacherActionListener(ioPerson, salaryTextField));

        teacherFrame.add(ioPerson);
        teacherFrame.add(salaryLabel);
        teacherFrame.add(salaryTextField);
        teacherFrame.add(saveTeacherButton);
        teacherFrame.setVisible(true);
    }

    public JTextField getSalaryTextField() {
        return salaryTextField;
    }

    public void setSalaryTextField(JTextField salaryTextField) {
        this.salaryTextField = salaryTextField;
    }

    public IOPerson getIoPerson() {
        return ioPerson;
    }

    public void setIoPerson(IOPerson ioPerson) {
        this.ioPerson = ioPerson;
    }
}
