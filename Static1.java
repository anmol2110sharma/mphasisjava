package day2;

public class Static1 {
static int a=1;           //declared as static therefore value gets stored in memory 
void counter()
{
 a++;	                //value get stored in memory and then increment
System.out.println(a);
}
public static void main(String[] args)
{
	Static1 ob=new Static1();
	Static1 ob1=new Static1();
	Static1 ob2=new Static1();
ob.counter();
ob1.counter();
ob2.counter();
}
}


/* output 
*  2
*  3
*  4
*/