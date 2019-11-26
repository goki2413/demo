package com.hcl.service;

import com.hcl.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService{
 
	
	public void getInsurance(Employee emp) {
		
		if(emp.getSalary()>50000){
			 emp.setInsuranceScheme("A");
			 emp.setDesignation("software engineer");
			
	}else if(emp.getSalary()>25000 && emp.getSalary()<50000){
	emp.setInsuranceScheme("B");
	emp.setDesignation("programmer");
	}
	
	else if(emp.getSalary()<25000){
		 emp.setInsuranceScheme("C");
		 emp.setDesignation("tl");
		
	}
		
	
	}

	
	
	
	
	
}
