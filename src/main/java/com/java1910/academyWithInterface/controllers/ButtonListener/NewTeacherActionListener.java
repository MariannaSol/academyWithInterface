package com.java1910.academyWithInterface.controllers.ButtonListener;


import com.java1910.academyWithInterface.views.Windows.TeacherWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Запуск окна создания нового преподавателя
 */

public class NewTeacherActionListener implements ActionListener{

    public NewTeacherActionListener() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TeacherWindow teacherWindow = new TeacherWindow();
    }
}
