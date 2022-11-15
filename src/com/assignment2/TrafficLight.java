package com.assignment2;

import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select one of the option given below"+'\n'+"(1) RED " +'\n'+"(2) GREEN "+'\n'+"(3) YELLOW");
		
		int input = sc.nextInt();
		
		switch(input) {
		case 1 : 
			System.out.println("STOP");
			break;
		case 2 :
			System.out.println("GO");
			break;
		case 3 :
			System.out.println("READY");
			break;
		default :
			System.out.println("Invalid Input");
		}

	}

}
