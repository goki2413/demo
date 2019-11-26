package com.hcl.pl;

import com.hcl.bean.Employee;
import com.hcl.bean.EmployeeDAO;
import com.hcl.service.EmployeeService;
import com.hcl.service.EmployeeServiceImpl;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.sql.SQLException;
import java.util.*;
class NullException extends Exception{
	public String toString(){
		return "NullException";
	}
}
public class Main1 {
String name;
static int id;
	void accept(Employee emp){
		HashMap<Integer,Employee> hm=new HashMap<Integer,Employee>();
        Scanner s=new Scanner(System.in);
        System.out.println("enter the id");
		emp.setId(s.nextInt());
		System.out.println("enter the name");
		emp.setName(s.next());
		System.out.println("enter the salary");
		emp.setSalary(s.nextDouble());
		// String name=s.next();
		/*try{
			if(name.length()==0);
			
				throw new  NullException();
					
					
					
		
		}
		catch(NullException e){
			System.out.println(e);
		}
		emp.setName(s.next());
		emp.setSalary(s.nextDouble());
		}*/
	
		 hm.put(id,emp);
		 System.out.println("Retrieving all key value pairs");
		
		
				
			
		 try{
				FileOutputStream fileout=new FileOutputStream("student.dat");
				ObjectOutputStream out=new ObjectOutputStream(fileout);
				out.writeObject(emp);
				out.close();
						
			
			
			System.out.println("object is serialized and stored");
			}
		 catch(Exception e){
				System.out.println(e);
		 }
	}
	void display(Employee emp){
	      System.out.println(emp.getId());
	      System.out.println(emp.getName());
	      System.out.println(emp.getSalary());
  }
	public static void main(String[] args) throws SQLException {
	
		Employee emp=new Employee();
        EmployeeService empservice=new EmployeeServiceImpl();
        Main1 main=new Main1();
        EmployeeDAO e=new EmployeeDAO();
        main.accept( emp);
	    main.display(emp);
	    empservice.getInsurance(emp);
	    String result=emp.getInsuranceScheme();
	    System.out.println(result);
	    String des= emp.getDesignation();
	     System.out.println(des);
	   
	    /*switch (i){
	    case 1:
	    	 e.setEmployee(emp);
	    	 break;
	    case 2:
	    	 e.search(67);
	    	 break;
	    case 3:
	    	e.delete(99);
	    }
	    e.close();
	   
	    }*/
	
	}
}
