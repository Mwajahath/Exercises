package com.assignment5;

import java.time.LocalDate;

import java.time.Period;
import java.util.Scanner;

public class DateTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date in YYYY-MM-DD format");
		String input = sc.nextLine();
		sc.close();
		LocalDate dateinput = LocalDate.parse(input);
		LocalDate date = LocalDate.now();
		Period intervalPeriod = Period.between(dateinput, date);
		System.out.println("Difference between given as current date is: "+'\n'+ intervalPeriod.getDays()+"days "+intervalPeriod.getMonths()+"months "+ intervalPeriod.getYears()+"years");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}


