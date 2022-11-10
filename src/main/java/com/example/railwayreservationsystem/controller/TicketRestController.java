package com.example.railwayreservationsystem.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.railwayreservationsystem.entity.Ticket;
import com.example.railwayreservationsystem.service.TicketService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")

public class TicketRestController {
	TicketService ticketService;


      @Autowired
	 public TicketRestController(TicketService ticketService) {
		super();
		this.ticketService = ticketService;
	 }
      
      // fetching all the reservation details
      @GetMapping("/tickets")
      public List<Ticket> showReservation()
      {
    	  return ticketService.findAll();
      }
     
     // new Reservation of tickets
     @PostMapping("/tickets")
     public Ticket addReservation( @RequestBody  @Valid Ticket bookticket) 
     {
    	 bookticket.setPnr(0);
    	 System.out.println(bookticket);
    	Ticket bookTicket= ticketService.save(bookticket);
    	 System.out.println(bookTicket);
    	 return bookTicket;
	
     }
     
     // updating the existing reservation
     @PutMapping("/tickets")
     public Ticket updateReserved( @RequestBody  @Valid Ticket bookticket)
     {
    	 ticketService.save(bookticket);
		return bookticket;
    	 
     }
     
     //deleting the reservation
     
     @DeleteMapping("/tickets/{pnr}")
     public String deleteReservation( @PathVariable int pnr)
     {
    	 String msg=" ";
    	msg=ticketService.deleteByPnr(pnr) ;
		return msg;
    	 
     }
	
	

}
