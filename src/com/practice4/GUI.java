package com.practice4;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    JTextField jtf = new JTextField(10);
    Font fnt = new Font("Times new roman", Font.BOLD,20);
    GUI() {
        super("GUI");
        setLayout(new FlowLayout());
        setSize(300, 100);
        add(jtf);
        jtf.setForeground(Color.gray);
        jtf.setFont(fnt);
        setVisible(true);
    }

    public static void main(String[] args){
        new GUI();
    }
}
