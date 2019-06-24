package com.java1910.academyWithInterface;


import com.java1910.academyWithInterface.views.authorizationInterface.AuthorizationWindow;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                new AuthorizationWindow();
            }
        });
    }

}
