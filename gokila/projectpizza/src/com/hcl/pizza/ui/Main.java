package com.hcl.pizza.ui;



import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

import com.hcl.pizza.bean.Customer;
import com.hcl.pizza.bean.PizzaOrder;
import com.hcl.pizza.exception.PizzaException1;
import com.hcl.pizza.service.PizzaOrderServiceImpl;
import com.hcl.pizza.util.Topping;

public class Main {
	static int choice;
    static int i;
	static int val;
	static int totalprice;
	static int orderid;
	static int customerid;
    Scanner s=new Scanner(System.in);

	
	public void getDetails(Customer cust,PizzaOrder porder)
	{
        System.out.println("enter the customername:");
		cust.setCustomerName(s.next());
		System.out.println("enter the customeradd:");
		cust.setCustomerAdd(s.next());
		System.out.println("enter the customermbleno:");
		cust.setCustomerMbleNo(s.next());
		
	
   }
	
	public static void main(String[] args) throws SQLException, PizzaException1 {
		Customer cust=new Customer();
		PizzaOrder porder=new PizzaOrder();
		Scanner s=new Scanner(System.in);
		Main m=new Main();
		Topping top=new Topping();
		PizzaOrderServiceImpl ps=new PizzaOrderServiceImpl();
		
		
		do{
			System.out.println("<-----welcome to JustEatPizza Hut---->");
			System.out.println("1.Placeorder  \n2.DisplayOrder \n3.Searchorder \n4.CancelOrder \n5.UpdateOrder \n6.Exit");
		  System.out.println("Enter your choice of service:");
			choice=s.nextInt();
		  switch(choice){
		  case 1:
			      m.getDetails(cust,porder); 
			      i= ps.placeOrder(cust,porder);
			      if(i>0)
			    	  System.out.println("\n<-----ORDER PLACED----->");
			      else
			    	  System.out.println("<-----ORDER NOT PLACED---->");
			        break;
         case 2:
        	    
			       ps.getOrderDetails(orderid);
		           break;
         case 3:
                 System.out.println("Enter Order ID to View Customer Details:\n");
	             orderid=s.nextInt();
	             i=ps.search(orderid);
	             if(i>0)
			    	  System.out.println("\n<-----ORDER FOUND----->");
			      else
			    	  System.out.println("<-----ORDER NOT FOUND--->");
	             break;
         case 4:
        	     System.out.println("Enter Order ID to Cancel Order:\n");
                 orderid=s.nextInt();
                 i= ps.deleteOrder(orderid);
                 if(i>0)
		    	  System.out.println("\n<-----ORDER CANCELED----->");
		         else
		    	  System.out.println("<-----ORDER NOT CANCELED--->");
                 break;
             
		  case 5:
			     System.out.println("Enter customer ID to Update Details:\n");
			     customerid=s.nextInt();
			     System.out.println("Enter new updated mobile no:\n");
			     String customermbleno=s.next();
                 i= ps.updateOrderDetails(customerid,customermbleno);
                 if(i>0)
		    	  System.out.println("\n<-----UPDATED----->");
		         else
		    	  System.out.println("<-----NOT UPDATED--->");
                 break;
			     
		  case 6:
			  System.out.println("exit");
               break;
		  default:
			System.out.println("invalid option");

        }
		}while(choice!=6);
		
				
}
	}

