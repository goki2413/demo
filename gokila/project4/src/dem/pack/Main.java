package dem.pack;
import java.util.*;

public class Main {
    
	public static void main(String[] args) {
		
	 Account w1=new Savings();
     
	w1.setAccNum(1);
	w1.setBalance(2000);
	w1.getAccNum();
	Person p1=new Person();
    p1.setName("smith");
    p1.getName();
    p1.setAge(45);
    p1.getAge();
    w1.deposit(2000);
   
   
    Person p2=new Person();
    Account w2=new Savings();
    w2.setAccNum(1);
	w2.setBalance(500);
	w2.getAccNum();
	 p2.setName("kathy");
	    p2.getName();
	    p2.setAge(45);
	    p2.getAge();
	    w2.withdraw(2000);
	    
	     p1.setAccHolder(w1);
		   p1.getAccHolder();
		   System.out.println(w1);
		   p2.setAccHolder(w2);
		   p2.getAccHolder();
		   System.out.println(w2);
		   w2.toString();
	}
	
	}


