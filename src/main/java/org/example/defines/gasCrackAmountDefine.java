package org.example.defines;

import lombok.Getter;
import lombok.ToString;
import lombok.extern.java.Log;
import org.apache.ibatis.io.Resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
@Getter
@Log
@ToString
public class gasCrackAmountDefine {
    @Qualifier("gasCrackSettings")
    @Autowired
    private String propertiesFileName;
    private final double crackType0ProduceButane;//直接蒸馏产生丁烷
    private final double crackType0ProducePropane;//直接蒸馏产生丙烷
    private final double crackType0ProduceEthane;//直接蒸馏产生乙烷
    private final double crackType0ProduceMethane;//直接蒸馏产生甲烷
    private final double crackType0ProduceHelium;//直接蒸馏产生氦气
    private final double crackType1ProduceMethane;//轻度氢气裂化产生甲烷
    private final double crackType1ProduceHelium;//轻度氢气裂化产生氦气
    private final double crackType2ProduceMethane;//中度氢气裂化产生甲烷
    private final double crackType2ProduceHelium;//中度氢气裂化产生氦气
    private final double crackType3ProduceMethane;//重度氢气裂化产生甲烷
    private final double crackType3ProduceHelium;//重度氢气裂化产生氦气
    private final double crackType4ProduceHelium;//轻度蒸汽裂化产生氦气
    private final double crackType4ProduceMethane;//轻度蒸汽裂化产生甲烷
    private final double crackType4ProduceVinyl;//轻度蒸汽裂化产生乙烯
    private final double crackType4ProduceEthane;//轻度蒸汽裂化产生乙烷
    private final double crackType4ProduceAcrylic;//轻度蒸汽裂化产生丙烯
    private final double crackType4ProduceTinyCarbonDust;//轻度蒸汽裂化产生小撮碳粉
    private final double crackType5ProduceHelium;//中度蒸汽裂化产生氦气
    private final double crackType5ProduceMethane;//中度蒸汽裂化产生甲烷
    private final double crackType5ProduceVinyl;//中度蒸汽裂化产生乙烯
    private final double crackType5ProduceEthane;//中度蒸汽裂化产生乙烷
    private final double crackType5ProduceAcrylic;//中度蒸汽裂化产生丙烯
    private final double crackType5ProduceTinyCarbonDust;//中度蒸汽裂化产生小撮碳粉
    private final double crackType6ProduceHelium;//重度蒸汽裂化产生氦气
    private final double crackType6ProduceMethane;//重度蒸汽裂化产生甲烷
    private final double crackType6ProduceVinyl;//重度蒸汽裂化产生乙烯
    private final double crackType6ProduceEthane;//重度蒸汽裂化产生乙烷
    private final double crackType6ProduceAcrylic;//重度蒸汽裂化产生丙烯
    private final double crackType6ProduceTinyCarbonDust;//重度蒸汽裂化产生小撮碳粉
    public gasCrackAmountDefine(@Qualifier("gasCrackSettings") String propertiesFileName){
        this.propertiesFileName=propertiesFileName;
        Properties properties=new Properties();
        try {
            properties.load(Resources.getResourceAsStream(propertiesFileName));
        }catch (Exception e){
            log.severe(e.getMessage());
        }
        crackType0ProduceButane= Double.parseDouble(properties.getProperty("gasCrackType0ProduceButane"));
        crackType0ProducePropane= Double.parseDouble(properties.getProperty("gasCrackType0ProducePropane"));
        crackType0ProduceEthane= Double.parseDouble(properties.getProperty("gasCrackType0ProduceEthane"));
        crackType0ProduceMethane= Double.parseDouble(properties.getProperty("gasCrackType0ProduceMethane"));
        crackType0ProduceHelium= Double.parseDouble(properties.getProperty("gasCrackType0ProduceHelium"));
        //
        crackType1ProduceMethane= Double.parseDouble(properties.getProperty("gasCrackType1ProduceMethane"));
        crackType1ProduceHelium= Double.parseDouble(properties.getProperty("gasCrackType1ProduceHelium"));
        //
        crackType2ProduceMethane= Double.parseDouble(properties.getProperty("gasCrackType2ProduceMethane"));
        crackType2ProduceHelium= Double.parseDouble(properties.getProperty("gasCrackType2ProduceHelium"));
        //
        crackType3ProduceMethane= Double.parseDouble(properties.getProperty("gasCrackType3ProduceMethane"));
        crackType3ProduceHelium= Double.parseDouble(properties.getProperty("gasCrackType3ProduceHelium"));
        //
        crackType4ProduceHelium=Double.parseDouble(properties.getProperty("gasCrackType4ProduceHelium"));
        crackType4ProduceMethane=Double.parseDouble(properties.getProperty("gasCrackType4ProduceMethane"));
        crackType4ProduceVinyl=Double.parseDouble(properties.getProperty("gasCrackType4ProduceVinyl"));
        crackType4ProduceEthane=Double.parseDouble(properties.getProperty("gasCrackType4ProduceEthane"));
        crackType4ProduceAcrylic=Double.parseDouble(properties.getProperty("gasCrackType4ProduceAcrylic"));
        crackType4ProduceTinyCarbonDust=Double.parseDouble(properties.getProperty("gasCrackType4ProduceTinyCarbonDust"));
        //
        crackType5ProduceHelium=Double.parseDouble(properties.getProperty("gasCrackType5ProduceHelium"));
        crackType5ProduceMethane=Double.parseDouble(properties.getProperty("gasCrackType5ProduceMethane"));
        crackType5ProduceVinyl=Double.parseDouble(properties.getProperty("gasCrackType5ProduceVinyl"));
        crackType5ProduceEthane=Double.parseDouble(properties.getProperty("gasCrackType5ProduceEthane"));
        crackType5ProduceAcrylic=Double.parseDouble(properties.getProperty("gasCrackType5ProduceAcrylic"));
        crackType5ProduceTinyCarbonDust=Double.parseDouble(properties.getProperty("gasCrackType5ProduceTinyCarbonDust"));
        //
        crackType6ProduceHelium=Double.parseDouble(properties.getProperty("gasCrackType6ProduceHelium"));
        crackType6ProduceMethane=Double.parseDouble(properties.getProperty("gasCrackType6ProduceMethane"));
        crackType6ProduceVinyl=Double.parseDouble(properties.getProperty("gasCrackType6ProduceVinyl"));
        crackType6ProduceEthane=Double.parseDouble(properties.getProperty("gasCrackType6ProduceEthane"));
        crackType6ProduceAcrylic=Double.parseDouble(properties.getProperty("gasCrackType6ProduceAcrylic"));
        crackType6ProduceTinyCarbonDust=Double.parseDouble(properties.getProperty("gasCrackType6ProduceTinyCarbonDust"));
    }
    @Override
    public String toString(){
        return "炼油气裂化参数:"+"\n"+
                "直接蒸馏:"+"\n"+
                "直接蒸馏产生丁烷比率:"+this.crackType0ProduceButane+"\n"+
                "直接蒸馏产生丙烷比率:"+this.crackType0ProducePropane+"\n"+
                "直接蒸馏产生乙烷比率:"+this.crackType0ProduceEthane+"\n"+
                "直接蒸馏产生甲烷比率:"+this.crackType0ProduceMethane+"\n"+
                "直接蒸馏产生氦气比率:"+this.crackType0ProduceHelium+"\n"+
                "轻度氢气裂化:"+"\n"+
                "轻度氢气裂化产生甲烷比率:"+this.crackType1ProduceMethane+"\n"+
                "轻度氢气裂化产生氦气比率:"+this.crackType1ProduceHelium+"\n"+
                "中度氢气裂化:"+"\n"+
                "中度氢气裂化产生甲烷比率:"+this.crackType2ProduceMethane+"\n"+
                "中度氢气裂化产生氦气比率:"+this.crackType2ProduceHelium+"\n"+
                "重度氢气裂化:"+"\n"+
                "重度氢气裂化产生甲烷比率:"+this.crackType3ProduceMethane+"\n"+
                "重度氢气裂化产生氦气比率:"+this.crackType3ProduceHelium+"\n"+
                "轻度蒸汽裂化:"+"\n"+
                "轻度蒸汽裂化产生氦气比率:"+this.crackType4ProduceHelium+"\n"+
                "轻度蒸汽裂化产生甲烷比率:"+this.crackType4ProduceMethane+"\n"+
                "轻度蒸汽裂化产生乙烯比率:"+this.crackType4ProduceVinyl+"\n"+
                "轻度蒸汽裂化产生乙烷比率:"+this.crackType4ProduceEthane+"\n"+
                "轻度蒸汽裂化产生丙烯比率:"+this.crackType4ProduceAcrylic+"\n"+
                "轻度蒸汽裂化产生小撮碳粉比率:"+this.crackType4ProduceTinyCarbonDust+"\n"+
                "中度蒸汽裂化:"+"\n"+
                "中度蒸汽裂化产生氦气比率:"+this.crackType5ProduceHelium+"\n"+
                "中度蒸汽裂化产生甲烷比率:"+this.crackType5ProduceMethane+"\n"+
                "中度蒸汽裂化产生乙烯比率:"+this.crackType5ProduceVinyl+"\n"+
                "中度蒸汽裂化产生乙烷比率:"+this.crackType5ProduceEthane+"\n"+
                "中度蒸汽裂化产生丙烯比率:"+this.crackType5ProduceAcrylic+"\n"+
                "中度蒸汽裂化产生小撮碳粉比率:"+this.crackType5ProduceTinyCarbonDust+"\n"+
                "重度蒸汽裂化:"+"\n"+
                "重度蒸汽裂化产生氦气比率:"+this.crackType6ProduceHelium+"\n"+
                "重度蒸汽裂化产生甲烷比率:"+this.crackType6ProduceMethane+"\n"+
                "重度蒸汽裂化产生乙烯比率:"+this.crackType6ProduceVinyl+"\n"+
                "重度蒸汽裂化产生乙烷比率:"+this.crackType6ProduceEthane+"\n"+
                "重度蒸汽裂化产生丙烯比率:"+this.crackType6ProduceAcrylic+"\n"+
                "重度蒸汽裂化产生小撮碳粉比率:"+this.crackType6ProduceTinyCarbonDust;
    }

}
