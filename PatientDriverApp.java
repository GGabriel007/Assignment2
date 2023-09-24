/* Class: CMSC203 
 * Instructor: 
 * Description: This Class will create an instance of the 
 * Patient class initialized the sample date. then create three
 * instances of the Procedure class. 
 * Due: 09/25/2023
 * Platform/compiler:
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code from 
 * a student or any source. I have not given my code to any student.
 * Print your Name here: Gabriel A. Gonzalez
 * 
 * */

import java.text.SimpleDateFormat;
import java.util.Date;
public class PatientDriverApp {

	public static void main(String[] args) {
	
//		Creating an instance of Patient class 
		Patient patient = new Patient("Amilcar", "Noe", "Jones", "789 Second St", "Example", "MD", "258369", "333-333-3333", "Alejandra Brown", "555-666-7777");
		
//		Creating three instances of Procedure class
		Procedure procedure1 = new Procedure("Drs Appointment", new Date(122, 10, 18), "Dr. Davis", 15.23);
		Procedure procedure2 = new Procedure("Pressure Test", new Date(120, 4, 20));
		procedure2.setPractitionerName("Dr. Miller");
		procedure2.setCharges(85.66);
		Procedure procedure3 = new Procedure("Dr's Appointment", new Date(120, 9, 24), "Dr. Jones", 55.23);
		
//		Displaying patient information
		displayPatient(patient);
		
//		Displaying information about all three procedures
		displayProcedure(procedure1);
		displayProcedure(procedure2);
		displayProcedure(procedure3);
		
//		Calculating and displaying total charges
		double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
		System.out.printf("Total Charges: $%.2f", totalCharges);
		

		
//		Displaying Student information
		
		studentInformation("Gabriel Gonzalez", "M21105623", new Date(123, 8, 25));
	}
	
//	Method to display patient information 
	public static void displayPatient(Patient patient) {
		System.out.println("Patient Information:");
		System.out.println(patient);
		System.out.println();
	}

//	Method to display procedure information
	public static void displayProcedure(Procedure procedure) {
		System.out.println("\t\tProcedure Information:");	
		System.out.println(procedure);
		System.out.println();
	
	}
	
//	Method to calculate total changes
	public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
		return procedure1.getCharges() + procedure2.getCharges() + procedure3.getCharges();
	}
	
//	Method with student information
	public static void studentInformation(String s_name, String m_number, Date due_Date) {
		
		System.out.println();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println("\nStudent Name: " + s_name 
							+ "\nMC#: " + m_number 
							+ "\nDue Date: " + sdf.format(due_Date));
	}
	
}
