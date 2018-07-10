package jdbcswing;
//  java swing 
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Prog1 extends JFrame implements ActionListener //ActionListener when we click operation will be performed
{                                                         //Action Listener interference
	JLabel l1,l2; 											//JFrame parent class
	JTextField t1,t2;          //J is used for swing
	JButton b1,b2,b3,b4,b5;
	Prog1()
	{
//labeling 		
		l1=new JLabel("enter empno");
		l2=new JLabel("enter empname");
//text field size		
		t1=new JTextField(20);
		t2=new JTextField(20);
//buttons
		b1=new JButton("Insert");
		b2=new JButton("Update");
		b3=new JButton("Delete");
		b4=new JButton("Select");
		b5=new JButton("Select all");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
       setLayout(new FlowLayout());
       add(l1);
       add(t1);
       add(l2);
       add(t2);
       add(b1);
       add(b2);
       add(b3);
       add(b4);
       add(b5);
		}
		@Override
	public void actionPerformed(ActionEvent ae) 
		{
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
        if(ae.getSource()==(b1))
        {
        	PreparedStatement ps =con.prepareStatement("insert into mphasis133 values(?,?)");
        	String x=t1.getText();
        	String y=t2.getText();
        	int a=Integer.parseInt(x); //
        	ps.setInt(1,a);
        	ps.setString(2, y);
        	ps.execute();
        	System.out.println("value inserted");
        }
        else if(ae.getSource()==(b2))
        {
        	PreparedStatement st =con.prepareStatement("update mphasis133 set empno=? ,name=?");
        	String x=t1.getText();
        	String y=t2.getText();
        	int a=Integer.parseInt(x);
      
        	st.setInt(1,a);
        	st.setString(2,y);
        	st.execute();
        	System.out.println("row updated");
        	
        }
        else if(ae.getSource()==(b3))
        {
        	PreparedStatement st =con.prepareStatement("delete from mphasis133 where empno=?");
        
        String x=t1.getText();
    	String y=t2.getText();
    	int a=Integer.parseInt(x);
  
    	st.setInt(1,a);
    	
    	st.execute();
        System.out.println("row deleted");
        }
        else if(ae.getSource()==(b4))
        {
        	PreparedStatement st =con.prepareStatement("select * from mphasis133 where empno=?");
            
        	String x=t1.getText();
        	String y=t2.getText();
        	int a=Integer.parseInt(x);
        	  
        	st.setInt(1,a);
        	
        	st.execute();
        	System.out.println("displayed record");
        }
        else
        {
        	PreparedStatement st1 =con.prepareStatement("select * from mphasis133");
        	
       	 ResultSet Rs=st1.executeQuery(); //it is a memory where total table data will be stored
       	 while(Rs.next())
       	 {
       		 System.out.println(Rs.getString(1)+" "+Rs.getString(2));  //to display in console this statement is used
       	 }

        }
		}catch(Exception e)
		{
		e.printStackTrace();
		}
	
		}	
		public static void main(String args[])
		{
		Prog1 ob=new Prog1();
		ob.setVisible(true);
		ob.setSize(400,400);		//setting dimensions
		ob.setTitle("Mphasis Record by Anmol Sharma");
		}	}	
		
		
		
		
		
		
	

