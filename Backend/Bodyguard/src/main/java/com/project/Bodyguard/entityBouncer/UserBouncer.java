package com.project.Bodyguard.entityBouncer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UserBouncer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String referredBy;
    String name;
    String email;
    String phoneNo;
    String password;
    String experienceYear;
    String hoursRate;
    String availabilityStatus;
    String ratingAvg;
    String verified;
    String createdAt;
}
