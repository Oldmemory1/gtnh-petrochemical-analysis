package org.example.window.constant;

import lombok.Getter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@Getter
public class heavyOilCrackTypeHashMap {
    private final HashMap<Integer,String> map=new HashMap<>();
    public heavyOilCrackTypeHashMap(){
        map.put(0,"直接蒸馏");
        map.put(1,"轻度氢气裂化");
        map.put(2,"中度氢气裂化");
        map.put(3,"重度氢气裂化");
        map.put(4,"轻度蒸汽裂化");
        map.put(5,"中度蒸汽裂化");
        map.put(6,"重度蒸汽裂化");
    }
}
