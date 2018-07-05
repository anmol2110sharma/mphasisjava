package day5;

import java.util.*;

public class CollectionFramework {
public static void main(String args[])
{
	TreeSet ts=new TreeSet();  //tree for sorting shows in ascending order
	ts.add(60);       //output [10,20,30,50,60]
	ts.add(10);
	ts.add(20);
	ts.add(30);
	ts.add(50);
	System.out.println(ts);
	System.out.println("************");
	
	//*************************************//
	
	HashSet t=new HashSet();  //Hashset will  sort in random order
	t.add(20);
	t.add(40);
	t.add(80);          //output [80,20,40,10]
	t.add(10);
	System.out.println(t);
	//**************************************//
	
	System.out.println("************");
	LinkedHashSet tt=new LinkedHashSet(); //fifo first in first out
	                                   // linked hash set shows output in fifo form
	tt.add(40);
	tt.add(20);
	tt.add(60);     //output [40,20,60]
	tt.add(20);
	System.out.println(tt);
	
	//**************************************//
	for(Object x:ts)
	{
		System.out.println(x);
		
	}
	System.out.println("***********");   //interface
	Iterator ii=ts.iterator();
	while(ii.hasNext())      //hasNext(); method of iterator check pointer having next value or not
	{                         // if not than it will print '[]'
		System.out.println(ii.next());
		ii.remove();
	}
	System.out.println(ts);

//*****************************************//
System.out.println("*****************");
LinkedList II=new LinkedList();
LinkedList III= new LinkedList();
III.add(100);   //input for linkedlist III
III.add(200);
III.add(150);
III.add(400);
II.add(10);  //input for linkedlistII
II.add(20);
II.add(80);          //displays output in same order as entered
II.add(50);
II.add(40);
II.add(50);
ListIterator b=II.listIterator();
System.out.println("forward direction"); //output 10 20 80 50 40 50
while(b.hasNext())
{
	System.out.println(b.next());
	}
System.out.println("backward direction"); //output 50 40 50 80 20 10
 
//*****************************************************************
//linkedlist operations

while(b.hasPrevious())
{System.out.println(b.previous());}
System.out.println("***********************");
System.out.println(III);
System.out.println(II);
System.out.println("***********************");
II.addFirst(100);
II.addLast(200);     //100 will be added first and 200 on last
System.out.println("*************************");
System.out.println(II);
II.removeFirst();   
II.removeLast();    //100 and 200 will be removed
System.out.println("****************************");
System.out.println(II);
System.out.println("***********************");
II.addAll(III);
System.out.println(II);  //output 10 20 80 50 40 50 100 200 150 400 
                         // both the linked list will be merged
}


}