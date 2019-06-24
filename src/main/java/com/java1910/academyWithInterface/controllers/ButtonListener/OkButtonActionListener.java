package com.java1910.academyWithInterface.controllers.ButtonListener;


import com.java1910.academyWithInterface.views.authorizationInterface.AccountWindow;
import com.java1910.academyWithInterface.views.Windows.MainWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OkButtonActionListener implements ActionListener{

    JCheckBox jCheckBox;
    JFrame jFrame;

    public OkButtonActionListener(JCheckBox jCheckBox, JFrame jFrame) {
        this.jCheckBox = jCheckBox;
        this.jFrame = jFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(jCheckBox.isSelected()) {
            AccountWindow accountWindow = new AccountWindow();
            jCheckBox.setSelected(false);
        }

        else {
            jFrame.dispose();
            MainWindow mainWindow = new MainWindow();
        }
    }
}
