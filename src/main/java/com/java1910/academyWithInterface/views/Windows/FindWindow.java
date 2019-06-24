package com.java1910.academyWithInterface.views.Windows;


import com.java1910.academyWithInterface.views.interfaceObjects.*;

import javax.swing.*;
import java.awt.*;

public class FindWindow {

    JFrame findFrame = new JFrame("Поиск");
    String []groupList = {"группа1", "группа2", "группа3"};
    String []formList = {"форма1", "форма2", "форма3"};
    String []nameList = {"имя1", "имя2", "имя3"};
    String []subjectList = {"предмет1", "предмет2", "предмет3"};
    String []contractList = {"contract1", "contract2", "contract3"};

    public FindWindow() {
        findFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        findFrame.setSize(1200, 500);
        findFrame.setLocationRelativeTo(null);
        findFrame.setLayout(new GridLayout(2, 1, 5, 5));

        JPanel criteriaPanel = new JPanel();
        criteriaPanel.setLayout(new GridLayout(3, 2, 10, 10));
        criteriaPanel.setBorder(BorderFactory.createTitledBorder("Параметры поиска"));

        IOCriteriaComponent groupFind = new IOCriteriaComponent("Группа:", groupList);
        IOCriteriaComponent formFind = new IOCriteriaComponent("Форма:", formList);
        IOCriteriaComponent nameFind = new IOCriteriaComponent("Имя:", nameList);
        IOCriteriaComponent subjectFind = new IOCriteriaComponent("Предмет:", subjectList);
        IOCriteriaComponent contractFind = new IOCriteriaComponent("Контракт:", contractList);

        JPanel idPanel = new JPanel();
        idPanel.setLayout(null);
        idPanel.setSize(200, 40);

        JCheckBox idCheckBox = new JCheckBox("id:");
        idCheckBox.setBounds(5, 5, 50, 20);

        JTextField idTextField = new JTextField();
        idTextField.setBounds(90, 5, 220, 35);
        idPanel.add(idCheckBox);
        idPanel.add(idTextField);

        criteriaPanel.add(nameFind);
        criteriaPanel.add(subjectFind);
        criteriaPanel.add(formFind);
        criteriaPanel.add(groupFind);
        criteriaPanel.add(contractFind);
        criteriaPanel.add(idPanel);

        // Панель результатов
        JPanel resultPanel = new JPanel();
        resultPanel.setBorder(BorderFactory.createTitledBorder("Результаты"));
        resultPanel.setLayout(new GridLayout(1, 1));

        IOTableModel tableModel = new IOTableModel(11, new ResultTable(11));
        JTable resultTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(resultTable);

        resultPanel.add(scrollPane);

        findFrame.add(criteriaPanel);
        findFrame.add(resultPanel);
        findFrame.setVisible(true);
    }
}
