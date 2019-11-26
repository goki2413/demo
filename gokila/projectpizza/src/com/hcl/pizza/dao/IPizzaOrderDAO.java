package com.hcl.pizza.dao;


import java.sql.SQLException;

import com.hcl.pizza.bean.Customer;
import com.hcl.pizza.bean.PizzaOrder;
import com.hcl.pizza.exception.PizzaException1;

public interface IPizzaOrderDAO {
	
	public void PlaceOrder(Customer cust,PizzaOrder pizzaorder) throws SQLException;
	 public PizzaOrder getOrderDetails(int orderid) throws SQLException;
	 public int Search(int orderid);
	 public int DeleteOrder(int orderid) throws SQLException;
	 public int updateOrderDetails(int customerid,String customermbleno) throws PizzaException1;
}
	
	
	
	
	
	
	
	
	
	
	

