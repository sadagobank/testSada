import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Employe{
String Employee_name;
float Employee_salary;

public Employe(String n, float p){
	Employee_name=n;
	Employee_salary=p;
	}
	
void get(){
	System.out.println("Employee name is: " +Employee_name);
	System.out.println("Employee CTC is : " +Employee_salary);
	}
	
void revsalary(){
	System.out.println("Employee revised CTC is : " +Employee_salary*1.1);
}	
	
public static void main(String args[]){
	Employe emp = new Employe("Rathod Avinash",10000.0f);
	emp.get();
	emp.revsalary();
	}
}
	