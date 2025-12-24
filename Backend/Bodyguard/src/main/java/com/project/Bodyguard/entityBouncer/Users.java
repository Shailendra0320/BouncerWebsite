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
public class Users {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   Long id;
   String name;
   String emailId;
   String phoneNo;
   String password;
   String role;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<BookingBouncer> bookings;



}
