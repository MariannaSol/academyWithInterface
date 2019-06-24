package com.java1910.academyWithInterface.controllers.ButtonListener;


import com.java1910.academyWithInterface.views.Windows.ScheduleWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowScheduleActionListener implements ActionListener{

    public ShowScheduleActionListener() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ScheduleWindow scheduleWindow = new ScheduleWindow();
    }
}
