package com.assignment1;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class TimeAndDistance {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter distance & speed to calculate Time ");
        int distance = sc.nextInt();
        int speed = sc.nextInt();
        
        float time = (float) distance/speed;
        System.out.println("Time taken: "+ time+"hrs");
        
        System.out.println("Please Enter Time in hrs & speed to calculate Distance ");
        float time1 = sc.nextFloat();
        int speed1 = sc.nextInt();
        float distance1 = time1* speed1;
        System.out.println("Distance :"+ distance1+"kms");

	}

}
