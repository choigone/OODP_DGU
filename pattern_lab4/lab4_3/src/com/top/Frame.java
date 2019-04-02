package com.top;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    JTable userTable;
    JScrollPane listJs;
    JPanel listPanel;

    Rocket[] rockets = new Rocket[]{new Rocket("Shooter",3.95, new Length(50.0)), new Rocket("Orbit",29.95, new Length(5000.0))};
    RocketTable rocketTable = new RocketTable(rockets);

    public Frame(String title){
        super(title);

        userTable = new JTable(rocketTable);

        setBounds(150,100,200,200);
        setResizable(false);

        listPanel = new JPanel();
        listPanel.setLayout(new BorderLayout());
        listJs = new JScrollPane(userTable);
        listPanel.add(listJs,BorderLayout.CENTER);

        add(listPanel);

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }
}
