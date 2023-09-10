package org.example.Configuration;

import org.springframework.context.annotation.Import;
@Import({configurationForOilDistillAmountDefine.class,
        configurationForHeavyOilCrack.class,
        configurationForLightOilCrack.class,
        configurationForNaphthaCrack.class
        })
public class mainConfiguration {

}
