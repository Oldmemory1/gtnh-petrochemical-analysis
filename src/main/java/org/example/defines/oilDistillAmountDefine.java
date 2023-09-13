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

@Getter
@Setter
@ToString
@Component
@Log
public class oilDistillAmountDefine {
    @Qualifier("oilDistillSettings")
    @Autowired
    private String fileName;

    //
    private final double bcOilProduceHeavyOilAmount;
    private final double bcOilProduceLightOilAmount;
    private final double bcOilProduceNaphthaAmount;
    private final double bcOilProduceGasAmount;
    private final double GTLightOilProduceHeavyOilAmount;
    private final double GTLightOilProduceLightOilAmount;
    private final double GTLightOilProduceNaphthaAmount;
    private final double GTLightOilProduceGasAmount;
    private final double GTOilProduceHeavyOilAmount;
    private final double GTOilProduceLightOilAmount;
    private final double GTOilProduceNaphthaAmount;
    private final double GTOilProduceGasAmount;
    private final double GTHeavyOilProduceHeavyOilAmount;
    private final double GTHeavyOilProduceLightOilAmount;
    private final double GTHeavyOilProduceNaphthaAmount;
    private final double GTHeavyOilProduceGasAmount;
    private final double GTExtraHeavyOilProduceHeavyOilAmount;
    private final double GTExtraHeavyOilProduceLightOilAmount;
    private final double GTExtraHeavyOilProduceNaphthaAmount;
    private final double GTExtraHeavyOilProduceGasAmount;


    public oilDistillAmountDefine(@Qualifier("oilDistillSettings") String propertiesName){
        fileName=propertiesName;

        Properties properties=new Properties();
        try {
            properties.load(Resources.getResourceAsStream(propertiesName));
        }catch (Exception e){
            log.severe(e.getMessage());
        }
        log.info("文件读入正常");
        bcOilProduceHeavyOilAmount= Integer.parseInt(properties.getProperty("bcOilProduceHeavyOilAmount"));
        bcOilProduceLightOilAmount=Integer.parseInt( properties.getProperty("bcOilProduceLightOilAmount"));
        bcOilProduceNaphthaAmount=Integer.parseInt(properties.getProperty("bcOilProduceNaphthaAmount"));
        bcOilProduceGasAmount=Integer.parseInt(properties.getProperty("bcOilProduceGasAmount"));
        GTLightOilProduceHeavyOilAmount= Integer.parseInt(properties.getProperty("GTLightOilProduceHeavyOilAmount"));
        GTLightOilProduceLightOilAmount=Integer.parseInt( properties.getProperty("GTLightOilProduceLightOilAmount"));
        GTLightOilProduceNaphthaAmount=Integer.parseInt(properties.getProperty("GTLightOilProduceNaphthaAmount"));
        GTLightOilProduceGasAmount=Integer.parseInt(properties.getProperty("GTLightOilProduceGasAmount"));
        GTOilProduceHeavyOilAmount= Integer.parseInt(properties.getProperty("GTOilProduceHeavyOilAmount"));
        GTOilProduceLightOilAmount=Integer.parseInt( properties.getProperty("GTOilProduceLightOilAmount"));
        GTOilProduceNaphthaAmount=Integer.parseInt(properties.getProperty("GTOilProduceNaphthaAmount"));
        GTOilProduceGasAmount=Integer.parseInt(properties.getProperty("GTOilProduceGasAmount"));
        GTHeavyOilProduceHeavyOilAmount= Integer.parseInt(properties.getProperty("GTHeavyOilProduceHeavyOilAmount"));
        GTHeavyOilProduceLightOilAmount=Integer.parseInt( properties.getProperty("GTHeavyOilProduceLightOilAmount"));
        GTHeavyOilProduceNaphthaAmount=Integer.parseInt(properties.getProperty("GTHeavyOilProduceNaphthaAmount"));
        GTHeavyOilProduceGasAmount=Integer.parseInt(properties.getProperty("GTHeavyOilProduceGasAmount"));
        GTExtraHeavyOilProduceHeavyOilAmount= Integer.parseInt(properties.getProperty("GTExtraHeavyOilProduceHeavyOilAmount"));
        GTExtraHeavyOilProduceLightOilAmount=Integer.parseInt( properties.getProperty("GTExtraHeavyOilProduceLightOilAmount"));
        GTExtraHeavyOilProduceNaphthaAmount=Integer.parseInt(properties.getProperty("GTExtraHeavyOilProduceNaphthaAmount"));
        GTExtraHeavyOilProduceGasAmount=Integer.parseInt(properties.getProperty("GTExtraHeavyOilProduceGasAmount"));
    }
    public void init(){
        log.info("init");
    }
    public void destroy(){
        log.info("destroy");
    }

}
