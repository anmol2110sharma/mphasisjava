package day5;

import java.util.ArrayList;

public class CArraylist {
	public static void main(String args[])
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(50);
		al.add(60);
		al.add(100);
		al.add(90);
		al.add(80);
		System.out.println(al);
		al.add(3,500);        //500 will be added to 3rd pos count will sart from 0
		System.out.println(al);
		al.remove(2);          //60 will remove which is in 2nd pos
		System.out.println(al);
		al.set(4,1000);        //pos 4 90 will be replaced with 1000
		System.out.println(al);
	}

}
