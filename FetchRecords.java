package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class FetchRecords
{
public static void main(String args[]) throws Exception
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","hr","hr");
	con.setAutoCommit(false);
	Statement stmt=con.createStatement();
	stmt.addBatch("insert into mphasis133 values(190,'abhishek')");
	stmt.addBatch("insert into mphasis133 values(197,'shivangi2')");
	stmt.executeBatch();
	con.commit();
	System.out.println("table updated");
	con.close();
	
}
}
