package org.example.Models;

import lombok.Getter;
import lombok.Setter;
import org.example.Models.Enums.Status;

import java.time.LocalTime;
@Getter
@Setter
public class Ticket extends BaseModel{
    private Long id;
    private LocalTime entryTime;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private Gate gate;
    private Status status;
}
