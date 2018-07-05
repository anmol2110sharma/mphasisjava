package day3;
// wap to enter 10 numbers in array and find sum
import java.util.Scanner;

public class array {
	public static void main(String[] args)
	{
		int a[]=new int[10];
		int sum=0;
		Scanner ob=new Scanner(System.in);
		System.out.println("enter 10 numbers");
		for(int i=0;i<10;i++)
		{
			a[i]=ob.nextInt();
		
       sum=sum+a[i];		
	}
		System.out.println("sum of numbers "+sum);
		}

}
