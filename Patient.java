/* Class: CMSC203 
 * Instructor: 
 * Description: This Class will contained the patient information 
 * Due: 09/25/2023
 * Platform/compiler:
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Gabriel A. Gonzalez
 * 
 * */


public class Patient {

	//Declaring fields into the class.
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String streetAddress;
	private String city; 
	private String state;
	private String zipCode; 
	private String phoneNumber;
	private String emergencyContactName;
	private String emergencyContactPhone; 
	
	
//	No-arg constructor
	public Patient() {
		
	}
	
//	Parametrized constructor for first, middle, and last name. 
	public Patient(String firstName, String middleName, String lastName) {
		this.firstName = firstName; 
		this.middleName = middleName;
		this.lastName = lastName; 
	}
	
//	Parametrized constructor for all atributes
	public Patient(String firstName, String middleName, String lastName, String streetAddress, String city, String state, String zipCode, String phoneNumber, String emergencyContactName, String emergencyContactPhone) {
		this.firstName = firstName;
		this.middleName = middleName; 
		this.lastName = lastName; 
		this.streetAddress = streetAddress; 
		this.city = city; 
		this.state = state; 
		this.zipCode = zipCode; 
		this.phoneNumber = phoneNumber; 
		this.emergencyContactName = emergencyContactName; 
		this.emergencyContactPhone = emergencyContactPhone; 
		
	}
	
//	Accessors 
	
	public String getFirstName() {
		return firstName; 
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public String getLastName() {
		return lastName; 
	}
	
	public String getStreetAddress() {
		return streetAddress;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state; 
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public String gerPhoneNumber() {
		return phoneNumber; 
	}
	
	public String gerEmergencyContactName() {
		return emergencyContactName;
	}
	
	public String gerEmergencyContactPhone() {
		return emergencyContactPhone;
	}
	
//	Mutators 
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName; 
	}
	
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	public void setCity(String city) {
		this.city = city; 
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber; 
	}
	
	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}
	
	public void setEmergencyContactPhone(String emergencyContactPhone) {
		this.emergencyContactPhone = emergencyContactPhone; 
	}
	
//	Method to build full name 
	public String buildFullName() {
		return firstName + " " + middleName + " " + lastName;
	}
	
//	Method to build address
	public String buildAddress() {
		return streetAddress + "," + city + ", " + state + " " + zipCode;
	}
	
//	Method to build emergency contact info
	public String buildEmergencyContact() {
		return emergencyContactName + " " + emergencyContactPhone;
	}
	
//	toString Method to display the information.
	public String toString() {
		return "\tName: " + buildFullName() + "\n" + "\tAddress: " + buildAddress() + "\n" +
				"\tPhone Number: " + phoneNumber + "\n" + "\tEmergency Contact: " + buildEmergencyContact();
	}


}

