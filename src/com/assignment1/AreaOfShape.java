package com.assignment1;

public class AreaOfShape {

	public static void main(String[] args) {
		Circle cir = new Circle();
		cir.areaOfCircle(10);
		cir.circumferenceOfCircle(10);
		System.out.println();
		
		Square sq = new Square();
		sq.areaOfSquare(20);
		sq.circumferenceOfSquare(20);
		System.out.println();
		
		Triangle tr = new Triangle();
		tr.areaOfTriangle(10, 20);
		tr.circumferenceOfTriangle(10, 10, 10);
	}
	
	
}    

class Circle{
	
	
	public void areaOfCircle(int radius) {
		double area = Math.PI*radius*radius;
		System.out.println("Area of Circle: " + area);
	}
	
	public void circumferenceOfCircle(int radius) {
		double cir =  2*Math.PI*radius;
		System.out.println("Circumference of Circle: "+ cir);
	}
	
}

class Square {
	
	public void areaOfSquare(int length) {
		System.out.println("Area of Square: " + length*length);
	}
	
	public void circumferenceOfSquare(int length) {
		int cir =  4 * length;
		System.out.println("Circumference of Square: "+cir);
	}
	
}

class Triangle{
	public void areaOfTriangle(int base, int height) {
		System.out.println("Area of Triangle: " + (base*height)/2);
		
	}
    public void circumferenceOfTriangle(int side1, int side2, int side3) {
    	int cir = side1+side2+side3;
		System.out.println("Circumference of Triangle: "+cir);
	}
}


                                                                                                                                                                                