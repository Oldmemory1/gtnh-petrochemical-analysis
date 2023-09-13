package org.example.Configuration;

import org.springframework.context.annotation.Import;
@Import({configurationForOilDistillAmountDefine.class,
        configurationForHeavyOilCrack.class,
        configurationForLightOilCrack.class,
        configurationForNaphthaCrack.class,
        configurationForMainWindow.class,
        configurationForGasCrack.class,
        configurationForHeavyOilCrackTypeHashMap.class,
        configurationForOilTypeHashMap.class,
        })
public class mainConfiguration {

}
