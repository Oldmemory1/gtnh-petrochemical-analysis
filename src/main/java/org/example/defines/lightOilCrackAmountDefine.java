package org.example.defines;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@Setter
@Log
public class lightOilCrackAmountDefine {
    @Qualifier("lightOilCrackSettings")
    @Autowired
    // 1：轻度氢气 2：中度氢气 3：重度氢气 4：轻度蒸汽 5：中度蒸汽 6：重度蒸汽
    private String propertiesFileName;
    public lightOilCrackAmountDefine(@Qualifier("lightOilCrackSettings") String propertiesFileName){
        this.propertiesFileName=propertiesFileName;
    }
}
