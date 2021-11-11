package Labb1;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Animation extends JFrame{

    JLabel label;

    Track(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0,0,20,20);
        label.setBackground(Color.blue);
        label.setOpaque(true);

        this.setVisible(true);


    }


}
