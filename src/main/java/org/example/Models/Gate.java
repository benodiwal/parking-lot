package org.example.Models;

import lombok.Getter;
import lombok.Setter;
import org.example.Models.Enums.GateType;
@Getter
@Setter
public class Gate extends BaseModel{
    private Long id;
    private int GateNum;
    private GateType gateType;
    private Operator operator;


}
