package com.project.Bodyguard.entityBouncer;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookingBouncer {

    @Id
    Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")  // Foreign key for user
    private Users user;

    String serviceDate;
    String location;
    String status;
    Double totalAmount;
    Double advanceAmount;
    Double remainingAmount;

    // One-to-many relationships to Payments and Reviews
    @OneToMany(mappedBy = "bookingBouncer", cascade = CascadeType.ALL)
    private List<Payments> payments;

    @OneToMany(mappedBy = "bookingBouncer", cascade = CascadeType.ALL)
    private List<Reviews> reviews;
}
