package org.example.defines;

import lombok.Getter;
import lombok.extern.java.Log;
import org.apache.ibatis.io.Resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
@Getter
@Log
public class naphthaCrackAmountDefine {
    @Qualifier("naphthaCrackSettings")
    @Autowired
    // 1：轻度氢气 2：中度氢气 3：重度氢气 4：轻度蒸汽 5：中度蒸汽 6：重度蒸汽
    private String propertiesFileName;
    private final double crackType1ProduceButane;//轻度氢气裂化产生丁烷
    private final double crackType1ProducePropane;//轻度氢气裂化产生丙烷
    private final double crackType1ProduceEthane;//轻度氢气裂化产生乙烷
    private final double crackType1ProduceMethane;//轻度氢气裂化产生甲烷
    private final double crackType2ProduceButane;//中度氢气裂化产生丁烷
    private final double crackType2ProducePropane;//中度氢气裂化产生丙烷
    private final double crackType2ProduceEthane;//中度氢气裂化产生乙烷
    private final double crackType2ProduceMethane;//中度氢气裂化产生甲烷
    private final double crackType3ProduceButane;//重度氢气裂化产生丁烷
    private final double crackType3ProducePropane;//重度氢气裂化产生丙烷
    private final double crackType3ProduceEthane;//重度氢气裂化产生乙烷
    private final double crackType3ProduceMethane;//重度氢气裂化产生甲烷
    private final double crackType4ProduceToluene;//轻度蒸汽裂化产生甲苯
    private final double crackType4ProduceBenzene;//轻度蒸汽裂化产生苯
    private final double crackType4ProduceButene;//轻度蒸汽裂化产生丁烯
    private final double crackType4ProduceButadiene;//轻度蒸汽裂化产生丁二烯
    private final double crackType4ProducePropane;//轻度蒸汽裂化产生丙烷
    private final double crackType4ProduceAcrylic;//轻度蒸汽裂化产生丙烯
    private final double crackType4ProduceEthane;//轻度蒸汽裂化产生乙烷
    private final double crackType4ProduceVinyl;//轻度蒸汽裂化产生乙烯
    private final double crackType4ProduceMethane;//轻度蒸汽裂化产生甲烷
    private final double crackType4ProduceTinyCarbonDust;//轻度蒸汽裂化产生小撮碳粉
    private final double crackType4ProduceLightOil;//轻度蒸汽裂化产生轻燃油
    private final double crackType4ProduceHeavyOil;//轻度蒸汽裂化产生重燃油
    private final double crackType5ProduceToluene;//中度蒸汽裂化产生甲苯
    private final double crackType5ProduceBenzene;//中度蒸汽裂化产生苯
    private final double crackType5ProduceButene;//中度蒸汽裂化产生丁烯
    private final double crackType5ProduceButadiene;//中度蒸汽裂化产生丁二烯
    private final double crackType5ProducePropane;//中度蒸汽裂化产生丙烷
    private final double crackType5ProduceAcrylic;//中度蒸汽裂化产生丙烯
    private final double crackType5ProduceEthane;//中度蒸汽裂化产生乙烷
    private final double crackType5ProduceVinyl;//中度蒸汽裂化产生乙烯
    private final double crackType5ProduceMethane;//中度蒸汽裂化产生甲烷
    private final double crackType5ProduceTinyCarbonDust;//中度蒸汽裂化产生小撮碳粉
    private final double crackType5ProduceLightOil;//中度蒸汽裂化产生轻燃油
    private final double crackType5ProduceHeavyOil;//中度蒸汽裂化产生重燃油
    private final double crackType6ProduceToluene;//重度蒸汽裂化产生甲苯
    private final double crackType6ProduceBenzene;//重度蒸汽裂化产生苯
    private final double crackType6ProduceButene;//重度蒸汽裂化产生丁烯
    private final double crackType6ProduceButadiene;//重度蒸汽裂化产生丁二烯
    private final double crackType6ProducePropane;//重度蒸汽裂化产生丙烷
    private final double crackType6ProduceAcrylic;//重度蒸汽裂化产生丙烯
    private final double crackType6ProduceEthane;//重度蒸汽裂化产生乙烷
    private final double crackType6ProduceVinyl;//重度蒸汽裂化产生乙烯
    private final double crackType6ProduceMethane;//重度蒸汽裂化产生甲烷
    private final double crackType6ProduceTinyCarbonDust;//重度蒸汽裂化产生小撮碳粉
    private final double crackType6ProduceLightOil;//重度蒸汽裂化产生轻燃油
    private final double crackType6ProduceHeavyOil;//重度蒸汽裂化产生重燃油


