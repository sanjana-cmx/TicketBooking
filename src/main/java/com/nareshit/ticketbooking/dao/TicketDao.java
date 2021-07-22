package com.nareshit.ticketbooking.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nareshit.ticketbooking.model.Ticket;

//Data Access Layer


@Repository //database connection ,

//CRUD REPOSITORY -> AUTOMATED INTERFACE BY SPRING BOOT
//PROVDING CRUD OPERATIONS
// C-> CREATE (INSERT) , R -> READ (SELECT) , U -> UPDATE(UPDATE) , D -> DELETE (DELETE)

//2 inputs -> 1 input -> Table Name ,2 -> ID -> Datatype of Primary Key
public interface TicketDao  extends CrudRepository<Ticket, Integer>{

	//Car carinterface=new MarutiSfit();
	//carinterface.

}
