package com.java1910.academyWithInterface.views.interfaceObjects;


import javax.swing.*;

public class IOCriteriaComponent extends JPanel {

    public IOCriteriaComponent(String textLabel, String[] list) {
        super();
        setLayout(null);
        init(textLabel, list);
    }

    private void init(String textLabel, String []list) {
        JCheckBox checkBox = new JCheckBox(textLabel);
        checkBox.setBounds(5, 5, 85, 20);

        JComboBox comboBox = new JComboBox(list);
        comboBox.setBounds(90, 5, 220, 35);

        add(checkBox);
        add(comboBox);
    }

}
