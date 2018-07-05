package day1java;

import java.util.*;

public class student
{
	int rollno,std;
	String name;
	void input()

	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter rollno  std name");
		rollno =ob.nextInt();
		std=ob.nextInt();
		name=ob.next();
    }
	void display()
	{
		System.out.println("rollno is "+rollno);
		System.out.println("name is "+name);
		System.out.println("standard "+std);
		
}
	public static void main(String args[])
	{
		student ob1= new student();
		ob1.input();
		ob1.display();
		
		
		}
}