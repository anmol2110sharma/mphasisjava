package day2;

public class Nestingclasses       //main class
{
static class nested_demo          //nested class
{
	public void my_method()
	{
		System.out.println("this is nested class");
		
	}
}
public static void main(String args[])
{
	Nestingclasses.nested_demo nested =new Nestingclasses.nested_demo(); /*creating
	                                                                     * object of nested 
	                                                                     * class
	                                                                     * */	 
	nested.my_method();
}
}
