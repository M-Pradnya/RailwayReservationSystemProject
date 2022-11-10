package com.example.railwayreservationsystem.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Pattern;

@Entity
@Table(name = "passanger")
public class Passanger {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@NotNull
	private long id; 
	
	@Column(name = "firstname"  )
	@NotBlank(message = "  required.")
	private String firstName;
	
	@Column(name = "lastname"  )
	@NotBlank(message = " required.")
	private String lastName;
	
	@Column(name = "username" , nullable = false ,length = 200 )
	@NotBlank(message = " required.")
	private String userName;
	
	@Column(name ="address" )
	@NotBlank(message = " required.")
	private String address;
	
	@Column(name = "mobileno" , nullable = false ,length = 10 )
	//@Pattern(regexp="(\"^\\\\d{10}$\")")
	@NotBlank(message = " required.")
	private String mobileNumber;
	
	@Column(name = "email" )
	@NotBlank(message = " required.")
	@Email
	private String emailId;
	
	@Column(name="gender")
	@NotBlank(message = " required.")
	private String gender;
	
	@Column(name ="pass" , nullable = false ,length = 20 )
	@NotEmpty
	private String password;

	
	
	
	public Passanger() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	
	public Passanger(long id, @NotBlank(message = "  required.") String firstName,
			@NotBlank(message = " required.") String lastName, @NotBlank(message = " required.") String userName,
			@NotBlank(message = " required.") String address, @NotBlank(message = " required.") String mobileNumber,
			@NotBlank(message = " required.") @Email String emailId, @NotBlank(message = " required.") String gender,
			String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.gender = gender;
		this.password = password;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Passanger [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
				+ ", address=" + address + ", mobileNumber=" + mobileNumber + ", emailId=" + emailId + ", gender="
				+ gender + ", password=" + password + "]";
	}
	
	

	

	

	
}
