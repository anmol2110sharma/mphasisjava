package day5;
import java.util.*;
public class Vectorex
{
public static void main(String args[])
{
	Vector vv=new Vector();
vv.add(10);
vv.add(40);
vv.add(20);
vv.add(80);
vv.add(90);
Enumeration en =vv.elements();
while(en.hasMoreElements())
{
	System.out.println(en.nextElement());
}
}
}



/* output   
*10
*40
*20
*80
*90 */