package com.example.railwayreservationsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.railwayreservationsystem.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
 //no need of codes
}
