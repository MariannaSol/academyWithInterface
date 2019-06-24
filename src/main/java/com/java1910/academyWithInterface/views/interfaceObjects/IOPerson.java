package com.java1910.academyWithInterface.views.interfaceObjects;


import javax.swing.*;
import java.awt.*;

public class IOPerson extends JPanel{
    JTextField nameField;
    JTextField passportField;
    JTextField phoneField;
    IODateBox ioDateBox;

    public IOPerson() {
        super();
        init();
        setLayout(new GridLayout(2, 4, 5, 5));
    }

    private void init() {
        /*
         * Создание полей ввода данный о Person
         */
        JLabel nameLabel = new JLabel("Имя: ");
        nameLabel.setHorizontalAlignment(nameLabel.RIGHT);
        nameField = new JTextField(30);

        JLabel passportLabel = new JLabel("Паспорт: ");
        passportLabel.setHorizontalAlignment(passportLabel.RIGHT);
        passportField = new JTextField(8);

        JLabel phoneLabel = new JLabel("Телефон: ");
        phoneLabel.setHorizontalAlignment(phoneLabel.RIGHT);
        phoneField = new JTextField(11);

        JLabel birthdayDateLabel = new JLabel("День рождения: ");
        birthdayDateLabel.setHorizontalAlignment(birthdayDateLabel.RIGHT);
        ioDateBox = new IODateBox();

        add(nameLabel);
        add(nameField);
        add(birthdayDateLabel);
        add(ioDateBox);
        add(passportLabel);
        add(passportField);
        add(phoneLabel);
        add(phoneField);
    }

    public JTextField getNameField() {
        return nameField;
    }

    public void setNameField(JTextField nameField) {
        this.nameField = nameField;
    }

    public JTextField getPassportField() {
        return passportField;
    }

    public void setPassportField(JTextField passportField) {
        this.passportField = passportField;
    }

    public JTextField getPhoneField() {
        return phoneField;
    }

    public void setPhoneField(JTextField phoneField) {
        this.phoneField = phoneField;
    }

    public IODateBox getIODateBox() {
        return ioDateBox;
    }

    public void setIODateBox(IODateBox ioDateBox) {
        this.ioDateBox = ioDateBox;
    }


}
