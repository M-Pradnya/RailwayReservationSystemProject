package com.example.railwayreservationsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.railwayreservationsystem.dao.TicketRepository;
import com.example.railwayreservationsystem.entity.Ticket;
@Service
public class TicketServiceImpl implements TicketService{
     TicketRepository ticketRepository;
     
	
	public TicketServiceImpl(TicketRepository ticketRepository) {
		super();
		this. ticketRepository = ticketRepository;
	}

	@Override
	public Ticket save(Ticket ticket) {
		
		return ticketRepository.save(ticket);
	}

	@Override
	public List<Ticket> findAll() {
		// TODO Auto-generated method stub
		return ticketRepository.findAll();
	}

	@Override
	public Ticket findByPnr(int pnr) throws Exception {
		// TODO Auto-generated method stub
		Ticket ticket=null;
		Optional<Ticket> result=ticketRepository.findById(pnr);
		if(result.isPresent())
		{
			ticket=result.get();
			
		}
		else
		{
			throw new  Exception("Invalid Passenger Number");
		}
		return null;
	}

	@Override
	public String deleteByPnr(int pnr) {
		// TODO Auto-generated method stub
		try {
			Ticket ticket=findByPnr(pnr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ticketRepository.deleteById(pnr);
		return "Reservation Cancelled :" +pnr;
		
	}

}
