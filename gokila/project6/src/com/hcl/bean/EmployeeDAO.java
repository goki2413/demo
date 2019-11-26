package com.hcl.bean;

import java.sql.*;



public class EmployeeDAO {
	
	Connection c=null;
	Statement s=null;
	
public void setEmployee(Employee emp){
	  try{
		  c=MySqlConn.getCon();
		  PreparedStatement pst=c.prepareStatement("insert into employee1(id,name,salary,designation,insuranceScheme) values(?,?,?,?,?)");
		  pst.setInt(1,emp.getId());
		  pst.setString(2,emp.getName());
		  pst.setDouble(3,emp.getSalary());
		  pst.setString(4,emp.getDesignation());
		  pst.setString(5,emp.getInsuranceScheme());
		  pst.executeUpdate();
		  //s=c.createStatement();
		  ResultSet rs=pst.executeQuery("select * from employee1");
		  while(rs.next()){
			  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getString(4)+" "+rs.getString(5));
		  }
		  System.out.println("inserted");
		  rs.close();
		  pst.close();
		  
		  }
	  catch(SQLException e){
		  System.out.println(e);
	  }
}
	
	public void update(Employee emp){
		
		
		 try{
			  c=MySqlConn.getCon();
			  PreparedStatement pst=c.prepareStatement("update employee1 set=? where id=?");
			  pst.setString(1,emp.getDesignation());
			  //pst.setString(2,emp.getInsuranceScheme());
			  pst.setInt(2,emp.getId());
			  pst.executeUpdate();
			 // s=c.createStatement();
			  ResultSet rs=pst.executeQuery("select id from employee1");
			  while(rs.next()==false){
				  System.out.println(rs.getInt(1));//+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getString(4)+" "+rs.getString(5));
			  }
			  System.out.println("updated");
			  rs.close();
			  pst.close();
			  
			  }
		  catch(SQLException e){
			  System.out.println(e);
		  }
		}
public Boolean search(int id){


	try{
		  c=MySqlConn.getCon();
		  PreparedStatement pst=c.prepareStatement(" select * from employee1 where id=?");
		  pst.setInt(1,id);
		 // pst.setString(2,emp.getName());
		 // System.out.println("inserted");
		  pst.executeUpdate();
		  //s=c.createStatement();
		  ResultSet rs=pst.executeQuery("select * from employee1");
		  while(rs.next()){
			  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getString(4)+" "+rs.getString(5));
		  }
		  System.out.println("found");
		  rs.close();
		  pst.close();
		  
		  }
	  catch(SQLException e){
		  System.out.println(e);
	  }
	  /*finally{
		
		  try{
				c.close();
			
			}
			
			catch(SQLException e){
				e.printStackTrace();
			}
		}*/
		  return true;
		  
		   }


public Boolean delete(int id){


	try{
		  c=MySqlConn.getCon();
		  PreparedStatement pst=c.prepareStatement(" delete from employee1 where id=?");
		  pst.setInt(1,id);
		 // pst.setString(2,emp.getName());
		 // System.out.println("inserted");
		  pst.executeUpdate();
		  s=c.createStatement();
		  ResultSet rs=s.executeQuery("select * from employee1");
		  while(rs.next()){
             System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getString(4)+" "+rs.getString(5));
		  }
		  rs.close();
		  pst.close();
		  
		  }
	  catch(SQLException e){
		  System.out.println(e);
	  }
	  /*finally{
		
		  try{
				c.close();
			
			}
			
			catch(SQLException e){
				e.printStackTrace();
			}
		}*/
		  return true;
		  
		
		
	}
	public void close() throws SQLException{
		c.close();
	}
	

}
