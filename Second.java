package day1java;

import java.util.*;
public class Second extends First 
{
 String email;
 float salary;
 void input()
 {
	 super.input();
	 Scanner ob=new Scanner(System.in);
	 System.out.println("ener email and salary");
	 email= ob.next();
	 salary=ob.nextFloat();
 }
 void display()
 {
	 super.display();
	 System.out.println("the email "+email);
     System.out.println("the salary is "+salary);	 
 }
 public static void main(String[] args)
 {
	 Second ob=new Second();
	 ob.input();
	 ob.display();
 }
}
