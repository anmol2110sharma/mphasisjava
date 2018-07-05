package day5;
import java.util.*;
public class Linkedlimplementation
{
public static void main(String[] args)
{
	LinkedList li=new LinkedList();       //linked list
Employee ob=new Employee(1,"arnab",34000);
Employee ob1=new Employee(2,"bahadur",50000); //constructor called
li.add(ob);        //object of class is called
li.add(ob1);        //----"----------"----
Iterator it=li.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
}
}