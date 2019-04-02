package com.top;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Vector;

public class Frame extends JFrame {

    JTable userTable;
    JScrollPane listJs;
    JPanel listPanel;

    DefaultTableModel model;
    Vector<String> userRow;

    Rocket[] rockets = new Rocket[]{new Rocket("Shooter",3.95, new Length(50.0)), new Rocket("Orbit",29.95, new Length(5000.0))};
    RocketTable rt = new RocketTable(rockets);

    public Frame(String title){
        super(title);

        model = new DefaultTableModel(rt.columnNames,0);
        userTable = new JTable(model);

        setBounds(150,100,200,200);
        setResizable(false);

        listPanel = new JPanel();
        listPanel.setLayout(new BorderLayout());
        listJs = new JScrollPane(userTable);
        listPanel.add(listJs,BorderLayout.CENTER);

        add(listPanel);

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        for(int i=0;i<rt.getRowCount();i++){
            userRow = new Vector<String>();
            for(int j=0;j<rt.getColumnCount();j++){
                userRow.addElement(rt.getValueAt(i,j).toString());
            }
            model.addRow(userRow);
        }
    }
}