    public naphthaCrackAmountDefine(@Qualifier("naphthaCrackSettings") String propertiesFileName){
        this.propertiesFileName=propertiesFileName;
        Properties properties=new Properties();
        try {
            properties.load(Resources.getResourceAsStream(propertiesFileName));
        }catch (Exception e){
            log.severe(e.getMessage());
        }
        crackType1ProduceButane= Double.parseDouble(properties.getProperty("NaphthaCrackType1ProduceButane"));
        crackType1ProducePropane= Double.parseDouble(properties.getProperty("NaphthaCrackType1ProducePropane"));
        crackType1ProduceEthane= Double.parseDouble(properties.getProperty("NaphthaCrackType1ProduceEthane"));
        crackType1ProduceMethane= Double.parseDouble(properties.getProperty("NaphthaCrackType1ProduceMethane"));
        //
        crackType2ProduceButane= Double.parseDouble(properties.getProperty("NaphthaCrackType2ProduceButane"));
        crackType2ProducePropane= Double.parseDouble(properties.getProperty("NaphthaCrackType2ProducePropane"));
        crackType2ProduceEthane= Double.parseDouble(properties.getProperty("NaphthaCrackType2ProduceEthane"));
        crackType2ProduceMethane= Double.parseDouble(properties.getProperty("NaphthaCrackType2ProduceMethane"));
        //
        crackType3ProduceButane= Double.parseDouble(properties.getProperty("NaphthaCrackType3ProduceButane"));
        crackType3ProducePropane= Double.parseDouble(properties.getProperty("NaphthaCrackType3ProducePropane"));
        crackType3ProduceEthane= Double.parseDouble(properties.getProperty("NaphthaCrackType3ProduceEthane"));
        crackType3ProduceMethane= Double.parseDouble(properties.getProperty("NaphthaCrackType3ProduceMethane"));
        //
        crackType4ProduceToluene=Double.parseDouble(properties.getProperty("NaphthaCrackType4ProduceToluene"));
        crackType4ProduceBenzene=Double.parseDouble(properties.getProperty("NaphthaCrackType4ProduceBenzene"));
        crackType4ProduceButene=Double.parseDouble(properties.getProperty("NaphthaCrackType4ProduceButene"));
        crackType4ProduceButadiene=Double.parseDouble(properties.getProperty("NaphthaCrackType4ProduceButadiene"));
        crackType4ProducePropane=Double.parseDouble(properties.getProperty("NaphthaCrackType4ProducePropane"));
        crackType4ProduceAcrylic=Double.parseDouble(properties.getProperty("NaphthaCrackType4ProduceAcrylic"));
        crackType4ProduceEthane=Double.parseDouble(properties.getProperty("NaphthaCrackType4ProduceEthane"));
        crackType4ProduceVinyl=Double.parseDouble(properties.getProperty("NaphthaCrackType4ProduceVinyl"));
        crackType4ProduceMethane=Double.parseDouble(properties.getProperty("NaphthaCrackType4ProduceMethane"));
        crackType4ProduceTinyCarbonDust=Double.parseDouble(properties.getProperty("NaphthaCrackType4ProduceTinyCarbonDust"));
        crackType4ProduceLightOil=Double.parseDouble(properties.getProperty("NaphthaCrackType4ProduceHeavyOil"));
        crackType4ProduceHeavyOil=Double.parseDouble(properties.getProperty("NaphthaCrackType4ProduceLightOil"));
        //
        crackType5ProduceToluene=Double.parseDouble(properties.getProperty("NaphthaCrackType5ProduceToluene"));
        crackType5ProduceBenzene=Double.parseDouble(properties.getProperty("NaphthaCrackType5ProduceBenzene"));
        crackType5ProduceButene=Double.parseDouble(properties.getProperty("NaphthaCrackType5ProduceButene"));
        crackType5ProduceButadiene=Double.parseDouble(properties.getProperty("NaphthaCrackType5ProduceButadiene"));
        crackType5ProducePropane=Double.parseDouble(properties.getProperty("NaphthaCrackType5ProducePropane"));
        crackType5ProduceAcrylic=Double.parseDouble(properties.getProperty("NaphthaCrackType5ProduceAcrylic"));
        crackType5ProduceEthane=Double.parseDouble(properties.getProperty("NaphthaCrackType5ProduceEthane"));
        crackType5ProduceVinyl=Double.parseDouble(properties.getProperty("NaphthaCrackType5ProduceVinyl"));
        crackType5ProduceMethane=Double.parseDouble(properties.getProperty("NaphthaCrackType5ProduceMethane"));
        crackType5ProduceTinyCarbonDust=Double.parseDouble(properties.getProperty("NaphthaCrackType5ProduceTinyCarbonDust"));
        crackType5ProduceLightOil=Double.parseDouble(properties.getProperty("NaphthaCrackType5ProduceHeavyOil"));
        crackType5ProduceHeavyOil=Double.parseDouble(properties.getProperty("NaphthaCrackType5ProduceLightOil"));
        //
        crackType6ProduceToluene=Double.parseDouble(properties.getProperty("NaphthaCrackType6ProduceToluene"));
        crackType6ProduceBenzene=Double.parseDouble(properties.getProperty("NaphthaCrackType6ProduceBenzene"));
        crackType6ProduceButene=Double.parseDouble(properties.getProperty("NaphthaCrackType6ProduceButene"));
        crackType6ProduceButadiene=Double.parseDouble(properties.getProperty("NaphthaCrackType6ProduceButadiene"));
        crackType6ProducePropane=Double.parseDouble(properties.getProperty("NaphthaCrackType6ProducePropane"));
        crackType6ProduceAcrylic=Double.parseDouble(properties.getProperty("NaphthaCrackType6ProduceAcrylic"));
        crackType6ProduceEthane=Double.parseDouble(properties.getProperty("NaphthaCrackType6ProduceEthane"));
        crackType6ProduceVinyl=Double.parseDouble(properties.getProperty("NaphthaCrackType6ProduceVinyl"));
        crackType6ProduceMethane=Double.parseDouble(properties.getProperty("NaphthaCrackType6ProduceMethane"));
        crackType6ProduceTinyCarbonDust=Double.parseDouble(properties.getProperty("NaphthaCrackType6ProduceTinyCarbonDust"));
        crackType6ProduceLightOil=Double.parseDouble(properties.getProperty("NaphthaCrackType6ProduceHeavyOil"));
        crackType6ProduceHeavyOil=Double.parseDouble(properties.getProperty("NaphthaCrackType6ProduceLightOil"));
    }
    @Override
    public String toString() {
        return "石脑油裂化参数:" + "\n" +
                "轻度氢气裂化:" + "\n" +
                "轻度氢气裂化产生丁烷比率:" + this.crackType1ProduceButane + "\n" +
                "轻度氢气裂化产生丙烷比率:" + this.crackType1ProducePropane + "\n" +
                "轻度氢气裂化产生乙烷比率:" + this.crackType1ProduceEthane + "\n" +
                "轻度氢气裂化产生甲烷比率:" + this.crackType1ProduceMethane + "\n" +
                "中度氢气裂化:" + "\n" +
                "中度氢气裂化产生丁烷比率:" + this.crackType2ProduceButane + "\n" +
                "中度氢气裂化产生丙烷比率:" + this.crackType2ProducePropane + "\n" +
                "中度氢气裂化产生乙烷比率:" + this.crackType2ProduceEthane + "\n" +
                "中度氢气裂化产生甲烷比率:" + this.crackType2ProduceMethane + "\n" +
                "重度氢气裂化:" + "\n" +
                "重度氢气裂化产生丁烷比率:" + this.crackType3ProduceButane + "\n" +
                "重度氢气裂化产生丙烷比率:" + this.crackType3ProducePropane + "\n" +
                "重度氢气裂化产生乙烷比率:" + this.crackType3ProduceEthane + "\n" +
                "重度氢气裂化产生甲烷比率:" + this.crackType3ProduceMethane+"\n"+
                "轻度蒸汽裂化:"+"\n"+
                "轻度蒸汽裂化产生甲苯比率:"+this.crackType4ProduceToluene+"\n"+
                "轻度蒸汽裂化产生苯比率:"+this.crackType4ProduceBenzene+"\n"+
                "轻度蒸汽裂化产生丁烯比率:"+this.crackType4ProduceButene+"\n"+
                "轻度蒸汽裂化产生丁二烯比率:"+this.crackType4ProduceButadiene+"\n"+
                "轻度蒸汽裂化产生丙烷比率:"+this.crackType4ProducePropane+"\n"+
                "轻度蒸汽裂化产生丙烯比率:"+this.crackType4ProduceAcrylic+"\n"+
                "轻度蒸汽裂化产生乙烷比率:"+this.crackType4ProduceEthane+"\n"+
                "轻度蒸汽裂化产生乙烯比率:"+this.crackType4ProduceVinyl+"\n"+
                "轻度蒸汽裂化产生甲烷比率:"+this.crackType4ProduceMethane+"\n"+
                "轻度蒸汽裂化产生小撮碳粉比率:"+this.crackType4ProduceTinyCarbonDust+"\n"+
                "轻度蒸汽裂化产生轻燃油比率:"+this.crackType4ProduceLightOil+"\n"+
                "轻度蒸汽裂化产生重燃油比率:"+this.crackType4ProduceHeavyOil+"\n"+
                "中度蒸汽裂化:"+"\n"+
                "中度蒸汽裂化产生甲苯比率:"+this.crackType5ProduceToluene+"\n"+
                "中度蒸汽裂化产生苯比率:"+this.crackType5ProduceBenzene+"\n"+
                "中度蒸汽裂化产生丁烯比率:"+this.crackType5ProduceButene+"\n"+
                "中度蒸汽裂化产生丁二烯比率:"+this.crackType5ProduceButadiene+"\n"+
                "中度蒸汽裂化产生丙烷比率:"+this.crackType5ProducePropane+"\n"+
                "中度蒸汽裂化产生丙烯比率:"+this.crackType5ProduceAcrylic+"\n"+
                "中度蒸汽裂化产生乙烷比率:"+this.crackType5ProduceEthane+"\n"+
                "中度蒸汽裂化产生乙烯比率:"+this.crackType5ProduceVinyl+"\n"+
                "中度蒸汽裂化产生甲烷比率:"+this.crackType5ProduceMethane+"\n"+
                "中度蒸汽裂化产生小撮碳粉比率:"+this.crackType5ProduceTinyCarbonDust+"\n"+
                "中度蒸汽裂化产生轻燃油比率:"+this.crackType5ProduceLightOil+"\n"+
                "中度蒸汽裂化产生重燃油比率:"+this.crackType5ProduceHeavyOil+"\n"+
                "重度蒸汽裂化:"+"\n"+
                "重度蒸汽裂化产生甲苯比率:"+this.crackType6ProduceToluene+"\n"+
                "重度蒸汽裂化产生苯比率:"+this.crackType6ProduceBenzene+"\n"+
                "重度蒸汽裂化产生丁烯比率:"+this.crackType6ProduceButene+"\n"+
                "重度蒸汽裂化产生丁二烯比率:"+this.crackType6ProduceButadiene+"\n"+
                "重度蒸汽裂化产生丙烷比率:"+this.crackType6ProducePropane+"\n"+
                "重度蒸汽裂化产生丙烯比率:"+this.crackType6ProduceAcrylic+"\n"+
                "重度蒸汽裂化产生乙烷比率:"+this.crackType6ProduceEthane+"\n"+
                "重度蒸汽裂化产生乙烯比率:"+this.crackType6ProduceVinyl+"\n"+
                "重度蒸汽裂化产生甲烷比率:"+this.crackType6ProduceMethane+"\n"+
                "重度蒸汽裂化产生小撮碳粉比率:"+this.crackType6ProduceTinyCarbonDust+"\n"+
                "重度蒸汽裂化产生轻燃油比率:"+this.crackType6ProduceLightOil+"\n"+
                "重度蒸汽裂化产生重燃油比率:"+this.crackType6ProduceHeavyOil;

    }
}
