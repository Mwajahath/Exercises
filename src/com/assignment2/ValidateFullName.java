package com.assignment2;

import java.util.Scanner;

public class ValidateFullName {
	
	public void validate(String firstName, String lastName) throws ValidationOnNameException{
		
		if(firstName.equals("")||lastName.equals("")) {
			throw new ValidationOnNameException("first or last name can't be empty");
		}
		else 
			System.out.println("Validation Success");
	}

	public static void main(String[] args) {
		 ValidateFullName vld = new ValidateFullName();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter your firstName");
		 String firstName = sc.nextLine();
         System.out.println("Enter your lastName");
		 String lastName = sc.nextLine();
		 
		 try {
		 vld.validate(firstName, lastName);
		 }catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
	}

}

class ValidationOnNameException extends Exception{
	public ValidationOnNameException(String name) {
		super(name);
	}
}
