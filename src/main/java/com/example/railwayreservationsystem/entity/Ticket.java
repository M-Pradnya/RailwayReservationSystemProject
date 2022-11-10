package com.example.railwayreservationsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="book_Ticket")
public class Ticket {
	
	@Id
	@GeneratedValue( generator ="pnr",strategy=GenerationType.AUTO)
   @SequenceGenerator(name="pnr",initialValue = 10000)
	@Column(name="passenger_number")
	private int pnr;
	
	@NotNull(message="Mandatory field")
	@Column(name="train_name")
	private String trainName;
	
	@NotNull(message="Mandatory field")
	@Column(name="from_station")
	private String from;
	
	
	
	@NotNull(message="Mandatory field")
	@Column(name="to_station")
	private String to;
	
	@NotNull(message="Mandatory field")
	@Column(name="person_type")
	private String type;
	
	@NotNull(message="Mandatory field")
	@Column(name="Date_of_journey")
	private String date;
	
	@NotNull(message="Mandatory field")
	@Column(name="classes")
	private String classes;

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	
     public Ticket(int pnr, @NotNull(message = "Mandatory field") String trainName,
			@NotNull(message = "Mandatory field") String from, @NotNull(message = "Mandatory field") String to,
			@NotNull(message = "Mandatory field") String type, @NotNull(message = "Mandatory field") String date,
			@NotNull(message = "Mandatory field") String classes) {
		super();
		this.pnr = pnr;
		this.trainName = trainName;
		this.from = from;
		this.to = to;
		this.type = type;
		 this.date = date;
		this.classes = classes;
	}





	public int getPnr() {
		return pnr;
	}



	public void setPnr(int pnr) {
		this.pnr = pnr;
	}



	public String getTrainName() {
		return trainName;
	}



	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}



	@Override
	public String toString() {
		return "BookTicket [pnr=" + pnr + ", trainName=" + trainName + ", from=" + from + ", to=" + to + ", type="
				+ type + ", date=" + date + ", classes=" + classes + "]";
	}

	
	
	

}
