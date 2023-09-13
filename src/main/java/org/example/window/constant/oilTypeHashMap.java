package org.example.window.constant;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
@Component
@Getter
public class oilTypeHashMap {
    private final HashMap<String,String> map=new HashMap<>();
    public oilTypeHashMap(){
        String[] oilTypeArrayList1={"BCoil","GTLightOil","GTOil","GTHeavyOil","GTExtraHeavyOil"};
        String[] oilTypeArrayList2={"BC原油","GT轻油","GT原油","GT重油","GT极重油"};
        for(int i=0;i<oilTypeArrayList1.length;i++){
            map.put(oilTypeArrayList1[i],oilTypeArrayList2[i]);
        }

    }
}
