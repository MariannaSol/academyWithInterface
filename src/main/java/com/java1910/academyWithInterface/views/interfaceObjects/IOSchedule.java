package com.java1910.academyWithInterface.views.interfaceObjects;


import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class IOSchedule extends JPanel{

    List<JCheckBox> lessons = new ArrayList<JCheckBox>();
    List<JComboBox> boxes = new ArrayList<JComboBox>();

    String[] numLess = {"1", "2", "3", "4", "5", "6", "7"};

    // stepY, stepY1 - шаг изменения расположения JCheckBox и JComboBox
    int stepY = 40,
        stepY1 = 40;

    int newStep = 10,
        newStep1 = 5;

    public IOSchedule() {
        super();
        init();
        setLayout(null);
    }

    private void init() {

        for (int i = 0; i < 7; i++) {
            JCheckBox dynamicCheckBox = new JCheckBox(numLess[i]);
            JComboBox dynamicComboBox = new JComboBox();

            dynamicCheckBox.setBounds(5, newStep1, 50, 30);
            dynamicComboBox.setBounds(60, newStep, 170, 30);

            lessons.add(dynamicCheckBox);
            boxes.add(dynamicComboBox);

            add(lessons.get(i));
            add(boxes.get(i));

            newStep1 += stepY1;
            newStep += stepY;
        }
    }
}
