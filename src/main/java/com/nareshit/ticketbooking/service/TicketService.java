package com.nareshit.ticketbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nareshit.ticketbooking.dao.TicketDao;
import com.nareshit.ticketbooking.model.Ticket;

@Service
public class TicketService {

	@Autowired
	private TicketDao ticketDao;

	// TicketDao ticketDao=new TicketDao();

	// Create Ticket

	public Ticket createTicket(Ticket ticketObj) {

		return ticketDao.save(ticketObj);

		// save method -> Insert Operation -> If we dont pass any id, or new ID
		// -> Update Operation -> If we pass an existing id

		// ticketObj.setTicket(3);
	}

	// Retrieve Ticket

	// Retrieve All Tickets

	public Iterable<Ticket> getAllTickets() {
		// findAll -> select * from tbl_ticket; ResultSet<tbl_ticket> -> List<Ticket>
		return ticketDao.findAll();
	}

	// Retrive Single Ticket
	public Ticket getTicketById(Integer ticketId) {

		// findById => select * from tbl_ticket where ticket_id=?
		return ticketDao.findById(ticketId).orElse(new Ticket());
	}

	// Update Ticket

	public Ticket updateTicket(Integer ticketId, String newEmailId) {

		Ticket dbTicketObj = getTicketById(ticketId);

		dbTicketObj.setEmail(newEmailId);
		return ticketDao.save(dbTicketObj);

		//Save -> update Query

	}

	// Delete Ticket

	public void deleteTicket(Integer ticketId) {
		//deleteById-> delete from tbl_ticket where ticket_id=?
		ticketDao.deleteById(ticketId);
	}

}
