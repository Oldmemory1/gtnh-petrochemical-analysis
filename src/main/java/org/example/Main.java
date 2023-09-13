package org.example;

import lombok.extern.java.Log;
import org.example.Configuration.mainConfiguration;
import org.example.defines.gasCrackAmountDefine;
import org.example.defines.heavyOilCrackAmountDefine;
import org.example.defines.lightOilCrackAmountDefine;
import org.example.defines.naphthaCrackAmountDefine;
import org.example.entity.Product;
import org.example.entity.oil;
import org.example.window.MainWindow;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@Log
public class Main {
    public static void main(String[] args) throws IOException {
        //new MainFrame("MainFrame");
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(mainConfiguration.class);
        /*
        heavyOilCrackAmountDefine h=context.getBean(heavyOilCrackAmountDefine.class);
        log.info(h.toString());
        lightOilCrackAmountDefine l=context.getBean(lightOilCrackAmountDefine.class);
        log.info(l.toString());
        naphthaCrackAmountDefine n=context.getBean(naphthaCrackAmountDefine.class);
        log.info(n.toString());
        gasCrackAmountDefine g=context.getBean(gasCrackAmountDefine.class);
        log.info(g.toString());
        oil o=new oil("GTHeavyOil");
        Product p=new Product(o,2,2,2,2,false);
        p.crack();*/
        MainWindow window=context.getBean(MainWindow.class);
        window.draw();



    }
}