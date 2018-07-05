package day1java;
import java.util.*;

public class marks extends student
{
	int p,c,m;
	float sum,avg;
	void input()
	{
		super.input();
		Scanner ob=new Scanner(System.in);
		System.out.println("enter marks in p,c,m");
		p=ob.nextInt();
		c=ob.nextInt();
		m=ob.nextInt();
		sum=p+c+m;
		avg=sum/3;
	
		
	}
	void display()
	{
		super.display();
		System.out.println("marks in p "+p);
		System.out.println("marks in c"+c);
		System.out.println("marks in m "+m);
		System.out.println("sum "+sum);
		System.out.println("average "+avg);
		
	}
public static void main(String[] args)
{marks ob4=new marks();
ob4.input();
ob4.display();
}
}
