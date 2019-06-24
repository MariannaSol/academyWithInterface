package com.java1910.academyWithInterface.views.authorizationInterface;


import com.java1910.academyWithInterface.controllers.ButtonListener.OkButtonActionListener;

import javax.swing.*;

public class AuthorizationWindow {
    
    JFrame authorizationWindow = new JFrame("Вход в систему");

    public AuthorizationWindow() {
        /*
         * Установка параметров главного окна
         */
        authorizationWindow.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        authorizationWindow.setSize(500, 320);
        authorizationWindow.setLocationRelativeTo(null);
        authorizationWindow.setLayout(null);

        JLabel loginLabel = new JLabel("Логин:");
        loginLabel.setHorizontalAlignment(loginLabel.RIGHT);
        loginLabel.setBounds(90, 40, 100, 50);

        JTextField loginTextField = new JTextField();
        loginTextField.setBounds(200, 50, 150, 25);


        JLabel passLabel = new JLabel("Пароль:");
        passLabel.setHorizontalAlignment(passLabel.RIGHT);
        passLabel.setBounds(90, 100, 100, 50);

        JPasswordField passField = new JPasswordField();
        passField.setBounds(200, 110, 150, 25);

        JLabel createAccountLabel = new JLabel("Создать учётную запись");
        createAccountLabel.setHorizontalAlignment(passLabel.RIGHT);
        createAccountLabel.setBounds(140, 160, 150, 50);

        JCheckBox newAccountCheckBox = new JCheckBox();
        newAccountCheckBox.setBounds(300, 160, 50, 50);

        JButton okButton = new JButton("OK");
        okButton.setBounds(200, 225, 100, 50);


        authorizationWindow.add(loginLabel);
        authorizationWindow.add(loginTextField);

        authorizationWindow.add(passLabel);
        authorizationWindow.add(passField);

        authorizationWindow.add(createAccountLabel);
        authorizationWindow.add(newAccountCheckBox);

        authorizationWindow.add(okButton);

        okButton.addActionListener(new OkButtonActionListener(newAccountCheckBox, authorizationWindow));
        authorizationWindow.setVisible(true);

    }
}
