package com.java1910.academyWithInterface.views.interfaceObjects;

import javax.swing.*;
import java.awt.*;

public class IOStudent extends JPanel {

    IODateBox startDateBox;
    IODateBox finishDateBox;
    JComboBox groupComboBox;
    JComboBox contractComboBox;

    public IOStudent() {
        super();
        init();
        setLayout(new GridLayout(3, 2, 5, 5));
    }

    private void init() {
        /**
         * Создание компонентов для ввода данных о Student
         */
        JLabel startDateLabel = new JLabel("Дата поступления: ");
        startDateLabel.setHorizontalAlignment(startDateLabel.RIGHT);

        JLabel finishDateLabel = new JLabel("Дата выпуска: ");
        finishDateLabel.setHorizontalAlignment(finishDateLabel.RIGHT);

        JLabel diplomaLabel = new JLabel("Диплом: ");
        diplomaLabel.setHorizontalAlignment(diplomaLabel.RIGHT);
        JTextField diplomaTextField = new JTextField(30);

        JLabel groupLabel = new JLabel("Группа: ");
        groupLabel.setHorizontalAlignment(groupLabel.RIGHT);
        groupComboBox = new JComboBox();

        JLabel contractLabel = new JLabel("Контракт: ");
        contractLabel.setHorizontalAlignment(contractLabel.RIGHT);
        contractComboBox = new JComboBox();

        /*
         * Панель для ComboBox
         */
        startDateBox = new IODateBox();
        finishDateBox = new IODateBox();

        add(startDateLabel);
        add(startDateBox);
        add(diplomaLabel);
        add(diplomaTextField);
        add(finishDateLabel);
        add(finishDateBox);
        add(groupLabel);
        add(groupComboBox);
        add(contractLabel);
        add(contractComboBox);
    }

    public IODateBox getStartDateBox() {
        return startDateBox;
    }

    public void setStartDateBox(IODateBox startDateBox) {
        this.startDateBox = startDateBox;
    }

    public IODateBox getFinishDateBox() {
        return finishDateBox;
    }

    public void setFinishDateBox(IODateBox finishDateBox) {
        this.finishDateBox = finishDateBox;
    }

    public JComboBox getGroupComboBox() {
        return groupComboBox;
    }

    public void setGroupComboBox(JComboBox groupComboBox) {
        this.groupComboBox = groupComboBox;
    }

    public JComboBox getContractComboBox() {
        return contractComboBox;
    }

    public void setContractComboBox(JComboBox contractComboBox) {
        this.contractComboBox = contractComboBox;
    }

    @Override
    public String toString() {
        return "IOStudent{" +
                "startDateBox=" + startDateBox +
                ", finishDateBox=" + finishDateBox +
                '}';
    }
}
