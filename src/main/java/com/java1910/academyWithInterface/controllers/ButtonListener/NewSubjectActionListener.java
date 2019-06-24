package com.java1910.academyWithInterface.controllers.ButtonListener;

import com.java1910.academyWithInterface.views.Windows.SubjectWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Листенер для кнопки "Добавить предмет"
 * Вызывает окно создания нового предмета
 */
public class NewSubjectActionListener implements ActionListener{

    public NewSubjectActionListener() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        SubjectWindow subjectWindow = new SubjectWindow();
    }
}
