package org.example.window;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    public MainFrame(String title){
        JFrame frame=new JFrame(title);
        frame.setVisible(true);
        frame.setSize(800,800);
        JButton button1=new JButton("exit");
        Container container=frame.getContentPane();
        button1.setBounds(50,50,300,50);
        container.add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        JButton button2=new JButton("sub");
        button2.setBounds(50,150,300,50);
        container.add(button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SubFrame();
            }
        });
        frame.setLayout(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

}
