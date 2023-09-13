package org.example.entity;

import lombok.Getter;
import org.example.Configuration.mainConfiguration;
import org.example.defines.oilDistillAmountDefine;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@Getter

public class oil {
    private final String oilType;
    private final double produceHeavyOilAmount;
    private final double produceLightOilAmount;
    private final double produceNaphthaAmount;
    private final double produceGasAmount;
    private final oilDistillAmountDefine define;

    public oil(String type){
        this.oilType=type;
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(mainConfiguration.class);
        define=context.getBean(oilDistillAmountDefine.class);
        switch (oilType) {
            case "BCoil" -> {
                produceHeavyOilAmount = define.getBcOilProduceHeavyOilAmount();
                produceLightOilAmount = define.getBcOilProduceLightOilAmount();
                produceNaphthaAmount = define.getBcOilProduceNaphthaAmount();
                produceGasAmount = define.getBcOilProduceGasAmount();
            }
            case "GTLightOil"->{
                produceHeavyOilAmount = define.getGTLightOilProduceHeavyOilAmount();
                produceLightOilAmount = define.getGTLightOilProduceLightOilAmount();
                produceNaphthaAmount = define.getGTLightOilProduceNaphthaAmount();
                produceGasAmount = define.getGTLightOilProduceGasAmount();
            }
            case "GTOil"->{
                produceHeavyOilAmount=define.getGTOilProduceHeavyOilAmount();
                produceLightOilAmount = define.getGTOilProduceLightOilAmount();
                produceNaphthaAmount = define.getGTOilProduceNaphthaAmount();
                produceGasAmount = define.getGTOilProduceGasAmount();
            }
            case "GTHeavyOil"-> {
                produceHeavyOilAmount = define.getGTHeavyOilProduceHeavyOilAmount();
                produceLightOilAmount = define.getGTHeavyOilProduceLightOilAmount();
                produceNaphthaAmount = define.getGTHeavyOilProduceNaphthaAmount();
                produceGasAmount = define.getGTHeavyOilProduceGasAmount();
            }
            case "GTExtraHeavyOil"->{
                produceHeavyOilAmount = define.getGTExtraHeavyOilProduceHeavyOilAmount();
                produceLightOilAmount = define.getGTExtraHeavyOilProduceLightOilAmount();
                produceNaphthaAmount = define.getGTExtraHeavyOilProduceNaphthaAmount();
                produceGasAmount = define.getGTExtraHeavyOilProduceGasAmount();
            }
            default -> throw new IllegalArgumentException("油的字符串出错了");
        }
    }

    @Override
    public String toString() {
        return "oil{" +
                "原油类型=" + oilType +
                ", 蒸馏得到重燃油=" + produceHeavyOilAmount +
                ", 蒸馏得到轻燃油=" + produceLightOilAmount +
                ", 蒸馏得到石脑油=" + produceNaphthaAmount +
                ", 蒸馏得到炼油气=" + produceGasAmount +
                '}';
    }
}

