package org.example.Services;

import org.example.Exceptions.InvalidGateException;
import org.example.Models.Enums.VehicleType;
import org.example.Models.Gate;
import org.example.Models.Ticket;
import org.example.Models.Vehicle;
import org.example.Repositories.GateRepository;
import org.example.Repositories.VehicalRepository;

import java.time.LocalTime;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    private VehicalRepository vehicalRepository;
    public TicketService(GateRepository gateRepository, VehicalRepository vehicalRepository) {
        this.gateRepository = gateRepository;
        this.vehicalRepository = vehicalRepository;
    }

    public Ticket issueTicket(Long gateId, Vehicle vehicle) throws InvalidGateException {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(LocalTime.now());

        Optional<Gate> optionalGate = gateRepository.findById(gateId);
        if (optionalGate.isEmpty()) {
            throw new InvalidGateException("Invalid gate Id");
        }
        Gate gate = optionalGate.get();
        ticket.setGate(gate);
        ticket.setVehicle(vehicalRepository.findByVehicle(vehicle));

        return ticket;
    }

}
