package com.java1910.academyWithInterface.controllers.ButtonListener;


import com.java1910.academyWithInterface.views.Windows.GroupWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewGroupActionListener implements ActionListener {

    public NewGroupActionListener() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        GroupWindow groupWindow = new GroupWindow();
    }
}
