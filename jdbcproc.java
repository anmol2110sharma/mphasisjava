package jdbc;
import java.sql.*;
public class jdbcproc
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","hr","hr");
		CallableStatement ps=con.prepareCall("call add12(?,?,?)");
		ps.setInt(1,10);
		ps.setInt(2,20);
		ps.registerOutParameter(3, Types.INTEGER);
		ps.execute();
		int n=ps.getInt(3);
		System.out.println("the result is :"+n);
		
	}
}
