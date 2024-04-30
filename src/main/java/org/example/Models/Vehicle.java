package org.example.Models;

import lombok.Getter;
import lombok.Setter;
import org.example.Models.Enums.VehicleType;

@Getter
@Setter
public class Vehicle extends BaseModel{
    private Long id;
    private String vehNum;
    private VehicleType vehicleType;
    private User owner;
}
