package day1java;

class constructorsec extends constructorfirst 
{
float sal;
String design;
constructorsec(int emp,String na ,String add,float sal,String design)
{
	super(emp,na,add); //parent class constructor execute first than child
	this.sal=sal;
	this.design=design;
}
void display()
{
	super.display();
	System.out.println("salary is "+sal+"the designation is "+design);
}
public static void main(String[] args)
{
	constructorsec ob=new constructorsec(1,"anmol","delhi",50000.0f,"Gm");
	ob.display();
}
}
