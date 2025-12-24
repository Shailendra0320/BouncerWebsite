package com.project.Bodyguard.RepoBouncer;

import com.project.Bodyguard.entityBouncer.UserBouncer;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface RepoBouncer extends JpaRepository<UserBouncer, Id> {

}
