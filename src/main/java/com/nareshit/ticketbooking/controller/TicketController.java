package com.nareshit.ticketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nareshit.ticketbooking.model.Ticket;
import com.nareshit.ticketbooking.service.TicketService;

@RestController
@RequestMapping(value="/tickets") //http://localhost:8080/tickets
public class TicketController {


	//JAXRS -> @POST -> Creating Resource
	//      -> @GET -> Retrieving the Resource
	//       -> @PUT -> Updating Resource
	//        -> @DELETE -> Deleting the Resource

//@GET , @REQUESTMAPPING -> @GetMapping--> @Get + @RequestMapping
	//@PostMapping -> @Post + @RequestMapping
	//@PUtMapping -> @Put + @RequestMapping
	//DeleteMapping -> @Delete + @RequestMapping
	//@PathVairables -> Which is used the read URI Path
	//@RequestBody -> to Read the body section in the HTTP Request method


	@Autowired
	private TicketService ticketService;

	//Creating Ticket
	@PostMapping(value="/create") //http://localhost:8080/tickets/create
	public Ticket createTicket(@RequestBody Ticket ticketObj) {

		//Ticket ticketObj=new Ticket("","","","","");
		return ticketService.createTicket(ticketObj);
	}



	//Retrieving All Tickets

	@GetMapping(value="/all") //http://localhost:8080/tickets/all
	public Iterable<Ticket> givemeTickets(){
		return ticketService.getAllTickets();
	}



	//Retrieve Single Ticket
	//http://localhost:8080/tickets/1 -> 1st Ticket
	//http://localhost:8080/tickets/100 -> 100th Ticket
	//http://localhost:8080/tickets/90 -> 90th Ticket
	//@PathVariable -> Which is going to read the URL and convert to Java Datatype

	@GetMapping("/{ticketId}") //{} -> Dynamic Value
	public Ticket retrieveSingleTicket(@PathVariable("ticketId") Integer ticketId) {
		return ticketService.getTicketById(ticketId);
	}


	//Update Ticket


	@PutMapping("/{ticketId}/{newEmail}")
	//http://localhost:8080/tickets/1/a@b.com ->
	public Ticket updateTicket(@PathVariable("ticketId") Integer ticketId,
			@PathVariable("newEmail") String newEmail) {
		return ticketService.updateTicket(ticketId, newEmail);

	}

	//Delete Ticket

	@DeleteMapping("/{ticketId}") //{} -> Dynamic Value
	public void deleteTicket(@PathVariable("ticketId") Integer ticketId) {
		 ticketService.deleteTicket(ticketId);
	}








}
