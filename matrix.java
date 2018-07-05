package day3;

import java.util.Scanner;

public class matrix {
public static void main(String[] args)        //sum of two matrices
{
	int a[][]=new int[3][3];
	int b[][]=new int[3][3];
	int c[][]=new int[3][3];
	Scanner ob=new Scanner(System.in);
	System.out.println("enter 1st matrix");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{		a[i][j]=ob.nextInt();
	}
	}
	System.out.println("enter 2nd matrix");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{		b[i][j]=ob.nextInt();
	}
	}
	System.out.println("the 3x3 matrix is");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
     c[i][j]=a[i][j]+b[i][j];
	System.out.print(c[i][j]+" ");
		}
	System.out.println();
	}
	}
}
