package demo.pack;

import java.sql.*;
public class First {
	

	public static void main(String[] args) {
	
	Connection c=null;
	Statement s=null;
//ResultSet rs=null;
	 
	try{
		c=MySqlConn.getCon();
		s=c.createStatement();
		
		ResultSet rs=s.executeQuery("select empid,name,salary,doj from employee");
		
		while(rs.next()){
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3)+" "+rs.getDate(4));//" "+rs.getString(5)+" "+rs.getInt(6)+" "+rs.getInt(7));
		};
		rs.close();
	    s.executeUpdate("insert into employee values(16,'kiki','2015-04-24',30000.00,'supervisor',10,100)");
	    System.out.println("inserted");
	    ResultSet rs1=s.executeQuery("select * from employee");
		
		while(rs1.next()){
			System.out.println(rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getDate(3)+" "+rs1.getFloat(4)+" "+rs1.getString(5)+" "+rs1.getInt(6)+" "+rs1.getInt(7));
		};
		rs1.close();
		s.executeUpdate("update employee set dno=20 where name='kiki'");
		System.out.println("updated");
		s.executeUpdate("delete from employee where name='kiki'");
		System.out.println("deleted");
	}
	catch(SQLException e){
		System.out.println(e);
		
	}
	finally{
		try{
			c.close();
			//rs.close();
			s.close();
		}
		
		catch(SQLException e){
			e.printStackTrace();
		}
	}

	}

}
