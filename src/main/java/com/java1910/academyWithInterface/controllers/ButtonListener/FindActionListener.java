package com.java1910.academyWithInterface.controllers.ButtonListener;


import com.java1910.academyWithInterface.views.Windows.FindWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FindActionListener implements ActionListener{


    @Override
    public void actionPerformed(ActionEvent e) {
        FindWindow findWindow = new FindWindow();
    }
}
