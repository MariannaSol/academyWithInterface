package com.java1910.academyWithInterface.views.interfaceObjects;

import javax.swing.table.AbstractTableModel;
import java.lang.Object;import java.lang.Override;import java.lang.String;import java.util.ArrayList;

public class IOTableModel extends AbstractTableModel{
    private int colCount;
    private TableModelable tableModelable;
    private ArrayList<String []> dataArrayList;

    public IOTableModel(int colCount, TableModelable tableModelable) {
        this.tableModelable = tableModelable;
        this.colCount = colCount;
        dataArrayList = new ArrayList<String[]>();
        for (int i = 0; i < dataArrayList.size(); i++) {
            dataArrayList.add(new String[getColumnCount()]);
        }
    }

    @Override
    public String getColumnName(int column) {
        return tableModelable.getColumnName(column);
    }

    @Override
    public int getRowCount() {
        return dataArrayList.size();
    }

    @Override
    public int getColumnCount() {
        return colCount;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Получаем строку данных
        String []rows = dataArrayList.get(rowIndex);
        // Возвращаем i-ю колонку
        return rows[columnIndex];
    }

    /*
     * Метод добавляет строку row в таблицу
     * row - множество данных
     */
    public void addData(String []row) {
        String []rowTable = new String[getColumnCount()];
        rowTable = row;
        // Добавляем строку данных в таблицу
        dataArrayList.add(rowTable);
    }

    public TableModelable getTableModelable() {
      return tableModelable;
    }

    public void setTableModelable(TableModelable tableModelable) {
        this.tableModelable = tableModelable;
    }
}
