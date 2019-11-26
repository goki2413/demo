package com.hcl.pizza.service;

import java.sql.SQLException;

import com.hcl.pizza.bean.Customer;
import com.hcl.pizza.bean.PizzaOrder;
import com.hcl.pizza.exception.PizzaException;
import com.hcl.pizza.exception.PizzaException1;

public interface IPizzaOrderService {
	public int PlaceOrder(Customer cust,PizzaOrder poder) throws SQLException;
	public PizzaOrder getOrderDetails(int orderid) throws SQLException;
	public int search(int orderid) throws PizzaException;
	public int displayOrder(int orderid) throws SQLException;
	public int updateOrderDetails(int customerid,String customermbleno) throws PizzaException1;
}
