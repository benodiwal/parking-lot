package org.example.Models;

import lombok.Getter;
import lombok.Setter;
import org.example.Models.Enums.ParkingStatus;
import org.example.Models.Enums.VehicleType;

import java.util.List;
@Getter
@Setter
public class ParkingSpot extends BaseModel{
    private Long id;
    private Long parkingSpotNum;
    private ParkingStatus parkingStatus;
    private List<VehicleType> vehicleTypeList;
    private ParkingFloor parkingFloor;

}
