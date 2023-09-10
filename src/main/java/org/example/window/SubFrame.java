package org.example.window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubFrame extends JFrame {
    public SubFrame(){
        JFrame frame=new JFrame("SubFrame");
        frame.setSize(600,600);
        JLabel label1=new JLabel("SubFrame");
        label1.setBounds(50,50,300,50);
        JButton button1=new JButton("exit");
        button1.setBounds(50,150,300,50);
        Container container=frame.getContentPane();
        container.add(label1);
        container.add(button1);
        frame.setLayout(null);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        frame.setVisible(true);
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
