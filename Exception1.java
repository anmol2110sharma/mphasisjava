package day3;
//exception handling example
import java.util.Scanner;

public class Exception1 {
public static void main(String[] args)
{ try
	{	Scanner ob=new Scanner(System.in);
	int a[]=new int[5];
	System.out.println("enter 5 numbers");
	for(int i=0;i<5;i++)
	a[i]=ob.nextInt();
	System.out.println("5 numbers are");
	for(int i=0;i<=5;i++)
		System.out.println(a[i]);
	

}
catch(ArithmeticException ae)
{
	ae.printStackTrace();
	}
catch(Exception a)
{
	a.printStackTrace();
}
finally
{
	System.out.println("this is exception handling");
}

	
}
}
