package org.example.Configuration;

import org.example.defines.oilDistillAmountDefine;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan("org.example.defines")
public class configurationForOilDistillAmountDefine {

    @Bean(name = "oilDistillSettings")
    public String oilDistillSettings(){
        return "oilDistill.properties";
    }
    @Bean(name = "oilDistillAmountDefine",initMethod = "init",destroyMethod = "destroy")
    @Lazy
    public oilDistillAmountDefine oilDistillAmountDefine(@Qualifier("oilDistillSettings") String oilDistillSettings){
        return new oilDistillAmountDefine(oilDistillSettings);
    }


}
