package com.nareshit.ticketbooking;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nareshit.ticketbooking.model.Ticket;
import com.nareshit.ticketbooking.service.TicketService;

@SpringBootApplication
public class TicketBookingSystemApplication implements CommandLineRunner{

	@Autowired
	private TicketService ticketService;

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*
		 * Ticket ticket=new Ticket(); ticket.setPassengerName("Subash");
		 * ticket.setSourceStation("HYDERABAD"); ticket.setDestinationStation("DELHI");
		 * ticket.setTravelDate(new Date()); ticket.setEmail("subash@gmail.com");
		 * //ticketService.createTicket(ticket);
		 */

	}

}
