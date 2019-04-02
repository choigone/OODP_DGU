package com.top;
import javax.swing.table.*;



public class RocketTable extends AbstractTableModel{

    protected Rocket[] rockets;
    protected String[] columnNames = new String[] {"Name","Price","Apogee"};

    public RocketTable(Rocket[] rockets){
        this.rockets = rockets;
    }

    @Override
    public int getRowCount() {
        return rockets.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnNames[columnIndex] == "Name") return rockets[rowIndex].getName();
        else if(columnNames[columnIndex] == "Price") return rockets[rowIndex].getPrice();
        else if(columnNames[columnIndex] == "Apogee") return rockets[rowIndex].getApogee();
        else return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}
