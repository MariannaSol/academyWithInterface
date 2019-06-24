package com.java1910.academyWithInterface.controllers.ButtonListener;


import com.java1910.academyWithInterface.views.Windows.StudentWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Запуск окна создания нового студента
 */

public class NewStudentActionListener implements ActionListener{

    public NewStudentActionListener() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        StudentWindow studentWindow = new StudentWindow();
    }
}
