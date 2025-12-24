package com.project.Bodyguard.entityBouncer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reviews {
    @Id
    String id;
    String userId;
    Long rating;
    String comment;
    String createdAt;
    String bounderId;

    @ManyToOne
    @JoinColumn(name = "booking_id")
    private BookingBouncer bookingBouncer;

}
