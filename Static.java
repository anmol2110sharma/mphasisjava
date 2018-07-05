package day2;

public class Static
{
static int a=10;         //static variable
static int b=20;
static void add()
{
	int c=a+b;
	System.out.println("thes sum is "+c);
}
static   //static block
{
	System.out.println("static block");
}
public static void main(String[] args)
{add();          //accessing without creating an object using static
	}
}
