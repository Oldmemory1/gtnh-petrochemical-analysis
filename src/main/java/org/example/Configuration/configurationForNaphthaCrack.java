package org.example.Configuration;

import org.example.defines.lightOilCrackAmountDefine;
import org.example.defines.naphthaCrackAmountDefine;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan("org.example.defines")
public class configurationForNaphthaCrack {
    @Bean(name = "naphthaCrackSettings")
    public String naphthaCrackSettings(){
        return "naphthaCrack.properties";
    }
    @Bean(name = "naphthaCrackAmountDefine")
    @Lazy
    public naphthaCrackAmountDefine lightOilCrackAmountDefine(@Qualifier("naphthaCrackSettings") String naphthaCrackSettings){
        return new naphthaCrackAmountDefine(naphthaCrackSettings);
    }
}
