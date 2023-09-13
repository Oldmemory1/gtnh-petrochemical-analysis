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
public class heavyOilCrackAmountDefine {
    @Qualifier("heavyOilCrackSettings")
    @Autowired
    // 0：直接蒸馏 1：轻度氢气 2：中度氢气 3：重度氢气 4：轻度蒸汽 5：中度蒸汽 6：重度蒸汽
    private String propertiesFileName;
    private final double crackType0ProduceBenzene;//直接蒸馏产生苯
    private final double crackType0ProduceToluene;//直接蒸馏产生甲苯
    private final double crackType0ProducePhenol;//直接蒸馏产生苯酚
    private final double crackType1ProduceMethane;//轻度氢气裂化产生甲烷
    private final double crackType1ProduceEthane;//轻度氢气裂化产生乙烷
    private final double crackType1ProducePropane;//轻度氢气裂化产生丙烷
    private final double crackType1ProduceButane;//轻度氢气裂化产生丁烷
    private final double crackType1ProduceLightOil;//轻度氢气裂化产生轻燃油
    private final double crackType1ProduceNaphtha;//轻度氢气裂化产生石脑油
    private final double crackType2ProduceMethane;//中度氢气裂化产生甲烷
    private final double crackType2ProduceEthane;//中度氢气裂化产生乙烷
    private final double crackType2ProducePropane;//中度氢气裂化产生丙烷
    private final double crackType2ProduceButane;//中度氢气裂化产生丁烷
    private final double crackType2ProduceLightOil;//中度氢气裂化产生轻燃油
    private final double crackType2ProduceNaphtha;//中度氢气裂化产生石脑油
    private final double crackType3ProduceMethane;//重度氢气裂化产生甲烷
    private final double crackType3ProduceEthane;//重度氢气裂化产生乙烷
    private final double crackType3ProducePropane;//重度氢气裂化产生丙烷
    private final double crackType3ProduceButane;//重度氢气裂化产生丁烷
    private final double crackType3ProduceLightOil;//重度氢气裂化产生轻燃油
    private final double crackType3ProduceNaphtha;//重度氢气裂化产生石脑油
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
    private final double crackType4ProduceNaphtha;//轻度蒸汽裂化产生石脑油
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
    private final double crackType5ProduceNaphtha;//中度蒸汽裂化产生石脑油
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
    private final double crackType6ProduceNaphtha;//重度蒸汽裂化产生石脑油
    public heavyOilCrackAmountDefine(@Qualifier("heavyOilCrackSettings") String propertiesFileName){
        this.propertiesFileName=propertiesFileName;
        Properties properties=new Properties();
        try {
            properties.load(Resources.getResourceAsStream(propertiesFileName));
        }catch (Exception e){
            log.severe(e.getMessage());
        }
        //
        crackType0ProduceBenzene=Double.parseDouble(properties.getProperty("HeavyOilCrackType0ProduceBenzene"));
        crackType0ProduceToluene=Double.parseDouble(properties.getProperty("HeavyOilCrackType0ProduceToluene"));
        crackType0ProducePhenol=Double.parseDouble(properties.getProperty("HeavyOilCrackType0ProducePhenol"));
        //
        crackType1ProduceMethane=Double.parseDouble(properties.getProperty("HeavyOilCrackType1ProduceMethane"));
        crackType1ProduceEthane=Double.parseDouble(properties.getProperty("HeavyOilCrackType1ProduceEthane"));
        crackType1ProducePropane=Double.parseDouble(properties.getProperty("HeavyOilCrackType1ProducePropane"));
        crackType1ProduceButane=Double.parseDouble(properties.getProperty("HeavyOilCrackType1ProduceButane"));
        crackType1ProduceLightOil=Double.parseDouble(properties.getProperty("HeavyOilCrackType1ProduceLightOil"));
        crackType1ProduceNaphtha=Double.parseDouble(properties.getProperty("HeavyOilCrackType1ProduceNaphtha"));
        //
        crackType2ProduceMethane=Double.parseDouble(properties.getProperty("HeavyOilCrackType2ProduceMethane"));
        crackType2ProduceEthane=Double.parseDouble(properties.getProperty("HeavyOilCrackType2ProduceEthane"));
        crackType2ProducePropane=Double.parseDouble(properties.getProperty("HeavyOilCrackType2ProducePropane"));
        crackType2ProduceButane=Double.parseDouble(properties.getProperty("HeavyOilCrackType2ProduceButane"));
        crackType2ProduceLightOil=Double.parseDouble(properties.getProperty("HeavyOilCrackType2ProduceLightOil"));
        crackType2ProduceNaphtha=Double.parseDouble(properties.getProperty("HeavyOilCrackType2ProduceNaphtha"));
        //
        crackType3ProduceMethane=Double.parseDouble(properties.getProperty("HeavyOilCrackType3ProduceMethane"));
        crackType3ProduceEthane=Double.parseDouble(properties.getProperty("HeavyOilCrackType3ProduceEthane"));
        crackType3ProducePropane=Double.parseDouble(properties.getProperty("HeavyOilCrackType3ProducePropane"));
        crackType3ProduceButane=Double.parseDouble(properties.getProperty("HeavyOilCrackType3ProduceButane"));
        crackType3ProduceLightOil=Double.parseDouble(properties.getProperty("HeavyOilCrackType3ProduceLightOil"));
        crackType3ProduceNaphtha=Double.parseDouble(properties.getProperty("HeavyOilCrackType3ProduceNaphtha"));
        //
        crackType4ProduceToluene=Double.parseDouble(properties.getProperty("HeavyOilCrackType4ProduceToluene"));
        crackType4ProduceBenzene=Double.parseDouble(properties.getProperty("HeavyOilCrackType4ProduceBenzene"));
        crackType4ProduceButene=Double.parseDouble(properties.getProperty("HeavyOilCrackType4ProduceButene"));
        crackType4ProduceButadiene=Double.parseDouble(properties.getProperty("HeavyOilCrackType4ProduceButadiene"));
        crackType4ProducePropane=Double.parseDouble(properties.getProperty("HeavyOilCrackType4ProducePropane"));
        crackType4ProduceAcrylic=Double.parseDouble(properties.getProperty("HeavyOilCrackType4ProduceAcrylic"));
        crackType4ProduceEthane=Double.parseDouble(properties.getProperty("HeavyOilCrackType4ProduceEthane"));
        crackType4ProduceVinyl=Double.parseDouble(properties.getProperty("HeavyOilCrackType4ProduceVinyl"));
        crackType4ProduceMethane=Double.parseDouble(properties.getProperty("HeavyOilCrackType4ProduceMethane"));
        crackType4ProduceTinyCarbonDust=Double.parseDouble(properties.getProperty("HeavyOilCrackType4ProduceTinyCarbonDust"));
        crackType4ProduceLightOil=Double.parseDouble(properties.getProperty("HeavyOilCrackType4ProduceLightOil"));
        crackType4ProduceNaphtha=Double.parseDouble(properties.getProperty("HeavyOilCrackType4ProduceNaphtha"));
        //
        crackType5ProduceToluene=Double.parseDouble(properties.getProperty("HeavyOilCrackType5ProduceToluene"));
        crackType5ProduceBenzene=Double.parseDouble(properties.getProperty("HeavyOilCrackType5ProduceBenzene"));
        crackType5ProduceButene=Double.parseDouble(properties.getProperty("HeavyOilCrackType5ProduceButene"));
        crackType5ProduceButadiene=Double.parseDouble(properties.getProperty("HeavyOilCrackType5ProduceButadiene"));
        crackType5ProducePropane=Double.parseDouble(properties.getProperty("HeavyOilCrackType5ProducePropane"));
        crackType5ProduceAcrylic=Double.parseDouble(properties.getProperty("HeavyOilCrackType5ProduceAcrylic"));
        crackType5ProduceEthane=Double.parseDouble(properties.getProperty("HeavyOilCrackType5ProduceEthane"));
        crackType5ProduceVinyl=Double.parseDouble(properties.getProperty("HeavyOilCrackType5ProduceVinyl"));
        crackType5ProduceMethane=Double.parseDouble(properties.getProperty("HeavyOilCrackType5ProduceMethane"));
        crackType5ProduceTinyCarbonDust=Double.parseDouble(properties.getProperty("HeavyOilCrackType5ProduceTinyCarbonDust"));
        crackType5ProduceLightOil=Double.parseDouble(properties.getProperty("HeavyOilCrackType5ProduceLightOil"));
        crackType5ProduceNaphtha=Double.parseDouble(properties.getProperty("HeavyOilCrackType5ProduceNaphtha"));
        //
        crackType6ProduceToluene=Double.parseDouble(properties.getProperty("HeavyOilCrackType6ProduceToluene"));
        crackType6ProduceBenzene=Double.parseDouble(properties.getProperty("HeavyOilCrackType6ProduceBenzene"));
        crackType6ProduceButene=Double.parseDouble(properties.getProperty("HeavyOilCrackType6ProduceButene"));
        crackType6ProduceButadiene=Double.parseDouble(properties.getProperty("HeavyOilCrackType6ProduceButadiene"));
        crackType6ProducePropane=Double.parseDouble(properties.getProperty("HeavyOilCrackType6ProducePropane"));
        crackType6ProduceAcrylic=Double.parseDouble(properties.getProperty("HeavyOilCrackType6ProduceAcrylic"));
        crackType6ProduceEthane=Double.parseDouble(properties.getProperty("HeavyOilCrackType6ProduceEthane"));
        crackType6ProduceVinyl=Double.parseDouble(properties.getProperty("HeavyOilCrackType6ProduceVinyl"));
        crackType6ProduceMethane=Double.parseDouble(properties.getProperty("HeavyOilCrackType6ProduceMethane"));
        crackType6ProduceTinyCarbonDust=Double.parseDouble(properties.getProperty("HeavyOilCrackType6ProduceTinyCarbonDust"));
        crackType6ProduceLightOil=Double.parseDouble(properties.getProperty("HeavyOilCrackType6ProduceLightOil"));
        crackType6ProduceNaphtha=Double.parseDouble(properties.getProperty("HeavyOilCrackType6ProduceNaphtha"));
    }

