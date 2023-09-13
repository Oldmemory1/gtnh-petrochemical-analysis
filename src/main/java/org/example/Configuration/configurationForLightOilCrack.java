package org.example.Configuration;

import org.example.defines.lightOilCrackAmountDefine;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example.defines")
public class configurationForLightOilCrack {
    @Bean(name = "lightOilCrackSettings")
    public String lightOilCrackSettings(){
        return "lightOilCrack.properties";
    }
    @Bean(name = "lightOilCrackAmountDefine")
    public lightOilCrackAmountDefine lightOilCrackAmountDefine(@Qualifier("lightOilCrackSettings") String lightOilCrackSettings){
        return new lightOilCrackAmountDefine(lightOilCrackSettings);
    }
}
