package jdbc;
import java.sql.*;

public class Rsmd
{
	public static void main(String args[])
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","hr","hr");
			PreparedStatement ps=con.prepareStatement("select * from mphasis133");
			ResultSet rs=ps.executeQuery();
			ResultSetMetaData rsmd=rs.getMetaData();
			System.out.println("Total columns:"+rsmd.getColumnCount());
			System.out.println("Column name of 1st column:"+rsmd.getColumnName(1));
			System.out.println("column type of 1st column :"+rsmd.getColumnTypeName(1));
			con.close();
			}catch(Exception e)
			{
				System.out.println(e);		
			}
	}
}
