package com.java1910.academyWithInterface.views.authorizationInterface;


import javax.swing.*;

public class AccountWindow extends JFrame {

    JFrame accountWindow = new JFrame("Новая учётная запись");

    public AccountWindow() {

        // Установка параметров главного окна
        accountWindow.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        accountWindow.setSize(400, 270);
        accountWindow.setLocationRelativeTo(null);
        accountWindow.setLayout(null);

        JLabel loginLabel = new JLabel("Логин:");
        loginLabel.setHorizontalAlignment(loginLabel.RIGHT);
        loginLabel.setBounds(5, 5, 100, 50);

        JTextField loginTextField = new JTextField();
        loginTextField.setBounds(120, 20, 200, 25);


        JLabel passLabel = new JLabel("Пароль:");
        passLabel.setHorizontalAlignment(passLabel.RIGHT);
        passLabel.setBounds(5, 45, 100, 50);

        JTextField passTextField = new JTextField();
        passTextField.setBounds(120, 60, 200, 25);

        JLabel basePassLabel = new JLabel("Пароль БД:");
        basePassLabel.setHorizontalAlignment(passLabel.RIGHT);
        basePassLabel.setBounds(5, 90, 100, 50);

        JTextField basePassTextField = new JTextField();
        basePassTextField.setBounds(120, 100, 200, 25);

        JButton createAccountButton = new JButton("Создать");
        createAccountButton.setBounds(150, 160, 100, 50);

        accountWindow.add(loginLabel);
        accountWindow.add(loginTextField);
        accountWindow.add(passLabel);
        accountWindow.add(passTextField);
        accountWindow.add(createAccountButton);
        accountWindow.add(basePassLabel);
        accountWindow.add(basePassTextField);

        accountWindow.setVisible(true);
    }

}
