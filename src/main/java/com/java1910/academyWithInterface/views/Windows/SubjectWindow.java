package com.java1910.academyWithInterface.views.Windows;


import com.java1910.academyWithInterface.controllers.ButtonListener.SaveNewSubjectActionListener;
import com.java1910.academyWithInterface.controllers.WindowListener.SubjectWindowListener;
import com.java1910.academyWithInterface.views.interfaceObjects.IOSubject;

import javax.swing.*;

public class SubjectWindow {
    
    JFrame subjectFrame = new JFrame("Новый предмет");
    
    public SubjectWindow() {
        subjectFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        subjectFrame.setSize(300, 350);
        subjectFrame.setLocationRelativeTo(null);
        subjectFrame.setLayout(null);

        IOSubject ioSubject = new IOSubject();
        ioSubject.setBounds(5, 5, 280, 200);

        JButton subjectButton = new JButton("Сохранить");
        subjectButton.setBounds(80, 250, 120, 50);

        subjectButton.addActionListener(new SaveNewSubjectActionListener(ioSubject));

        subjectFrame.add(ioSubject);
        subjectFrame.add(subjectButton);
        subjectFrame.setVisible(true);

        subjectFrame.addWindowListener(new SubjectWindowListener(ioSubject));
    }
}
