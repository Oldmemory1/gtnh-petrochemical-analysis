package org.example.entity;

import lombok.Getter;
import lombok.extern.java.Log;
import org.example.Configuration.mainConfiguration;
import org.example.defines.gasCrackAmountDefine;
import org.example.defines.heavyOilCrackAmountDefine;
import org.example.defines.lightOilCrackAmountDefine;
import org.example.defines.naphthaCrackAmountDefine;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@Getter
@Log
public class Product {
    private final String oilType;
    private double HeavyOilAmount;
    private double LightOilAmount;
    private double NaphthaAmount;
    private double GasAmount;
    private double methane;//甲烷
    private double ethane;//乙烷
    private double propane;//丙烷
    private double butane;//丁烷
    private double octane;//辛烷
    private double helium;//氦气
    private double toluene;//甲苯
    private double benzene;//苯
    private double vinyl;//乙烯
    private double acrylic;//丙烯
    private double butene;//丁烯
    private double butadiene;//丁二烯
    private double phenol;//苯酚
    private double tinyCarbonDust;//小撮碳粉
    private double fuel;//柴油
    private final boolean GetFuel;//为0时，不生产柴油，为1时，生产柴油
    private final int HeavyOilCrackedType;//重燃油裂化方式
    // 0：直接蒸馏 1：轻度氢气 2：中度氢气 3：重度氢气 4：轻度蒸汽 5：中度蒸汽 6：重度蒸汽
    private final int LightOilCrackedType;//轻燃油裂化方式
    // 1：轻度氢气 2：中度氢气 3：重度氢气 4：轻度蒸汽 5：中度蒸汽 6：重度蒸汽
    private final int NaphthaCrackedType;//石脑油裂化方式
    // 1：轻度氢气 2：中度氢气 3：重度氢气 4：轻度蒸汽 5：中度蒸汽 6：重度蒸汽
    private final int GasCrackedType;//炼油气裂化方式
    // 0：直接蒸馏 1：轻度氢气 2：中度氢气 3：重度氢气 4：轻度蒸汽 5：中度蒸汽 6：重度蒸汽
    private final heavyOilCrackAmountDefine heavyOilCrackAmountDefine;
    private final lightOilCrackAmountDefine lightOilCrackAmountDefine;
    private final naphthaCrackAmountDefine naphthaCrackAmountDefine;
    private final gasCrackAmountDefine gasCrackAmountDefine;
    public Product(oil oil,int HeavyOilCrackedType,int LightOilCrackedType,int NaphthaCrackedType,int GasCrackedType,boolean GetFuel){
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
        AnnotationConfigApplicationContext context1=new AnnotationConfigApplicationContext(mainConfiguration.class);
        heavyOilCrackAmountDefine=context1.getBean(org.example.defines.heavyOilCrackAmountDefine.class);
        lightOilCrackAmountDefine=context1.getBean(org.example.defines.lightOilCrackAmountDefine.class);
        naphthaCrackAmountDefine=context1.getBean(org.example.defines.naphthaCrackAmountDefine.class);
        gasCrackAmountDefine=context1.getBean(org.example.defines.gasCrackAmountDefine.class);
    }

