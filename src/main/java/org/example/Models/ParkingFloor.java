package org.example.Models;

import lombok.Getter;
import lombok.Setter;
import org.example.Models.Enums.ParkingStatus;

import java.util.*;
@Getter
@Setter
public class ParkingFloor extends BaseModel{
    private Long id;
    private Long parkingFloorNum;
    private List<ParkingSpot> parkingSpotList;
    private ParkingStatus parkingFloorStatus;
}
