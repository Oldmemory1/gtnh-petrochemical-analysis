package org.example.defines;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.java.Log;
import org.apache.ibatis.io.Resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
@ToString
@Getter
@Setter
@Log
public class heavyOilCrackAmountDefine {
    @Qualifier("heavyOilCrackSettings")
    @Autowired
    // 0：直接蒸馏 1：轻度氢气 2：中度氢气 3：重度氢气 4：轻度蒸汽 5：中度蒸汽 6：重度蒸汽
    private String propertiesFileName;
    private double crackType0ProduceBenzene;//直接蒸馏产生苯
    private double crackType0ProduceToluene;//直接蒸馏产生甲苯
    private double crackType0ProducePhenol;//直接蒸馏产生苯酚

    public heavyOilCrackAmountDefine(@Qualifier("heavyOilCrackSettings") String propertiesFileName){
        this.propertiesFileName=propertiesFileName;
        Properties properties=new Properties();
        try {
            properties.load(Resources.getResourceAsStream("heavyOilCrack.properties"));
        }catch (Exception e){
            log.severe(e.getMessage());
        }
        crackType0ProduceBenzene=Double.parseDouble(properties.getProperty("crackType0ProduceBenzene"));
        crackType0ProduceToluene=Double.parseDouble(properties.getProperty("crackType0ProduceToluene"));
        crackType0ProducePhenol=Double.parseDouble(properties.getProperty("crackType0ProducePhenol"));
    }
}
