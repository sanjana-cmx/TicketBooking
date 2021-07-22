package com.nareshit.ticketbooking.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // ORM Annotation which represents Database Object
@Table(name="tbl_ticket") //ORM framework wil create a table name with tbl_ticket
public class Ticket {

	@Id //Primary Key   //ticket_seq = 1 incremet by 1 , 1,2,3.4,...10,11
	@GeneratedValue(strategy = GenerationType.AUTO)
	//AUTO -> JPA is going create sequ on behalf of developer, it will seuqnce for population
	@Column(name="ticket_id") // column with name ticket_id will be created in DB
	private Integer ticketId; //by Default property name will be column name

	@Column(name="passenger_name")
	private String passengerName;

	@Column(name="source_station")
	private String sourceStation;

	@Column(name="destination_station")
	private String destinationStation;

	@Column(name="travel_date")
	private Date travelDate;


	private String email;


	public Integer getTicketId() {
		return ticketId;
	}


	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}


	public String getPassengerName() {
		return passengerName;
	}


	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}


	public String getSourceStation() {
		return sourceStation;
	}


	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}


	public String getDestinationStation() {
		return destinationStation;
	}


	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}


	public Date getTravelDate() {
		return travelDate;
	}


	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public Ticket() {}

	public Ticket(Integer ticketId, String passengerName, String sourceStation, String destinationStation,
			Date travelDate, String email) {
		super();
		this.ticketId = ticketId;
		this.passengerName = passengerName;
		this.sourceStation = sourceStation;
		this.destinationStation = destinationStation;
		this.travelDate = travelDate;
		this.email = email;
	}


	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", passengerName=" + passengerName + ", sourceStation=" + sourceStation
				+ ", destinationStation=" + destinationStation + ", travelDate=" + travelDate + ", email=" + email
				+ "]";
	}




}
