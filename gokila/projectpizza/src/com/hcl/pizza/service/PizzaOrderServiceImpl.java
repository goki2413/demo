package com.hcl.pizza.service;

import java.sql.SQLException;

import com.hcl.pizza.dao.PizzaOrderDAO;
import com.hcl.pizza.exception.PizzaException1;
import com.hcl.pizza.bean.Customer;
import com.hcl.pizza.bean.PizzaOrder;
import com.hcl.pizza.util.Topping;

public class PizzaOrderServiceImpl {


int val;
int k;
int d,i;
int base=350;
Topping top=new Topping();
	PizzaOrderDAO dao=new PizzaOrderDAO();
	
	public int placeOrder(Customer cust, PizzaOrder porder) throws SQLException {
		
		val=top.getToppingRate();
		porder.setTotalPrice(base+val);
		k=dao.PlaceOrder(cust, porder);
	    return k;
	}
	

	public PizzaOrder getOrderDetails(int orderid) throws SQLException {
		dao.getOrderDetails(orderid);
		return null;
	}
	public int search(int orderid) throws SQLException	{
		i=dao.Search(orderid);
	
		return i;
	}
	
	public int deleteOrder(int orderid) throws SQLException	{
		i=dao.DeleteOrder(orderid);
	   return i;
	}

	
 public int updateOrderDetails(int customerid,String customermbleno) throws PizzaException1, SQLException{
	 i=dao.updateOrderDetails(customerid, customermbleno);
	 return i;
	  
 }
	
	
	
	
}