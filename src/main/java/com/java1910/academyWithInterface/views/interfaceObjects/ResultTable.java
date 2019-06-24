package com.java1910.academyWithInterface.views.interfaceObjects;


import java.lang.Override;
import java.lang.String;

public class ResultTable implements TableModelable{

    private  int column;

    public ResultTable(int column) {
        this.column = column;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "#id";

            case 1: return "Имя";

            case 2: return "Дата рождения";

            case 3: return "Телефон";

            case 4: return "Паспорт";

            case 5: return "id студента";

            case 6: return "Начало обучения";

            case 7: return "Дата выпуска";

            case 8: return "Диплом";

            case 9: return "Группа";

            case 10: return "Контракт";
        }
        return null;
    }
}
