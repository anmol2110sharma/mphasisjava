package jdbc;
// program for updation
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class jdbc3 {
	public static void main(String args[]) throws Exception
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");

	Scanner ob=new Scanner(System.in);
	System.out.println("ENTER EMPNO AND NAME for UPDATION");
	PreparedStatement st=con.prepareStatement("update mphasis133 set name=? where empno=?");
	
	int a= ob.nextInt();
	String b=ob.next();
	st.setString(1,b);
	st.setInt(2,a);
	st.execute();
	System.out.println("row updated");
	Statement st1=con.createStatement();

	String query = "SELECT * FROM mphasis133 ORDER BY empno";
	 ResultSet Rs=st1.executeQuery(query); //it is a memory where total table data will be stored
	 while(Rs.next())
	 {
		 System.out.println(Rs.getString(1)+" "+Rs.getString(2));  //to display in console this statement is used
	 }

	}}
