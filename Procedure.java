/* Class: CMSC203 
 * Instructor: 
 * Description: This Class will contained the medical procedure that 
 * has been performed on a patient. 
 * Due: 09/25/2023
 * Platform/compiler:
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Gabriel A. Gonzalez
 * 
 * */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Procedure {

	//Declaring fields into the class.
	private String procedureName; 
	private Date procedureDate;
	private String practitionerName;
	private double charges;
	
//	No-arg constructor 
	public Procedure() {
		
	}
	
//	Parametrized constructor for procedure name and date
	public Procedure(String procedureName, Date procedureDate) {
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
	}
	
//	Parametrized constructor for all attributes 
	public Procedure(String procedureName, Date procedureDate, String practitionerName, double charges) {
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
		this.practitionerName = practitionerName;
		this.charges = charges;
	}
	
//	Accessors 
	public String getProcedureName() {
		return procedureName;
	}
	
	public Date getProcedureDate() {
		return procedureDate;
	}
	
	public String getPractitionerName() {
		return practitionerName;
	}
	
	public double getCharges() {
		return charges;
	}
	
//	Mutators 
	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}
	
	public void setProcedureDate(Date procedureDate) {
		this.procedureDate = procedureDate;
	}
	
	public void setPractitionerName(String practitionerName) {
		this.practitionerName = practitionerName;
	}
	
	public void setCharges(double charges) {
		this.charges = charges; 
	}
	
//	toString method that display all information of a procedure 
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		return ("\t" +"\t" +"Procedure Name: " + procedureName + "\n" +
				"\t" + "\t" +"Procedure Date: " + sdf.format(procedureDate) + "\n" +
				"\t" + "\t" +"Practitioner Name: " + practitionerName +"\n" +
				"\t" + "\t" + "Charges: $" + charges);
	}
	
	
	
}
