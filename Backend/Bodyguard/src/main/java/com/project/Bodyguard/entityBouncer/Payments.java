package com.project.Bodyguard.entityBouncer;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Payments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;  // Changed to Long from String to match generated ID type

    String paymentType;
    String paymentMode;
    String paymentStatus;
    String transactionId;
    Double amount;
    String createdId;

    @ManyToOne
    @JoinColumn(name = "booking_id")
    private BookingBouncer bookingBouncer;

}
