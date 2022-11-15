package com.assignment1;

import java.util.Scanner;

public class SimpleAndCoumpoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal amount, Time(In months), interest rate to calculate Simple Interest");
		double amount = sc.nextInt();
		double time = sc.nextInt();
		double rate = sc.nextInt();
		
		double interest = (amount*time*rate)/100;
		System.out.println("Simple Interest: "+ interest);
		
		System.out.println("Enter number of times interest in compounded: ");
		int number = sc.nextInt();
		
		double compound = amount* (Math.pow((1 + rate/100), (time * number))) - amount;
		System.out.println("Compound Interest: "+compound);
		

	}

}
