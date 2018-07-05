package day1java;
import java.util.*;
public class First
{
int empno;
String name,address;
void input()
{
	Scanner ob=new Scanner(System.in);
    System.out.println("enter empno,name,address");
    empno=ob.nextInt();
    name=ob.next();
    address=ob.next();
}
void display()
{
	System.out.println("the empno is  "+empno);
	System.out.println("the name is "+name);
	System.out.println("adress is " +address);
}
public static void main(String[] args)
{
	First ob1=new First();
	ob1.input();
	ob1.display();
	System.out.println("empno is"+ob1.empno);
	}
}
