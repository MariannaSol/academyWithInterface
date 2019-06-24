package com.java1910.academyWithInterface.views.interfaceObjects;


import javax.swing.*;

public class IOGroup extends JPanel{
    JTextField nameTextField;
    JTextField formTextField;
    JTextField specTextField;

    JComboBox formComboBox;
    JComboBox specComboBox;

    JCheckBox formCheckBox;
    JCheckBox specCheckBox;

    public IOGroup() {
        super();
        init();
        setLayout(null);
    }

    private void init(){
        JLabel nameLabel = new JLabel("Название:");
        nameLabel.setHorizontalAlignment(SwingConstants.TRAILING);
        nameLabel.setBounds(45, 20, 70, 30);

        nameTextField = new JTextField();
        nameTextField.setBounds(120, 25, 200, 30);

        JLabel formLabel = new JLabel("Форма:");
        formLabel.setHorizontalAlignment(SwingConstants.TRAILING);
        formLabel.setBounds(60, 70, 50, 30);

        formTextField = new JTextField();
        formTextField.setBounds(120, 75, 200, 30);

        JLabel specLabel = new JLabel("Специализация:");
        specLabel.setHorizontalAlignment(SwingConstants.TRAILING);
        specLabel.setBounds(5, 120, 110, 30);

        specTextField = new JTextField();
        specTextField.setBounds(120, 125, 200, 30);

        formCheckBox = new JCheckBox();
        formCheckBox.setBounds(345, 80, 30, 30);

        formComboBox = new JComboBox();
        formComboBox.setBounds(375, 80, 200, 30);

        specCheckBox = new JCheckBox();
        specCheckBox.setBounds(345, 120, 30, 30);

        specComboBox = new JComboBox();
        specComboBox.setBounds(375, 120, 200, 30);

        add(nameLabel);
        add(nameTextField);
        add(formLabel);
        add(formTextField);
        add(specLabel);
        add(specTextField);
        add(formCheckBox);
        add(specCheckBox);
        add(formComboBox);
        add(specComboBox);
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

    public JComboBox getFormComboBox() {
        return formComboBox;
    }

    public void setFormComboBox(JComboBox formComboBox) {
        this.formComboBox = formComboBox;
    }

    public JComboBox getSpecComboBox() {
        return specComboBox;
    }

    public void setSpecComboBox(JComboBox specComboBox) {
        this.specComboBox = specComboBox;
    }

    public JCheckBox getFormCheckBox() {
        return formCheckBox;
    }

    public void setFormCheckBox(JCheckBox formCheckBox) {
        this.formCheckBox = formCheckBox;
    }

    public JCheckBox getSpecCheckBox() {
        return specCheckBox;
    }

    public void setSpecCheckBox(JCheckBox specCheckBox) {
        this.specCheckBox = specCheckBox;
    }
}
