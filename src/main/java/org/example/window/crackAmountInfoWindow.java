package org.example.window;

import org.example.Configuration.mainConfiguration;
import org.example.defines.gasCrackAmountDefine;
import org.example.defines.heavyOilCrackAmountDefine;
import org.example.defines.lightOilCrackAmountDefine;
import org.example.defines.naphthaCrackAmountDefine;
import org.example.window.constant.heavyOilCrackTypeHashMap;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class crackAmountInfoWindow extends JFrame {


    public crackAmountInfoWindow(String Title){

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(mainConfiguration.class);
        heavyOilCrackAmountDefine heavyOilCrackAmountDefine=context.getBean(org.example.defines.heavyOilCrackAmountDefine.class);
        lightOilCrackAmountDefine lightOilCrackAmountDefine=context.getBean(org.example.defines.lightOilCrackAmountDefine.class);
        naphthaCrackAmountDefine naphthaCrackAmountDefine=context.getBean(org.example.defines.naphthaCrackAmountDefine.class);
        gasCrackAmountDefine gasCrackAmountDefine=context.getBean(org.example.defines.gasCrackAmountDefine.class);

        JFrame frame=new JFrame(Title);
        Container container=frame.getContentPane();

        JTextArea textArea=new JTextArea();
        textArea.setBounds(75,75,400,400);
        textArea.setText(heavyOilCrackAmountDefine +"\n"+ lightOilCrackAmountDefine +"\n"+ naphthaCrackAmountDefine +"\n"+ gasCrackAmountDefine);

        JScrollPane scrollPane=new JScrollPane();
        scrollPane.setBounds(475,75,20,400);
        scrollPane.setViewportView(textArea);
        container.add(scrollPane);
        SwingUtilities.invokeLater(() -> scrollPane.getVerticalScrollBar().setValue(0));
        textArea.setEditable(false);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.setBackground(Color.WHITE);
        frame.setLayout(null);
    }
}
