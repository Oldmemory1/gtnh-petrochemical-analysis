package org.example.Configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.example.defines.gasCrackAmountDefine;

@Configuration
@ComponentScan("org.example.defines")
public class configurationForGasCrack {
    @Bean(name = "gasCrackSettings")
    public String gasCrackSettings(){
        return "gasCrack.properties";
    }
    @Bean(name ="gasCrackAmountDefine")
    public gasCrackAmountDefine gasCrackAmountDefine(@Qualifier("gasCrackSettings") String gasCrackSettings){
        return new gasCrackAmountDefine(gasCrackSettings);
    }

}
