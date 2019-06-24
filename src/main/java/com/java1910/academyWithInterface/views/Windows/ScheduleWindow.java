package com.java1910.academyWithInterface.views.Windows;


import com.java1910.academyWithInterface.views.interfaceObjects.IOCriteriaComponent;
import com.java1910.academyWithInterface.views.interfaceObjects.IOTableModel;
import com.java1910.academyWithInterface.views.interfaceObjects.ScheduleTable;

import javax.swing.*;
import java.awt.*;

public class ScheduleWindow {
    
    JFrame scheduleFrame = new JFrame("Расписание");
    String []group = {"group1", "group2", "group3"};
    String []day = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    String  []teacher = {"teach1", "teach2", "teach3"};
    
    public ScheduleWindow() {
        // Установка параметров главного окна
        scheduleFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        scheduleFrame.setSize(730, 710);
        scheduleFrame.setLocationRelativeTo(null);
        scheduleFrame.setLayout(null);

        JPanel schedulePanel = new JPanel();
        schedulePanel.setLayout(new GridLayout(1, 1));
        schedulePanel.setBounds(5, 5, 700, 450);

        JPanel menuPanel = new JPanel();
        menuPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        menuPanel.setBounds(5, 460, 700, 200);
        menuPanel.setLayout(null);

        IOTableModel tableModel = new IOTableModel(5, new ScheduleTable(5));
        JTable scheduleTable = new JTable(tableModel);

        JScrollPane scheduleTableScrollPane = new JScrollPane(scheduleTable);
        schedulePanel.add(scheduleTableScrollPane);

        // Создаем компоненты меню
        IOCriteriaComponent groupCriteriaComponent = new IOCriteriaComponent("Группа: ", group);
        groupCriteriaComponent.setBounds(5, 5, 350, 40);

        IOCriteriaComponent dayCriteriaComponent = new IOCriteriaComponent("День", day);
        dayCriteriaComponent.setBounds(5, 50, 350, 40);

        IOCriteriaComponent teacherCriteriaComponent = new IOCriteriaComponent("Преподаватель", teacher);
        teacherCriteriaComponent.setBounds(5, 95, 350, 40);

        // Добавляем на панель меню
        menuPanel.add(groupCriteriaComponent);
        menuPanel.add(dayCriteriaComponent);
        menuPanel.add(teacherCriteriaComponent);

        scheduleFrame.add(schedulePanel);
        scheduleFrame.add(menuPanel);
        scheduleFrame.setVisible(true);
    }
}
