package com.cg.eis.exception;

import java.util.Scanner;

public class Main {
	
	public void salary(int sal) throws EmployeeException {
		if(sal < 3000) {
			throw new EmployeeException("Insufficient salary");
		}
		else {
			System.out.println("Success");
		}
	}

	public static void main(String[] args) {
		 Main mn = null;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter salary");
			int sal = sc.nextInt();
			mn = new Main();
			mn.salary(sal);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
