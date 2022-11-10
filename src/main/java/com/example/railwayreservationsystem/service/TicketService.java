package com.example.railwayreservationsystem.service;

import java.util.List;

import com.example.railwayreservationsystem.entity.Ticket;

public interface TicketService {
	
	public  List<Ticket> findAll();
	
	public Ticket findByPnr(int pnr) throws Exception;
	
	public Ticket save(Ticket bookTicket);
	
	public String  deleteByPnr(int pnr);

}
