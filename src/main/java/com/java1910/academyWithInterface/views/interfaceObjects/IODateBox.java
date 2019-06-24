package com.java1910.academyWithInterface.views.interfaceObjects;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class IODateBox extends JPanel{
    JComboBox yearBox;
    JComboBox monthBox;
    JComboBox dayBox;

    public IODateBox() {
        super();
        init();
        setLayout(new GridLayout(1, 3, 3, 3));
    }

    private void init() {

        yearBox = new JComboBox(rangeOfValues(1960, 2100));
        monthBox = new JComboBox(rangeOfValues(1, 12));
        dayBox = new JComboBox(rangeOfValues(1, 31));

        add(yearBox);
        add(monthBox);
        add(dayBox);
        setBorder(BorderFactory.createEtchedBorder());
    }

    public JComboBox getYearBox() {
        return yearBox;
    }

    public void setYearBox(JComboBox yearBox) {
        this.yearBox = yearBox;
    }

    public JComboBox getMonthBox() {
        return monthBox;
    }

    public void setMonthBox(JComboBox monthBox) {
        this.monthBox = monthBox;
    }

    public JComboBox getDayBox() {
        return dayBox;
    }

    public void setDayBox(JComboBox dayBox) {
        this.dayBox = dayBox;
    }

    private  String[] rangeOfValues(int from, int to) {
        List<String> values = new ArrayList<String>();
        for(int i = from; i <= to; i++ ) {
            values.add(String.valueOf(i));
        }

        return values.toArray(new String[values.size()]);
    }
}
