package org.example.entity;

import lombok.Getter;
import org.example.Configuration.configurationForHeavyOilCrack;
import org.example.Configuration.mainConfiguration;
import org.example.defines.heavyOilCrackAmountDefine;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Getter
public class Product {
    private String oilType;
    private double HeavyOilAmount;
    private double LightOilAmount;
    private double NaphthaAmount;
    private double GasAmount;
    private double methane;//甲烷
    private double ethane;//乙烷
    private double propane;//丙烷
    private double butane;//丁烷
    private double octane;
    private double helium;//氦气
    private double toluene;//甲苯
    private double benzene;//苯
    private double vinyl;//乙烯
    private double acrylic;//丙烯
    private double butene;//丁烯
    private double butadiene;//丁二烯
    private double phenol;//苯酚
    private double TinyCarbonDust;//小撮碳粉
    private double Fuel;//柴油
    private double CetaneBoostedDiesel;//高十六
    private int GetFuel;//为0时，不生产高十六，为1时，生产柴油，为2时，生产高十六
    private int HeavyOilCrackedType;//重燃油裂化方式
    // 0：直接蒸馏 1：轻度氢气 2：中度氢气 3：重度氢气 4：轻度蒸汽 5：中度蒸汽 6：重度蒸汽
    private int LightOilCrackedType;//轻燃油裂化方式
    // 1：轻度氢气 2：中度氢气 3：重度氢气 4：轻度蒸汽 5：中度蒸汽 6：重度蒸汽
    private int NaphthaCrackedType;//石脑油裂化方式
    // 1：轻度氢气 2：中度氢气 3：重度氢气 4：轻度蒸汽 5：中度蒸汽 6：重度蒸汽
    private int GasCrackedType;//炼油气裂化方式
    // 0：直接蒸馏 1：轻度氢气 2：中度氢气 3：重度氢气 4：轻度蒸汽 5：中度蒸汽 6：重度蒸汽
    private heavyOilCrackAmountDefine define;
    public Product(oil oil,int HeavyOilCrackedType,int LightOilCrackedType,int NaphthaCrackedType,int GasCrackedType,int GetFuel){
        HeavyOilAmount=oil.getProduceHeavyOilAmount();
        LightOilAmount=oil.getProduceLightOilAmount();
        NaphthaAmount= oil.getProduceNaphthaAmount();
        GasAmount= oil.getProduceGasAmount();
        this.HeavyOilCrackedType=HeavyOilCrackedType;
        this.LightOilCrackedType=LightOilCrackedType;
        this.NaphthaCrackedType=NaphthaCrackedType;
        this.GasCrackedType=GasCrackedType;
        this.GetFuel=GetFuel;
        this.oilType=oil.getOilType();
        AnnotationConfigApplicationContext context1=new AnnotationConfigApplicationContext(configurationForHeavyOilCrack.class);
        define=context1.getBean(heavyOilCrackAmountDefine.class);
    }
    private void HeavyOilCrack() throws IllegalArgumentException{
        switch (this.HeavyOilCrackedType){
            // 0：直接蒸馏 1：轻度氢气 2：中度氢气 3：重度氢气 4：轻度蒸汽 5：中度蒸汽 6：重度蒸汽
            case 0->{
                this.benzene=this.benzene+0.4*this.HeavyOilAmount;
                this.toluene=this.toluene+0.4*this.HeavyOilAmount;
                this.phenol=this.phenol+0.25*this.HeavyOilAmount;
            }
            case 1->{

            }
            case 2->{

            }
            case 3->{

            }
            case 4->{

            }
            case 5->{

            }
            case 6->{

            }
            default -> {
                throw new IllegalArgumentException("裂化类型错误!");
            }
        }
    }

}
