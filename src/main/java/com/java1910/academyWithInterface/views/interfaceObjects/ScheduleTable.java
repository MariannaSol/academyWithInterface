package com.java1910.academyWithInterface.views.interfaceObjects;


import java.lang.Override;

import java.lang.String;
public class ScheduleTable implements TableModelable {

    private int column;

    public ScheduleTable(int column) {
        this.column = column;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Группа";

            case 1: return "День";

            case 2: return "Преподаватель";

            case 3: return "№";

            case 4: return "Предмет";
        }
        return null;
    }
}
