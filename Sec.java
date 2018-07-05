package day1java;

abstract class abstractclass
{
abstract void display();
void display1()
{
	System.out.println("this is concrete method");
	
	}

}
class Sec extends abstractclass
{
	void display()
	{
		System.out.println("this is override method");
	}
	public static void main(String[] args)
	{
		Sec ob=new Sec();
		ob.display();
		ob.display1();
	}

}