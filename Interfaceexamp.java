package day2;

interface first
{
	void method1();
}
interface second extends first
{
	void method2();
}
interface third extends second
{
	void method3();
}
class Interfaceexamp implements third
{
	public void method2()
	{
		System.out.println("method2");
	}
	public void method1()
	{
		System.out.println("method 1");
	
	}
	public void method3()
	{
		System.out.println("method 3");
	}
 public static void main(String[] args)
 {
	 Interfaceexamp ob=new Interfaceexamp();
	 ob.method1();
	 ob.method2();
     ob.method3();
 }
}
