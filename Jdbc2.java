package jdbc;

	import java.io.*;
	import java.util.*;
	import java.sql.*;

	public class Jdbc2
	{
	public static void main(String args[]) throws Exception
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");

	Scanner ob=new Scanner(System.in);
	System.out.println("ENTER EMPNO AND NAME");
	PreparedStatement st=con.prepareStatement("insert into mphasis133 values(?,?)");
	int a= ob.nextInt();
	String b=ob.next();
	st.setInt(1, a);
	st.setString(2, b);
	st.execute();
	System.out.println("row inserted");
	Statement st1=con.createStatement();

	String query = "SELECT * FROM mphasis133 ORDER BY empno";
	 ResultSet Rs=st1.executeQuery(query); //it is a memory where total table data will be stored
	 while(Rs.next())
	 {
		 System.out.println(Rs.getString(1)+" "+Rs.getString(2));  //to display in console this statement is used
	 }

	}
	}
