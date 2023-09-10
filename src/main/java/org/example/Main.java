package org.example;

import org.example.Configuration.mainConfiguration;
import org.example.defines.*;
import org.example.entity.oil;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <heavyOilCrackSettings> void main(String[] args) throws IOException {
        //new MainFrame("MainFrame");

        List<oil> oilList=new ArrayList<>();
        oilList.add(new oil("BCoil"));
        oilList.add(new oil("GTLightOil"));
        oilList.add(new oil("GTOil"));
        oilList.add(new oil("GTHeavyOil"));
        oilList.add(new oil("GTExtraHeavyOil"));
        for (org.example.entity.oil oil : oilList) {
            System.out.println(oil);
        }
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(mainConfiguration.class);

        heavyOilCrackAmountDefine h=context.getBean(heavyOilCrackAmountDefine.class);
        System.out.println(h);
        lightOilCrackAmountDefine l=context.getBean(lightOilCrackAmountDefine.class);
        System.out.println(l);
        naphthaCrackAmountDefine n=context.getBean(naphthaCrackAmountDefine.class);
        System.out.println(n);

    }
}