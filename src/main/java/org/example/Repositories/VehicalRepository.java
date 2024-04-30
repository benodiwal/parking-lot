package org.example.Repositories;

import org.example.Models.Gate;
import org.example.Models.Vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VehicalRepository {
    Map<String, Vehicle> vehicleMap = new HashMap<>();
    public Vehicle findByVehicle(Vehicle vehicle) {
        String vehNum = vehicle.getVehNum();
        if (!vehicleMap.containsKey(vehNum)) {
            vehicleMap.put(vehNum, vehicle);
        }
        return vehicleMap.get(vehNum);
    }
}
