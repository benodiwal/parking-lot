package org.example.Models;

import lombok.Getter;
import lombok.Setter;
import org.example.Models.Enums.ParkingStatus;

import java.util.List;
@Getter
@Setter
public class ParkingLot extends BaseModel{
    private Long id;
    private List<ParkingFloor> parkingFloorList;
    private List<Gate> gateList;
    private ParkingStatus parkingLotStatus;
}
