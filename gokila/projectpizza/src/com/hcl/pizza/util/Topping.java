package com.hcl.pizza.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public  class Topping {
 HashMap<String,Integer> hm1= new HashMap<String,Integer>();
	int toppingrate;
	public int getToppingRate(){	
	  hm1.put("Capsicum" , 30);
	  hm1.put("Mushroom", 50);
      hm1.put("Jalapeno",75);
      hm1.put("Paneer", 80);
      System.out.println("Pizza Topping list");
	for(Entry<String, Integer> m:hm1.entrySet())
		System.out.println("Topping_name:"+m.getKey()+"  " +"Topping_Rate:"+m.getValue());
		 Scanner s1=new Scanner(System.in);
		System.out.println("choose your preferred Topping");
		String item=s1.next();
        toppingrate= hm1.get(item);
         return toppingrate;
	} 


		
	}