package com.java1910.academyWithInterface.views.Windows;


import com.java1910.academyWithInterface.controllers.ButtonListener.SaveNewStudentActionListener;
import com.java1910.academyWithInterface.views.interfaceObjects.IOPerson;
import com.java1910.academyWithInterface.views.interfaceObjects.IOStudent;
import com.java1910.academyWithInterface.views.interfaceObjects.IOTableModel;
import com.java1910.academyWithInterface.views.interfaceObjects.ResultTable;

import javax.swing.*;
import java.awt.*;

public class StudentWindow {
    
    JFrame studentFrame = new JFrame("Новый студент");
    
    public StudentWindow() {
        studentFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        studentFrame.setSize(730, 640);
        studentFrame.setLocationRelativeTo(null);
        studentFrame.setLayout(new GridLayout(2, 1, 5, 5));

        IOPerson ioPerson = new IOPerson();
        ioPerson.setBounds(5, 5, 700, 50);

        IOStudent ioStudent = new IOStudent();
        ioStudent.setBounds(5, 100, 700, 80);

        JButton saveButton = new JButton("Сохранить");
        saveButton.setBounds(310, 200, 150, 50);

        IOTableModel tableModel = new IOTableModel(11, new ResultTable(11));
        JTable resultTable = new JTable(tableModel);
        JScrollPane resultTableScrollPane = new JScrollPane(resultTable);
        resultTableScrollPane.setBounds(5, 280, 700, 300);

        JPanel dataPanel = new JPanel();
        dataPanel.setLayout(null);
        dataPanel.add(ioPerson);
        dataPanel.add(ioStudent);
        dataPanel.add(saveButton);

        JPanel tablePanel = new JPanel();
        tablePanel.setLayout(new GridLayout(1,1));
        tablePanel.add(resultTableScrollPane);

        saveButton.addActionListener(new SaveNewStudentActionListener(ioPerson, ioStudent));

        studentFrame.add(dataPanel);
        studentFrame.add(tablePanel);
        studentFrame.setVisible(true);
    }


}
