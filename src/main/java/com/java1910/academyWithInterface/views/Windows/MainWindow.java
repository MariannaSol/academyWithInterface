package com.java1910.academyWithInterface.views.Windows;


import com.java1910.academyWithInterface.controllers.ButtonListener.*;
import com.java1910.academyWithInterface.views.interfaceObjects.IOSchedule;
import com.java1910.academyWithInterface.views.interfaceObjects.IOTableModel;
import com.java1910.academyWithInterface.views.interfaceObjects.ScheduleTable;

import javax.swing.*;
import java.awt.*;

public class MainWindow {

    JFrame  mainWindow = new JFrame("Управление");
    
    public MainWindow() {
        
        // Установка параметров главного окна
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainWindow.setSize(730, 710);
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setLayout(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createTitledBorder("Создание расписания для..."));
        mainPanel.setBounds(5, 5, 700, 530);
        mainPanel.setLayout(null);

        IOTableModel tableModel = new IOTableModel(5, new ScheduleTable(5));
        JTable scheduleTable = new JTable(tableModel);

        JScrollPane scheduleScrollPane = new JScrollPane(scheduleTable);
        scheduleScrollPane.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        scheduleScrollPane.setBounds(300, 90, 385, 430);

        IOSchedule ioSchedule = new IOSchedule();
        ioSchedule.setBounds(30, 90, 230, 300);

        JLabel groupLabel = new JLabel("Группа:");
        groupLabel.setBounds(10, 30, 50, 20);

        JComboBox groupComboBox = new JComboBox();
        groupComboBox.setBounds(65, 30, 100, 20);

        JLabel numLess = new JLabel("Номер пары:");
        numLess.setBounds(10, 70, 100, 20);

        JLabel dayLabel= new JLabel("День:");
        dayLabel.setBounds(200, 30, 40, 20);

        JComboBox dayComboBox = new JComboBox();
        dayComboBox.setBounds(245, 30, 100, 20);

        JLabel teacherLabel= new JLabel("Преподаватель:");
        teacherLabel.setBounds(380, 30, 100, 20);

        JComboBox teacherComboBox = new JComboBox();
        teacherComboBox.setBounds(485, 30, 200, 20);

        JLabel scheduleLabel= new JLabel("Расписание для:");
        scheduleLabel.setBounds(300, 70, 200, 20);

        mainPanel.add(groupLabel);
        mainPanel.add(groupComboBox);
        mainPanel.add(dayLabel);
        mainPanel.add(dayComboBox);
        mainPanel.add(teacherLabel);
        mainPanel.add(teacherComboBox);
        mainPanel.add(numLess);
        mainPanel.add(ioSchedule);
        mainPanel.add(scheduleLabel);
        mainPanel.add(scheduleScrollPane);

        JPanel menuPanel = new JPanel();
        menuPanel.setBounds(5, 545, 700, 120);
        menuPanel.setLayout(new GridLayout(3, 3, 5, 5));

        JButton createScheduleButton = new JButton("Создать расписание");
        JButton createStudentButton = new JButton("Новый студент");
        JButton createTeacherButton = new JButton("Новый преподаватель");
        JButton createGroupButton = new JButton("Новая группа");
        JButton createSubjectButton = new JButton("Новый предмет");
        JButton showScheduleButton = new JButton("Показать расписание");
        JButton findButton = new JButton("Поиск...");

        menuPanel.add(createScheduleButton);
        menuPanel.add(showScheduleButton);
        menuPanel.add(createStudentButton);
        menuPanel.add(createTeacherButton);
        menuPanel.add(createGroupButton);
        menuPanel.add(createSubjectButton);
        menuPanel.add(findButton);

        createStudentButton.addActionListener(new NewStudentActionListener());
        createTeacherButton.addActionListener(new NewTeacherActionListener());
        createSubjectButton.addActionListener(new NewSubjectActionListener());
        createGroupButton.addActionListener(new NewGroupActionListener());
        findButton.addActionListener(new FindActionListener());
        showScheduleButton.addActionListener(new ShowScheduleActionListener());

        mainWindow.add(mainPanel);
        mainWindow.add(menuPanel);

        mainWindow.setVisible(true);
    }
}
