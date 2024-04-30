package org.example.Models;

import lombok.Getter;
import lombok.Setter;
import org.example.Models.Enums.PaymentMode;
import org.example.Models.Enums.Status;

import java.time.LocalTime;
@Getter
@Setter
public class Payment extends BaseModel{
    private Long id;
    private PaymentMode paymentMode;
    private int amount;
    private LocalTime time;
    private Status status;
}
