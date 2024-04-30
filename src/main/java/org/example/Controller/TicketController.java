package org.example.Controller;

import org.example.Exceptions.InvalidGateException;
import org.example.Models.Ticket;
import org.example.Models.Vehicle;
import org.example.Services.TicketService;

public class TicketController {
    private TicketService ticketService;
    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }
    public Ticket issueTicket(Long gateId, Vehicle vehicle) throws InvalidGateException {
        return ticketService.issueTicket(gateId,vehicle);

    }
}
