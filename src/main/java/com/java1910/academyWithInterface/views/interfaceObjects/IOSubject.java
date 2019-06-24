package com.java1910.academyWithInterface.views.interfaceObjects;


import javax.swing.*;

public class IOSubject extends JPanel{

    JTextField nameSubjectTextField;
    JComboBox specComboBox;

    public IOSubject() {
        super();
        init();
        setLayout(null);
    }

    private void init() {
        JLabel nameLabel = new JLabel("Название предмета:");
        nameLabel.setHorizontalAlignment(nameLabel.TRAILING);
        nameLabel.setBounds(60, 20, 140, 30);

        nameSubjectTextField = new JTextField();
        nameSubjectTextField.setBounds(45, 60, 200, 30);

        JLabel specLabel = new JLabel("Специализация:");
        specLabel.setHorizontalAlignment(nameLabel.CENTER);
        specLabel.setBounds(60, 100, 140, 30);

        specComboBox = new JComboBox();
        specComboBox.setBounds(45, 140, 200, 30);

        add(nameLabel);
        add(nameSubjectTextField);
        add(specLabel);
        add(specComboBox);

    }

    public JTextField getNameSubjectTextField() {
        return nameSubjectTextField;
    }

    public void setNameSubjectTextField(JTextField nameSubjectTextField) {
        this.nameSubjectTextField = nameSubjectTextField;
    }

    public JComboBox getSpecComboBox() {
        return specComboBox;
    }

    public void setSpecComboBox(JComboBox specComboBox) {
        this.specComboBox = specComboBox;
    }

    @Override
    public String toString() {
        return specComboBox.getItemListeners().toString();
    }
}
