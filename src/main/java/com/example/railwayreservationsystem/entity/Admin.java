package com.example.railwayreservationsystem.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.Email;
//import javax.validation.constraints.Pattern;




@Entity
@Table(name="Admin")
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "admin_id")
	private int id;
	
	// unique = true,
	@Column (name = "user_name")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	//@NotBlank(message = "Firstname must be required")
	@Column(name="first_name")
	private String firstName;
	
	
//	@NotBlank(message = "Lastname must be required")
	@Column(name="last_name")
	private String lastName;
	


	@Column(name="date_of_birth")
	private String dob;
	
	@Column(name="prefered_Language")
	private String language;
	
	@Column(name="addressLine")
	private String addressLine;
	
	@Column(name="street")
	private String street;
	
	@Column(name="city")
	private String city;
	

	@Column(name = "state")
	private String state;
	
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "pincode")
	private String pincode;
	
	
	@Column(name="gender")
	private String gender;
	
	//@NotBlank(message = "Phone number must be required.")
	//@Pattern(regexp="(^$|[0-9]{10})",message = "Invalid Number") 
	private String phoneNumber;
	
//	@Email
	@Column(name="email")
	private String email;

public Admin(int id, String userName, String password, String firstName, String lastName, String dob, String language,
		String addressLine, String street, String city, String state, String country, String pincode, String gender,
		String phoneNumber, String email) {
	super();
	this.id = id;
	this.userName = userName;
	this.password = password;
	this.firstName = firstName;
	this.lastName = lastName;
	this.dob = dob;
	this.language = language;
	this.addressLine = addressLine;
	this.street = street;
	this.city = city;
	this.state = state;
	this.country = country;
	this.pincode = pincode;
	this.gender = gender;
	this.phoneNumber = phoneNumber;
	this.email = email;
}

public Admin() {
	super();
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
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

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public String getLanguage() {
	return language;
}

public void setLanguage(String language) {
	this.language = language;
}

public String getAddressLine() {
	return addressLine;
}

public void setAddressLine(String addressLine) {
	this.addressLine = addressLine;
}

public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String getPincode() {
	return pincode;
}

public void setPincode(String pincode) {
	this.pincode = pincode;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return "Admin [id=" + id + ", userName=" + userName + ", password=" + password + ", firstName=" + firstName
			+ ", lastName=" + lastName + ", dob=" + dob + ", language=" + language + ", addressLine=" + addressLine
			+ ", street=" + street + ", city=" + city + ", state=" + state + ", country=" + country + ", pincode="
			+ pincode + ", gender=" + gender + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
}




	
}