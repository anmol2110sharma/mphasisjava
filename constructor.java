package day1java;

public class constructor 
{
	//default constructor
constructor()
{System.out.println("constructor default");
	}
constructor(int a,int b)
{
	//parameterized constructor
	int c=a+b;
	System.out.println("sum of a and b"+c);
}
    //function overloading
int sum(int a,int b)
{
	return a+b;
}
float sum(float a,float b)
{
	return a+b;
}
public static void main(String args[])
{constructor ob=new constructor();   //constructor being created
 constructor ob1=new constructor(20,10); //parameterized constructor created
System.out.println("the sum of integers"+ob.sum(10, 20));
System.out.println("the sum of float values"+ob.sum(10.0f, 3.5f));
	
}}
