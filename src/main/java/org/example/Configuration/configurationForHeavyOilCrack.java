package org.example.Configuration;

import org.example.defines.heavyOilCrackAmountDefine;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example.defines")
public class configurationForHeavyOilCrack {

    @Bean(name = "heavyOilCrackSettings")
    public String heavyOilCrackSettings(){
        return "heavyOilCrack.properties";
    }
    @Bean(name = "heavyOilCrackAmountDefine")
    public heavyOilCrackAmountDefine heavyOilCrackAmountDefine(@Qualifier("heavyOilCrackSettings") String heavyOilCrackSettings){
        return new heavyOilCrackAmountDefine(heavyOilCrackSettings);
    }
}
