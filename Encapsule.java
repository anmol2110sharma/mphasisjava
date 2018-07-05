package day2;

public class Encapsule
{
public static void main(String[] args)
{
	Variabletest ob=new Variabletest();
	ob.setEmpno(101);                       //calling set functions
	ob.setEmpname("sandip");
	ob.setAddress("pune");
	ob.setSal(4500.50f);
	System.out.println("empno is "+ob.getEmpno());   //displaying inputs
	System.out.println("emp name "+ob.getEmpname());
	System.out.println("emp address "+ob.getAddress());
    System.out.println("emp salary "+ob.getSal());
}
}