    private void heavyOilCrack() throws IllegalArgumentException{
        switch (this.HeavyOilCrackedType){
            // 0：直接蒸馏 1：轻度氢气 2：中度氢气 3：重度氢气 4：轻度蒸汽 5：中度蒸汽 6：重度蒸汽
            case 0->{
                this.benzene=this.benzene+heavyOilCrackAmountDefine.getCrackType0ProduceBenzene()*this.HeavyOilAmount;
                this.toluene=this.toluene+heavyOilCrackAmountDefine.getCrackType0ProduceToluene()*this.HeavyOilAmount;
                this.phenol=this.phenol+heavyOilCrackAmountDefine.getCrackType0ProducePhenol()*this.HeavyOilAmount;
                this.HeavyOilAmount=0;
            }
            case 1->{
                this.methane=this.methane+heavyOilCrackAmountDefine.getCrackType1ProduceMethane()*this.HeavyOilAmount;
                this.ethane=this.ethane+heavyOilCrackAmountDefine.getCrackType1ProduceEthane()*this.HeavyOilAmount;
                this.propane=this.propane+heavyOilCrackAmountDefine.getCrackType1ProducePropane()*this.HeavyOilAmount;
                this.butane=this.butane+heavyOilCrackAmountDefine.getCrackType1ProduceButane()*this.HeavyOilAmount;
                this.LightOilAmount=this.LightOilAmount+heavyOilCrackAmountDefine.getCrackType1ProduceLightOil()*this.HeavyOilAmount;
                this.NaphthaAmount=this.NaphthaAmount+heavyOilCrackAmountDefine.getCrackType1ProduceNaphtha()*this.HeavyOilAmount;
                this.HeavyOilAmount=0;
            }
            case 2->{
                this.methane=this.methane+heavyOilCrackAmountDefine.getCrackType2ProduceMethane()*this.HeavyOilAmount;
                this.ethane=this.ethane+heavyOilCrackAmountDefine.getCrackType2ProduceEthane()*this.HeavyOilAmount;
                this.propane=this.propane+heavyOilCrackAmountDefine.getCrackType2ProducePropane()*this.HeavyOilAmount;
                this.butane=this.butane+heavyOilCrackAmountDefine.getCrackType2ProduceButane()*this.HeavyOilAmount;
                this.LightOilAmount=this.LightOilAmount+heavyOilCrackAmountDefine.getCrackType2ProduceLightOil()*this.HeavyOilAmount;
                this.NaphthaAmount=this.NaphthaAmount+heavyOilCrackAmountDefine.getCrackType2ProduceNaphtha()*this.HeavyOilAmount;
                this.HeavyOilAmount=0;
            }
            case 3->{
                this.methane=this.methane+heavyOilCrackAmountDefine.getCrackType3ProduceMethane()*this.HeavyOilAmount;
                this.ethane=this.ethane+heavyOilCrackAmountDefine.getCrackType3ProduceEthane()*this.HeavyOilAmount;
                this.propane=this.propane+heavyOilCrackAmountDefine.getCrackType3ProducePropane()*this.HeavyOilAmount;
                this.butane=this.butane+heavyOilCrackAmountDefine.getCrackType3ProduceButane()*this.HeavyOilAmount;
                this.LightOilAmount=this.LightOilAmount+heavyOilCrackAmountDefine.getCrackType3ProduceLightOil()*this.HeavyOilAmount;
                this.NaphthaAmount=this.NaphthaAmount+heavyOilCrackAmountDefine.getCrackType3ProduceNaphtha()*this.HeavyOilAmount;
                this.HeavyOilAmount=0;
            }
            case 4->{
                this.toluene=this.toluene+heavyOilCrackAmountDefine.getCrackType4ProduceToluene()*this.HeavyOilAmount;
                this.benzene=this.benzene+heavyOilCrackAmountDefine.getCrackType4ProduceBenzene()*this.HeavyOilAmount;
                this.butene=this.butene+heavyOilCrackAmountDefine.getCrackType4ProduceButene()*this.HeavyOilAmount;
                this.butadiene=butadiene+heavyOilCrackAmountDefine.getCrackType4ProduceButadiene()*this.HeavyOilAmount;
                this.propane=this.propane+heavyOilCrackAmountDefine.getCrackType4ProducePropane()*this.HeavyOilAmount;
                this.acrylic=this.acrylic+heavyOilCrackAmountDefine.getCrackType4ProduceAcrylic()*this.HeavyOilAmount;
                this.ethane=this.ethane+heavyOilCrackAmountDefine.getCrackType4ProduceEthane()*this.HeavyOilAmount;
                this.vinyl=this.vinyl+heavyOilCrackAmountDefine.getCrackType4ProduceVinyl()*this.HeavyOilAmount;
                this.methane=this.methane+heavyOilCrackAmountDefine.getCrackType4ProduceMethane()*this.HeavyOilAmount;
                this.LightOilAmount=this.LightOilAmount+heavyOilCrackAmountDefine.getCrackType4ProduceLightOil()*this.HeavyOilAmount;
                this.NaphthaAmount=this.NaphthaAmount+heavyOilCrackAmountDefine.getCrackType4ProduceNaphtha()*this.HeavyOilAmount;
                this.HeavyOilAmount=0;
            }
            case 5->{
                this.toluene=this.toluene+heavyOilCrackAmountDefine.getCrackType5ProduceToluene()*this.HeavyOilAmount;
                this.benzene=this.benzene+heavyOilCrackAmountDefine.getCrackType5ProduceBenzene()*this.HeavyOilAmount;
                this.butene=this.butene+heavyOilCrackAmountDefine.getCrackType5ProduceButene()*this.HeavyOilAmount;
                this.butadiene=butadiene+heavyOilCrackAmountDefine.getCrackType5ProduceButadiene()*this.HeavyOilAmount;
                this.propane=this.propane+heavyOilCrackAmountDefine.getCrackType5ProducePropane()*this.HeavyOilAmount;
                this.acrylic=this.acrylic+heavyOilCrackAmountDefine.getCrackType5ProduceAcrylic()*this.HeavyOilAmount;
                this.ethane=this.ethane+heavyOilCrackAmountDefine.getCrackType5ProduceEthane()*this.HeavyOilAmount;
                this.vinyl=this.vinyl+heavyOilCrackAmountDefine.getCrackType5ProduceVinyl()*this.HeavyOilAmount;
                this.methane=this.methane+heavyOilCrackAmountDefine.getCrackType5ProduceMethane()*this.HeavyOilAmount;
                this.LightOilAmount=this.LightOilAmount+heavyOilCrackAmountDefine.getCrackType5ProduceLightOil()*this.HeavyOilAmount;
                this.NaphthaAmount=this.NaphthaAmount+heavyOilCrackAmountDefine.getCrackType5ProduceNaphtha()*this.HeavyOilAmount;
                this.HeavyOilAmount=0;
            }
            case 6->{
                this.toluene=this.toluene+heavyOilCrackAmountDefine.getCrackType6ProduceToluene()*this.HeavyOilAmount;
                this.benzene=this.benzene+heavyOilCrackAmountDefine.getCrackType6ProduceBenzene()*this.HeavyOilAmount;
                this.butene=this.butene+heavyOilCrackAmountDefine.getCrackType6ProduceButene()*this.HeavyOilAmount;
                this.butadiene=butadiene+heavyOilCrackAmountDefine.getCrackType6ProduceButadiene()*this.HeavyOilAmount;
                this.propane=this.propane+heavyOilCrackAmountDefine.getCrackType6ProducePropane()*this.HeavyOilAmount;
                this.acrylic=this.acrylic+heavyOilCrackAmountDefine.getCrackType6ProduceAcrylic()*this.HeavyOilAmount;
                this.ethane=this.ethane+heavyOilCrackAmountDefine.getCrackType6ProduceEthane()*this.HeavyOilAmount;
                this.vinyl=this.vinyl+heavyOilCrackAmountDefine.getCrackType6ProduceVinyl()*this.HeavyOilAmount;
                this.methane=this.methane+heavyOilCrackAmountDefine.getCrackType6ProduceMethane()*this.HeavyOilAmount;
                this.LightOilAmount=this.LightOilAmount+heavyOilCrackAmountDefine.getCrackType6ProduceLightOil()*this.HeavyOilAmount;
                this.NaphthaAmount=this.NaphthaAmount+heavyOilCrackAmountDefine.getCrackType6ProduceNaphtha()*this.HeavyOilAmount;
                this.HeavyOilAmount=0;
            }
            default -> throw new IllegalArgumentException("裂化类型错误!");
        }
        //log.info(this.toString());
    }
    private void lightOilCrack() throws IllegalArgumentException{
        //1：轻度氢气 2：中度氢气 3：重度氢气 4：轻度蒸汽 5：中度蒸汽 6：重度蒸汽
        switch (this.LightOilCrackedType) {
            case 1 -> {
                this.octane=this.octane+lightOilCrackAmountDefine.getCrackType1ProduceOctane()*this.LightOilAmount;
                this.butane=this.butane+lightOilCrackAmountDefine.getCrackType1ProduceButane()*this.LightOilAmount;
                this.propane=this.propane+lightOilCrackAmountDefine.getCrackType1ProducePropane()*this.LightOilAmount;
                this.ethane=this.ethane+lightOilCrackAmountDefine.getCrackType1ProduceEthane()*this.LightOilAmount;
                this.methane=this.methane+lightOilCrackAmountDefine.getCrackType1ProduceMethane()*this.LightOilAmount;
                this.NaphthaAmount=this.NaphthaAmount+lightOilCrackAmountDefine.getCrackType1ProduceNaphtha()*this.LightOilAmount;
                this.LightOilAmount=0;
            }
            case 2 -> {
                this.octane=this.octane+lightOilCrackAmountDefine.getCrackType2ProduceOctane()*this.LightOilAmount;
                this.butane=this.butane+lightOilCrackAmountDefine.getCrackType2ProduceButane()*this.LightOilAmount;
                this.propane=this.propane+lightOilCrackAmountDefine.getCrackType2ProducePropane()*this.LightOilAmount;
                this.ethane=this.ethane+lightOilCrackAmountDefine.getCrackType2ProduceEthane()*this.LightOilAmount;
                this.methane=this.methane+lightOilCrackAmountDefine.getCrackType2ProduceMethane()*this.LightOilAmount;
                this.NaphthaAmount=this.NaphthaAmount+lightOilCrackAmountDefine.getCrackType2ProduceNaphtha()*this.LightOilAmount;
                this.LightOilAmount=0;
            }
            case 3 -> {
                this.octane=this.octane+lightOilCrackAmountDefine.getCrackType3ProduceOctane()*this.LightOilAmount;
                this.butane=this.butane+lightOilCrackAmountDefine.getCrackType3ProduceButane()*this.LightOilAmount;
                this.propane=this.propane+lightOilCrackAmountDefine.getCrackType3ProducePropane()*this.LightOilAmount;
                this.ethane=this.ethane+lightOilCrackAmountDefine.getCrackType3ProduceEthane()*this.LightOilAmount;
                this.methane=this.methane+lightOilCrackAmountDefine.getCrackType3ProduceMethane()*this.LightOilAmount;
                this.NaphthaAmount=this.NaphthaAmount+lightOilCrackAmountDefine.getCrackType3ProduceNaphtha()*this.LightOilAmount;
                this.LightOilAmount=0;
            }
            case 4 -> {
                this.toluene=this.toluene+lightOilCrackAmountDefine.getCrackType4ProduceToluene()*this.LightOilAmount;
                this.benzene=this.benzene+lightOilCrackAmountDefine.getCrackType4ProduceBenzene()*this.LightOilAmount;
                this.butene=this.butene+lightOilCrackAmountDefine.getCrackType4ProduceButene()*this.LightOilAmount;
                this.butadiene=this.butadiene+lightOilCrackAmountDefine.getCrackType4ProduceButadiene()*this.LightOilAmount;
                this.propane=this.propane+lightOilCrackAmountDefine.getCrackType4ProducePropane()*this.LightOilAmount;
                this.acrylic=this.acrylic+lightOilCrackAmountDefine.getCrackType4ProduceAcrylic()*this.LightOilAmount;
                this.ethane=this.ethane+lightOilCrackAmountDefine.getCrackType4ProduceEthane()*this.LightOilAmount;
                this.vinyl=this.vinyl+lightOilCrackAmountDefine.getCrackType4ProduceVinyl()*this.LightOilAmount;
                this.methane=this.methane+lightOilCrackAmountDefine.getCrackType4ProduceMethane()*this.LightOilAmount;
                this.tinyCarbonDust=this.tinyCarbonDust+lightOilCrackAmountDefine.getCrackType4ProduceTinyCarbonDust()*this.LightOilAmount;
                this.HeavyOilAmount=this.HeavyOilAmount+lightOilCrackAmountDefine.getCrackType4ProduceHeavyOil()*this.LightOilAmount;
                this.NaphthaAmount=this.NaphthaAmount+lightOilCrackAmountDefine.getCrackType4ProduceNaphtha()*this.LightOilAmount;
                this.LightOilAmount=0;
            }
            case 5 -> {
                this.toluene=this.toluene+lightOilCrackAmountDefine.getCrackType5ProduceToluene()*this.LightOilAmount;
                this.benzene=this.benzene+lightOilCrackAmountDefine.getCrackType5ProduceBenzene()*this.LightOilAmount;
                this.butene=this.butene+lightOilCrackAmountDefine.getCrackType5ProduceButene()*this.LightOilAmount;
                this.butadiene=this.butadiene+lightOilCrackAmountDefine.getCrackType5ProduceButadiene()*this.LightOilAmount;
                this.propane=this.propane+lightOilCrackAmountDefine.getCrackType5ProducePropane()*this.LightOilAmount;
                this.acrylic=this.acrylic+lightOilCrackAmountDefine.getCrackType5ProduceAcrylic()*this.LightOilAmount;
                this.ethane=this.ethane+lightOilCrackAmountDefine.getCrackType5ProduceEthane()*this.LightOilAmount;
                this.vinyl=this.vinyl+lightOilCrackAmountDefine.getCrackType5ProduceVinyl()*this.LightOilAmount;
                this.methane=this.methane+lightOilCrackAmountDefine.getCrackType5ProduceMethane()*this.LightOilAmount;
                this.tinyCarbonDust=this.tinyCarbonDust+lightOilCrackAmountDefine.getCrackType5ProduceTinyCarbonDust()*this.LightOilAmount;
                this.HeavyOilAmount=this.HeavyOilAmount+lightOilCrackAmountDefine.getCrackType5ProduceHeavyOil()*this.LightOilAmount;
                this.NaphthaAmount=this.NaphthaAmount+lightOilCrackAmountDefine.getCrackType5ProduceNaphtha()*this.LightOilAmount;
                this.LightOilAmount=0;
            }
            case 6 -> {
                this.toluene=this.toluene+lightOilCrackAmountDefine.getCrackType6ProduceToluene()*this.LightOilAmount;
                this.benzene=this.benzene+lightOilCrackAmountDefine.getCrackType6ProduceBenzene()*this.LightOilAmount;
                this.butene=this.butene+lightOilCrackAmountDefine.getCrackType6ProduceButene()*this.LightOilAmount;
                this.butadiene=this.butadiene+lightOilCrackAmountDefine.getCrackType6ProduceButadiene()*this.LightOilAmount;
                this.propane=this.propane+lightOilCrackAmountDefine.getCrackType6ProducePropane()*this.LightOilAmount;
                this.acrylic=this.acrylic+lightOilCrackAmountDefine.getCrackType6ProduceAcrylic()*this.LightOilAmount;
                this.ethane=this.ethane+lightOilCrackAmountDefine.getCrackType6ProduceEthane()*this.LightOilAmount;
                this.vinyl=this.vinyl+lightOilCrackAmountDefine.getCrackType6ProduceVinyl()*this.LightOilAmount;
                this.methane=this.methane+lightOilCrackAmountDefine.getCrackType6ProduceMethane()*this.LightOilAmount;
                this.tinyCarbonDust=this.tinyCarbonDust+lightOilCrackAmountDefine.getCrackType6ProduceTinyCarbonDust()*this.LightOilAmount;
                this.HeavyOilAmount=this.HeavyOilAmount+lightOilCrackAmountDefine.getCrackType6ProduceHeavyOil()*this.LightOilAmount;
                this.NaphthaAmount=this.NaphthaAmount+lightOilCrackAmountDefine.getCrackType6ProduceNaphtha()*this.LightOilAmount;
                this.LightOilAmount=0;
            }
            default -> throw new IllegalArgumentException("裂化类型错误");
        }
        log.info(this.toString());
    }
    private void naphthaCrack() throws IllegalArgumentException{
        //1：轻度氢气 2：中度氢气 3：重度氢气 4：轻度蒸汽 5：中度蒸汽 6：重度蒸汽
        switch (this.NaphthaCrackedType){
            case 1->{
                this.butane=this.butane+naphthaCrackAmountDefine.getCrackType1ProduceButane()*this.NaphthaAmount;
                this.propane=this.propane+naphthaCrackAmountDefine.getCrackType1ProducePropane()*this.NaphthaAmount;
                this.ethane=this.ethane+naphthaCrackAmountDefine.getCrackType1ProduceEthane()*this.NaphthaAmount;
                this.methane=this.methane+naphthaCrackAmountDefine.getCrackType1ProduceMethane()*this.NaphthaAmount;
                this.NaphthaAmount=0;
            }
            case 2->{
                this.butane=this.butane+naphthaCrackAmountDefine.getCrackType2ProduceButane()*this.NaphthaAmount;
                this.propane=this.propane+naphthaCrackAmountDefine.getCrackType2ProducePropane()*this.NaphthaAmount;
                this.ethane=this.ethane+naphthaCrackAmountDefine.getCrackType2ProduceEthane()*this.NaphthaAmount;
                this.methane=this.methane+naphthaCrackAmountDefine.getCrackType2ProduceMethane()*this.NaphthaAmount;
                this.NaphthaAmount=0;
            }
            case 3->{
                this.butane=this.butane+naphthaCrackAmountDefine.getCrackType3ProduceButane()*this.NaphthaAmount;
                this.propane=this.propane+naphthaCrackAmountDefine.getCrackType3ProducePropane()*this.NaphthaAmount;
                this.ethane=this.ethane+naphthaCrackAmountDefine.getCrackType3ProduceEthane()*this.NaphthaAmount;
                this.methane=this.methane+naphthaCrackAmountDefine.getCrackType3ProduceMethane()*this.NaphthaAmount;
                this.NaphthaAmount=0;
            }
            case 4->{
                this.toluene=this.toluene+naphthaCrackAmountDefine.getCrackType4ProduceToluene()*this.NaphthaAmount;
                this.benzene=this.benzene+naphthaCrackAmountDefine.getCrackType4ProduceBenzene()*this.NaphthaAmount;
                this.butene=this.butene+naphthaCrackAmountDefine.getCrackType4ProduceButene()*this.NaphthaAmount;
                this.butadiene=this.butadiene+naphthaCrackAmountDefine.getCrackType4ProduceButadiene()*this.NaphthaAmount;
                this.propane=this.propane+naphthaCrackAmountDefine.getCrackType4ProducePropane()*this.NaphthaAmount;
                this.acrylic=this.acrylic+naphthaCrackAmountDefine.getCrackType4ProduceAcrylic()*this.NaphthaAmount;
                this.ethane=this.ethane+naphthaCrackAmountDefine.getCrackType4ProduceEthane()*this.NaphthaAmount;
                this.vinyl=this.vinyl+naphthaCrackAmountDefine.getCrackType4ProduceVinyl()*this.NaphthaAmount;
                this.methane=this.methane+naphthaCrackAmountDefine.getCrackType4ProduceMethane()*this.NaphthaAmount;
                this.tinyCarbonDust=this.tinyCarbonDust+naphthaCrackAmountDefine.getCrackType4ProduceTinyCarbonDust()*this.NaphthaAmount;
                this.LightOilAmount=this.LightOilAmount+naphthaCrackAmountDefine.getCrackType4ProduceLightOil()*this.NaphthaAmount;
                this.HeavyOilAmount=this.HeavyOilAmount+naphthaCrackAmountDefine.getCrackType4ProduceHeavyOil()*this.NaphthaAmount;
                this.NaphthaAmount=0;
            }
            case 5->{
                this.toluene=this.toluene+naphthaCrackAmountDefine.getCrackType5ProduceToluene()*this.NaphthaAmount;
                this.benzene=this.benzene+naphthaCrackAmountDefine.getCrackType5ProduceBenzene()*this.NaphthaAmount;
                this.butene=this.butene+naphthaCrackAmountDefine.getCrackType5ProduceButene()*this.NaphthaAmount;
                this.butadiene=this.butadiene+naphthaCrackAmountDefine.getCrackType5ProduceButadiene()*this.NaphthaAmount;
                this.propane=this.propane+naphthaCrackAmountDefine.getCrackType5ProducePropane()*this.NaphthaAmount;
                this.acrylic=this.acrylic+naphthaCrackAmountDefine.getCrackType5ProduceAcrylic()*this.NaphthaAmount;
                this.ethane=this.ethane+naphthaCrackAmountDefine.getCrackType5ProduceEthane()*this.NaphthaAmount;
                this.vinyl=this.vinyl+naphthaCrackAmountDefine.getCrackType5ProduceVinyl()*this.NaphthaAmount;
                this.methane=this.methane+naphthaCrackAmountDefine.getCrackType5ProduceMethane()*this.NaphthaAmount;
                this.tinyCarbonDust=this.tinyCarbonDust+naphthaCrackAmountDefine.getCrackType5ProduceTinyCarbonDust()*this.NaphthaAmount;
                this.LightOilAmount=this.LightOilAmount+naphthaCrackAmountDefine.getCrackType5ProduceLightOil()*this.NaphthaAmount;
                this.HeavyOilAmount=this.HeavyOilAmount+naphthaCrackAmountDefine.getCrackType5ProduceHeavyOil()*this.NaphthaAmount;
                this.NaphthaAmount=0;
            }
            case 6->{
                this.toluene=this.toluene+naphthaCrackAmountDefine.getCrackType6ProduceToluene()*this.NaphthaAmount;
                this.benzene=this.benzene+naphthaCrackAmountDefine.getCrackType6ProduceBenzene()*this.NaphthaAmount;
                this.butene=this.butene+naphthaCrackAmountDefine.getCrackType6ProduceButene()*this.NaphthaAmount;
                this.butadiene=this.butadiene+naphthaCrackAmountDefine.getCrackType6ProduceButadiene()*this.NaphthaAmount;
                this.propane=this.propane+naphthaCrackAmountDefine.getCrackType6ProducePropane()*this.NaphthaAmount;
                this.acrylic=this.acrylic+naphthaCrackAmountDefine.getCrackType6ProduceAcrylic()*this.NaphthaAmount;
                this.ethane=this.ethane+naphthaCrackAmountDefine.getCrackType6ProduceEthane()*this.NaphthaAmount;
                this.vinyl=this.vinyl+naphthaCrackAmountDefine.getCrackType6ProduceVinyl()*this.NaphthaAmount;
                this.methane=this.methane+naphthaCrackAmountDefine.getCrackType6ProduceMethane()*this.NaphthaAmount;
                this.tinyCarbonDust=this.tinyCarbonDust+naphthaCrackAmountDefine.getCrackType6ProduceTinyCarbonDust()*this.NaphthaAmount;
                this.LightOilAmount=this.LightOilAmount+naphthaCrackAmountDefine.getCrackType6ProduceLightOil()*this.NaphthaAmount;
                this.HeavyOilAmount=this.HeavyOilAmount+naphthaCrackAmountDefine.getCrackType6ProduceHeavyOil()*this.NaphthaAmount;
                this.NaphthaAmount=0;
            }
            default -> throw new IllegalArgumentException("裂化类型错误");
        }
        //log.info(this.toString());

    }
    private void gasCrack() throws IllegalArgumentException{
        switch (this.GasCrackedType){
            case 0->{
                this.butane=this.butane+gasCrackAmountDefine.getCrackType0ProduceButane()*this.GasAmount;
                this.propane=this.propane+gasCrackAmountDefine.getCrackType0ProducePropane()*this.GasAmount;
                this.ethane=this.ethane+gasCrackAmountDefine.getCrackType0ProduceEthane()*this.GasAmount;
                this.methane=this.methane+gasCrackAmountDefine.getCrackType0ProduceMethane()*this.GasAmount;
                this.helium=this.helium+gasCrackAmountDefine.getCrackType0ProduceHelium()*this.GasAmount;
                this.GasAmount=0;
            }
            case 1->{
                this.helium=this.helium+gasCrackAmountDefine.getCrackType1ProduceHelium()*this.GasAmount;
                this.methane=this.methane+gasCrackAmountDefine.getCrackType1ProduceMethane()*this.GasAmount;
                this.GasAmount=0;
            }
            case 2->{
                this.helium=this.helium+gasCrackAmountDefine.getCrackType2ProduceHelium()*this.GasAmount;
                this.methane=this.methane+gasCrackAmountDefine.getCrackType2ProduceMethane()*this.GasAmount;
                this.GasAmount=0;
            }
            case 3->{
                this.helium=this.helium+gasCrackAmountDefine.getCrackType3ProduceHelium()*this.GasAmount;
                this.methane=this.methane+gasCrackAmountDefine.getCrackType3ProduceMethane()*this.GasAmount;
                this.GasAmount=0;
            }
            case 4->{
                this.helium=this.helium+gasCrackAmountDefine.getCrackType4ProduceHelium()*this.GasAmount;
                this.methane=this.methane+gasCrackAmountDefine.getCrackType4ProduceMethane()*this.GasAmount;
                this.vinyl=this.vinyl+gasCrackAmountDefine.getCrackType4ProduceVinyl()*this.GasAmount;
                this.ethane=this.ethane+gasCrackAmountDefine.getCrackType4ProduceEthane()*this.GasAmount;
                this.acrylic=this.acrylic+gasCrackAmountDefine.getCrackType4ProduceAcrylic()*this.GasAmount;
                this.tinyCarbonDust=this.tinyCarbonDust+gasCrackAmountDefine.getCrackType4ProduceTinyCarbonDust()*this.GasAmount;
                this.GasAmount=0;
            }
            case 5->{
                this.helium=this.helium+gasCrackAmountDefine.getCrackType5ProduceHelium()*this.GasAmount;
                this.methane=this.methane+gasCrackAmountDefine.getCrackType5ProduceMethane()*this.GasAmount;
                this.vinyl=this.vinyl+gasCrackAmountDefine.getCrackType5ProduceVinyl()*this.GasAmount;
                this.ethane=this.ethane+gasCrackAmountDefine.getCrackType5ProduceEthane()*this.GasAmount;
                this.acrylic=this.acrylic+gasCrackAmountDefine.getCrackType5ProduceAcrylic()*this.GasAmount;
                this.tinyCarbonDust=this.tinyCarbonDust+gasCrackAmountDefine.getCrackType5ProduceTinyCarbonDust()*this.GasAmount;
                this.GasAmount=0;
            }
            case 6->{
                this.helium=this.helium+gasCrackAmountDefine.getCrackType6ProduceHelium()*this.GasAmount;
                this.methane=this.methane+gasCrackAmountDefine.getCrackType6ProduceMethane()*this.GasAmount;
                this.vinyl=this.vinyl+gasCrackAmountDefine.getCrackType6ProduceVinyl()*this.GasAmount;
                this.ethane=this.ethane+gasCrackAmountDefine.getCrackType6ProduceEthane()*this.GasAmount;
                this.acrylic=this.acrylic+gasCrackAmountDefine.getCrackType6ProduceAcrylic()*this.GasAmount;
                this.tinyCarbonDust=this.tinyCarbonDust+gasCrackAmountDefine.getCrackType6ProduceTinyCarbonDust()*this.GasAmount;
                this.GasAmount=0;
            }
            default -> throw new IllegalArgumentException("裂化类型错误");

        }
        //log.info(this.toString());

    }
    public void makeFuel(){
         if(this.GetFuel){
             if(this.LightOilAmount>=5*this.HeavyOilAmount){
                 this.LightOilAmount=this.LightOilAmount-5*this.HeavyOilAmount;
                 this.fuel=this.fuel+6*this.HeavyOilAmount;
                 this.HeavyOilAmount=0;
             }else {
                 this.HeavyOilAmount=this.HeavyOilAmount-0.2*this.LightOilAmount;
                 this.fuel=this.fuel+1.2*this.LightOilAmount;
                 this.LightOilAmount=0;
             }
         } //else nothing
    }
    public void crack(){
        while (this.HeavyOilAmount>1E-7&&this.LightOilAmount>1E-7&&this.NaphthaAmount>1E-7&&this.GasAmount>1E-7){
            this.heavyOilCrack();
            this.lightOilCrack();
            this.naphthaCrack();
            this.gasCrack();
        }
    }
    @Override
    public String toString() {
        return "Product{" +"\n"+
                "oilType='" + oilType +"\n"+
                "HeavyOilAmount=" + HeavyOilAmount +"\n"+
                "LightOilAmount=" + LightOilAmount +"\n"+
                "NaphthaAmount=" + NaphthaAmount +"\n"+
                "GasAmount=" + GasAmount +"\n"+
                "methane=" + methane +"\n"+
                "ethane=" + ethane +"\n"+
                "propane=" + propane +"\n"+
                "butane=" + butane +"\n"+
                "octane=" + octane +"\n"+
                "helium=" + helium +"\n"+
                "toluene=" + toluene +"\n"+
                "benzene=" + benzene +"\n"+
                "vinyl=" + vinyl +"\n"+
                "acrylic=" + acrylic +"\n"+
                "butene=" + butene +"\n"+
                "butadiene=" + butadiene +"\n"+
                "phenol=" + phenol +"\n"+
                "tinyCarbonDust=" + tinyCarbonDust +"\n"+
                "fuel=" + fuel +"\n"+
                "GetFuel=" + GetFuel +"\n"+
                "HeavyOilCrackedType=" + HeavyOilCrackedType +"\n"+
                "LightOilCrackedType=" + LightOilCrackedType +"\n"+
                "NaphthaCrackedType=" + NaphthaCrackedType +"\n"+
                "GasCrackedType=" + GasCrackedType +"\n"+
                '}';
    }


}
