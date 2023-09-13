package org.example.window;
import lombok.extern.java.Log;
import org.example.Configuration.mainConfiguration;
import org.example.window.constant.heavyOilCrackTypeHashMap;
import org.example.window.constant.oilTypeHashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.Objects;

import org.example.window.components.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

@Component
@Log
public class MainWindow{
    @Qualifier("mainWindowTitle")
    @Autowired
    String title;
    public MainWindow(@Qualifier("mainWindowTitle") String title){
        this.title=title;
    }
    public void draw(){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(mainConfiguration.class);
        Map<Integer,String> heavyOilCrackMap=context.getBean(heavyOilCrackTypeHashMap.class).getMap();
        Map<String,String> oilTypeMap=context.getBean(oilTypeHashMap.class).getMap();
        System.out.println(oilTypeMap);
        log.info("create new frame");
        JFrame frame=new JFrame(title);
        Container container=frame.getContentPane();
        JComboBox<String> oilTypeComboBox=new JComboBox<>(new oilTypeComboBox());
        oilTypeComboBox.setBounds(50,275,200,40);
        JComboBox<Integer> heavyOilCrackTypeComboBox=new JComboBox<>(new heavyOilCrackTypeComboBox());
        heavyOilCrackTypeComboBox.setBounds(50,375,200,40);
        JButton button1=new JButton("退出程序");
        button1.setBounds(50,50,200,50);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        JButton button2=new JButton("查看裂化参数信息");
        button2.setBounds(50,150,200,50);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new crackAmountInfoWindow("信息");
            }
        });
        JButton button3=new JButton("For Test");
        button3.setBounds(300,50,200,50);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                log.info(Objects.requireNonNull(oilTypeComboBox.getSelectedItem()).toString());
                log.info(Objects.requireNonNull(heavyOilCrackTypeComboBox.getSelectedItem()).toString());
            }
        });
        JLabel OilTypeLabel=new JLabel("原油类型");
        OilTypeLabel.setBounds(50,225,200,40);
        JLabel HeavyOilCrackTypeLabel=new JLabel("重燃油裂化类型");
        HeavyOilCrackTypeLabel.setBounds(50,325,200,40);
        oilTypeComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s= (String) oilTypeComboBox.getSelectedItem();
                System.out.println(s);
                OilTypeLabel.setText("原油类型:"+oilTypeMap.get(s));
            }
        });
        heavyOilCrackTypeComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer i= (Integer) heavyOilCrackTypeComboBox.getSelectedItem();
                HeavyOilCrackTypeLabel.setText("重燃油裂化类型:"+heavyOilCrackMap.get(i));
            }
        });
        container.add(OilTypeLabel);
        container.add(HeavyOilCrackTypeLabel);
        container.add(button1);
        container.add(button2);
        container.add(button3);
        container.add(oilTypeComboBox);
        container.add(heavyOilCrackTypeComboBox);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setVisible(true);
    }

}
