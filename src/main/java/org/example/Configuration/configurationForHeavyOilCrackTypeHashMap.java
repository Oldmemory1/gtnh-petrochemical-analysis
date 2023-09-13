package org.example.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.example.window.constant.heavyOilCrackTypeHashMap;
@Configuration

public class configurationForHeavyOilCrackTypeHashMap {
    @Bean
    public heavyOilCrackTypeHashMap heavyOilCrackTypeHashMap(){
        return new heavyOilCrackTypeHashMap();
    }
}
