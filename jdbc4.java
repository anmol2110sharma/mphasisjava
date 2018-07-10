package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

// prog for delete
public class jdbc4 {
	public static void main(String args[]) throws Exception
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");

	Scanner ob=new Scanner(System.in);
	System.out.println("ENTER EMPNO  FOR DELETION");
	PreparedStatement st=con.prepareStatement("delete from mphasis133 where empno=?");
	
	int a= ob.nextInt();
	
	st.setInt(1,a);
	
	st.execute();
	System.out.println("row deleted");
	Statement st1=con.createStatement();

	String query = "SELECT * FROM mphasis133 ORDER BY empno";
	 ResultSet Rs=st1.executeQuery(query); //it is a memory where total table data will be stored
	 while(Rs.next())
	 {
		 System.out.println(Rs.getString(1)+" "+Rs.getString(2));  //to display in console this statement is used
	 }

}}
