package com.hcl.pizza.dao;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import com.hcl.pizza.bean.Customer;
import com.hcl.pizza.bean.PizzaOrder;
import com.hcl.pizza.connection.MySqlConn;
import com.hcl.pizza.exception.PizzaException;
import com.hcl.pizza.exception.PizzaException1;

public class PizzaOrderDAO {
	Connection c=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	Statement stmt=null;
	int k;
	int custid;
	int o_id;
	

	public int PlaceOrder(Customer cust, PizzaOrder porder) throws SQLException {
			  
		int i,i1;
				  c=MySqlConn.getCon();
				  pst=c.prepareStatement("insert into customerentry(customername,customeradd,customermbleno) values(?,?,?)");
				  pst.setString(1,cust.getCustomerName());
				  pst.setString(2,cust.getCustomerAdd());
				  pst.setString(3,cust.getCustomerMbleNo());
				  i=pst.executeUpdate();
				  pst=c.prepareStatement("select customerid from customerentry where customername=?");
				  pst.setString(1,cust.getCustomerName());
				  ResultSet rs=pst.executeQuery();
				  if(rs.next())
				  custid=rs.getInt(1);
				  cust.setCustomerid(custid);
				   //System.out.println("your customerid="+cust.getCustomerid());
		           rs=pst.executeQuery("select * from customerentry");
				   while(rs.next())
				     {
					   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
					 }
		
		   
		 
			      pst=c.prepareStatement("insert into pizzaorderentry(customerid,totalprice) values(?,?)");
				  pst.setInt(1,custid);
				  pst.setDouble(2,porder.getTotalPrice());
				  i1=pst.executeUpdate();
				  pst=c.prepareStatement("select orderid from pizzaorderentry where customerid=?");
				  pst.setInt(1,cust.getCustomerid());
			      rs=pst.executeQuery();
			      if(rs.next())
			    	 o_id=rs.getInt(1);
			        porder.setOrderId(o_id);
			     // System.out.println("your orderid="+porder.getOrderId());
				  rs=pst.executeQuery("select * from pizzaorderentry");
				  while(rs.next())
				  {
					  System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getDouble(3));
				  }
		
		       /* pst1.close(); rs.close(); */
		 
			return i & i1;  
			 
	}

	
	public PizzaOrder getOrderDetails(int orderid) throws SQLException {
		 
	
			System.out.println("passed Order id:"+orderid); 
			c=MySqlConn.getCon();
		    stmt=c.createStatement();
		    rs=stmt.executeQuery("select * from pizzaorderentry");
		    while(rs.next()){
		    	    System.out.print("\nORDER ID:"+rs.getInt(1)+" "+"CUSTOMER ID:"+rs.getInt(2)+" "+"TOTALPIZZAPRICE:"+rs.getDouble(3));
		    	    System.out.println("\n");
		    }
		    		         
			return null ;
	}
	
	 public int Search(int orderid) throws SQLException {
		 int count=0;
	     c=MySqlConn.getCon(); 
	     stmt=c.createStatement();
	     ResultSet rs=stmt.executeQuery("select * from pizzaorderentry where orderid="+"'"+orderid+"'");
	   while(rs.next()){
		   count++;
		   System.out.print("ORDER ID:"+rs.getInt(1)+" "+"CUSTOMER ID:"+rs.getInt(2)+" "+"TOTALPIZZAPRICE:"+rs.getDouble(3));
	    }
	   try {
	   if(count==0)
		   throw new PizzaException();
		   }
	   catch(PizzaException e) {
		   System.out.println(e);
	   }
		
	   return count;
	   }
	 
	  public int DeleteOrder(int orderid) throws SQLException {
		  int count=0;
	     c=MySqlConn.getCon();
	     stmt=c.createStatement(); 
	     int k= stmt.executeUpdate("Delete from pizzaorderentry where orderid="+"'"+orderid+"'"); 
	    // System.out.println("deleted"); 
	     ResultSet rs=stmt.executeQuery("select * from pizzaorderentry");
	     while(rs.next()){
	    	 count++;
	    	   System.out.print("ORDER ID:"+rs.getInt(1)+"  "+"CUSTOMER ID:"+rs.getInt(2)+"  "+"TOTALPIZZAPRICE:"+rs.getDouble(3));
	  }
	    
		return count;
	  }
	 
	  public int updateOrderDetails(int customerid,String customermbleno) throws PizzaException1,SQLException {
		  int count=0;
		     c=MySqlConn.getCon();
		     stmt=c.createStatement(); 
		      stmt.executeUpdate("Update customerentry set customermbleno='"+customermbleno+"' where customerid="+"'"+customerid+"'"); 
		      ResultSet rs=stmt.executeQuery("select * from pizzaorderentry");
		     while(rs.next()){
		    	 count++;
		    	   System.out.print("ORDER ID:"+rs.getInt(1)+"  "+"CUSTOMER ID:"+rs.getInt(2)+"  "+"TOTALPIZZAPRICE:"+rs.getDouble(3));
		  }
		     try {
		  	   if(count==0)
		  		   throw new PizzaException();
		  		   }
		  	   catch(PizzaException e) {
		  		   System.out.println(e);
		  	   }
		 
		return count;
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
}


