package prep.pack;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import demo.pack.MySqlConn;

public class Prep {

	public static void main(String[] args) {
	Connection c=null;
	try{
		c=MySqlConn.getCon();
		PreparedStatement pst=c.prepareStatement("insert into employee(empid,name,salary,designation,managerid) values(?,?,?,?,?)");
		/*pst.setInt(1,Integer.parseInt(args[0]));
		pst.setString(2, args[1]);
		pst.setFloat(3, Float.parseFloat(args[2]));
		pst.setString(4, args[3]);
		pst.setInt(5, Integer.parseInt(args[4]));
			pst.setDate(6,Date.valueOf(args[5]));
		pst.executeUpdate();
		System.out.println("inserted");
		pst.close();
		c.close();
		*/
		Scanner s=new Scanner(System.in);
		pst.setInt(1,s.nextInt());
		pst.setString(2,s.next());
		pst.setFloat(3,s.nextFloat());
		pst.setString(4,s.next());
		pst.setInt(5,s.nextInt());
	
		pst.executeUpdate();
		System.out.println("inserted");
         ResultSet rs=pst.executeQuery("select empid,name,salary,designation,managerid,doj from employee");
		while(rs.next()){
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3)+" "+rs.getString(4)+" "+rs.getInt(5));
		}
		pst.close();
		c.close();
		
		
	}
catch(SQLException e){
	System.out.println(e);
}
	}

}
