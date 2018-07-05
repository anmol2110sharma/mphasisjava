package day4;

import java.util.Scanner;

public class Throwexap {
public static void main(String[] args ) throws Exception
{
	Scanner ob=new Scanner(System.in);
	System.out.println("enter a mark");
	int a=ob.nextInt();
	if(a>0)
		
		System.out.println("ok");
		else
			throw new Exception("marks should be greater than zero");
	}
		

}
