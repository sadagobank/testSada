import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Scanner;

public class Circle{
private double radius;

	public Circle(double radius){
	this.radius=radius;
	}
	
	public double getRadius(){
	return radius;
	}
	
	public void setRadius(double radius){
	this.radius=radius;		
	}

	public double getArea(){
	return Math.PI*radius*radius;
	}
	
	public double getCircumference(){
	return 2* Math.PI* radius;
	}	
	
	public static void main(String args[]){
		double rad;
		Scanner input = new Scanner (System.in);  
        System.out.println(" Enter the desired radius: "); 
        rad = input.nextDouble();  
		Circle c = new Circle(rad);
		c.getArea();
		c.getCircumference();
		System.out.println("Area of the circle is: "+c.getArea());
		System.out.println("Circumference of the circle is: "+c.getCircumference());
		System.out.println("Value of PI: "+Math.PI);
	}
}