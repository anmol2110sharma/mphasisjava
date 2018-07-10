package jdbc;
import java.sql.*;
public class jdbcprog1
{
public static void main(String args[]) throws Exception
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
Statement st=con.createStatement();
//st.execute("create table mphasis133(empno number,name varchar2(30))");  previous operations.
//st.execute("insert into mphasis133 values(101,'rahul')");
//st.execute("update mphasis133 set name='arnab' where empno=101");
//System.out.println("table created");
//System.out.println("row inserted");
//st.execute("insert into mphasis133 values(102,'bahadur')");
//st.execute("insert into mphasis133 values(103,'shubham')");
//st.execute("insert into mphasis133 values(104,'adi')");
//st.execute("insert into mphasis133 values(105,'rishabh')");

String query = "SELECT * FROM mphasis133 ORDER BY empno";
 ResultSet Rs=st.executeQuery(query); //it is a memory where total table data will be stored
 while(Rs.next())
 {
	 System.out.println(Rs.getString(1)+" "+Rs.getString(2));  //to display in console this statement is used
 }
//System.out.println("row updated");
}
}
