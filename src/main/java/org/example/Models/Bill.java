package org.example.Models;

import lombok.Getter;
import lombok.Setter;
import org.example.Models.Enums.Status;

import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
public class Bill extends BaseModel{
    private Long id;
    private Ticket ticket;
    private LocalTime exitTime;
    private int amount;
    private List<Payment> payments;
    private Status status;
}
