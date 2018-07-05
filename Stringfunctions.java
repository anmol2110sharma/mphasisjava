package day3;
//************String Functions***************//
public class Stringfunctions {
public static void main(String[] args)
{
	String s="Mphasis and global soft";
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	System.out.println(s.indexOf('a'));
	System.out.println(s.lastIndexOf('a'));
	System.out.println(s.substring(5, 10));
	System.out.println(s.startsWith("Mp"));
	System.out.println(s.replace("soft", "software"));
	System.out.println(s.length());
}}
