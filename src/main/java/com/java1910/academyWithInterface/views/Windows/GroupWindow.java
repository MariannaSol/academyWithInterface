package com.java1910.academyWithInterface.views.Windows;


import com.java1910.academyWithInterface.controllers.ButtonListener.SaveNewGroupActionListener;
import com.java1910.academyWithInterface.views.interfaceObjects.IOGroup;

import javax.swing.*;

public class GroupWindow {
    
    JFrame groupFrame = new JFrame("Новая группа");
    JTextField nameTextField;
    JTextField formTextField;
    JTextField specTextField;
    
    public GroupWindow() {
        groupFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        groupFrame.setSize(600, 270);
        groupFrame.setLocationRelativeTo(null);
        groupFrame.setLayout(null);

        IOGroup ioGroup = new IOGroup();
        ioGroup.setBounds(5, 5, 590, 170);

        JButton saveGroup = new JButton("Сохранить");
        saveGroup.setBounds(250, 185, 100, 40);

        saveGroup.addActionListener(new SaveNewGroupActionListener(ioGroup));

        groupFrame.add(ioGroup);
        groupFrame.add(saveGroup);
        groupFrame.setVisible(true);
    }

    public JFrame getGroupFrame() {
        return groupFrame;
    }

    public void setGroupFrame(JFrame groupFrame) {
        this.groupFrame = groupFrame;
    }

    public JTextField getNameTextField() {
        return nameTextField;
    }

    public void setNameTextField(JTextField nameTextField) {
        this.nameTextField = nameTextField;
    }

    public JTextField getFormTextField() {
        return formTextField;
    }

    public void setFormTextField(JTextField formTextField) {
        this.formTextField = formTextField;
    }

    public JTextField getSpecTextField() {
        return specTextField;
    }

    public void setSpecTextField(JTextField specTextField) {
        this.specTextField = specTextField;
    }
}
