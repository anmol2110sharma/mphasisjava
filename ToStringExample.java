package day3;

public class ToStringExample {
int empno;
String name;
String address;
ToStringExample(int empno,String name,String address)
{
	this.empno=empno;
	this.name=name;
	this.address=address;
	
}

public String toString()
{
	return empno+" "+name+" "+address;
}
public static void main(String[] args)
{
	ToStringExample ob=new ToStringExample(101,"shubham","pune");
	ToStringExample ob1=new ToStringExample(102,"shivani","pune");
	System.out.println(ob);
	System.out.println(ob1);
}
}
