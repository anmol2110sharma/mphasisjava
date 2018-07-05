package day1java;

class constructorfirst 
{

	int empno; 
	String name,address;
	constructorfirst(int emp,String na,String add)
	{
		empno=emp;
		name=na;
		address=add;
		
	}
	void display()
	{
		System.out.println("employee no is "+empno);
		System.out.println("name is "+name);
		System.out.println("address is "+address);
	
	}
	
}
