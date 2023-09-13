package org.example.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.example.window.constant.oilTypeHashMap;
@Configuration
public class configurationForOilTypeHashMap {
    @Bean
    public oilTypeHashMap oilTypeHashMap(){
        return new oilTypeHashMap();
    }
}