    @Override
    public String toString() {
        return "重燃油裂化参数:"+"\n"+
                "直接蒸馏:"+"\n"+
                "直接蒸馏产生苯比率:"+this.crackType0ProduceBenzene+"\n"+
                "直接蒸馏产生甲苯比率:"+this.crackType0ProduceToluene+"\n"+
                "直接蒸馏产生苯酚比率:"+this.crackType0ProducePhenol+"\n"+
                "轻度氢气裂化:"+"\n"+
                "轻度氢气裂化产生甲烷比率:"+this.crackType1ProduceMethane+"\n"+
                "轻度氢气裂化产生乙烷比率:"+this.crackType1ProduceEthane+"\n"+
                "轻度氢气裂化产生丙烷比率:"+this.crackType1ProducePropane+"\n"+
                "轻度氢气裂化产生丁烷比率:"+this.crackType1ProduceButane+"\n"+
                "轻度氢气裂化产生轻燃油比率:"+this.crackType1ProduceLightOil+"\n"+
                "轻度氢气裂化产生石脑油比率:"+this.crackType1ProduceNaphtha+"\n"+
                "中度氢气裂化:"+"\n"+
                "中度氢气裂化产生甲烷比率:"+this.crackType2ProduceMethane+"\n"+
                "中度氢气裂化产生乙烷比率:"+this.crackType2ProduceEthane+"\n"+
                "中度氢气裂化产生丙烷比率:"+this.crackType2ProducePropane+"\n"+
                "中度氢气裂化产生丁烷比率:"+this.crackType2ProduceButane+"\n"+
                "中度氢气裂化产生轻燃油比率:"+this.crackType2ProduceLightOil+"\n"+
                "中度氢气裂化产生石脑油比率:"+this.crackType2ProduceNaphtha+"\n"+
                "重度氢气裂化:"+"\n"+
                "重度氢气裂化产生甲烷比率:"+this.crackType3ProduceMethane+"\n"+
                "重度氢气裂化产生乙烷比率:"+this.crackType3ProduceEthane+"\n"+
                "重度氢气裂化产生丙烷比率:"+this.crackType3ProducePropane+"\n"+
                "重度氢气裂化产生丁烷比率:"+this.crackType3ProduceButane+"\n"+
                "重度氢气裂化产生轻燃油比率:"+this.crackType3ProduceLightOil+"\n"+
                "重度氢气裂化产生石脑油比率:"+this.crackType3ProduceNaphtha+"\n"+
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
                "轻度蒸汽裂化产生石脑油比率:"+this.crackType4ProduceNaphtha+"\n"+
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
                "中度蒸汽裂化产生石脑油比率:"+this.crackType5ProduceNaphtha+"\n"+
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
                "重度蒸汽裂化产生石脑油比率:"+this.crackType6ProduceNaphtha;
    }
}
