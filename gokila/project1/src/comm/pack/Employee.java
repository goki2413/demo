package comm.pack;
import java.util.*;

public class Employee {
int id;
String name;
long mobileNo;
     void acceptData(){
            
           Scanner i=new Scanner(System.in);
           Scanner i1=new Scanner(System.in);
           Scanner i2=new Scanner(System.in);
           System.out.println("enter the id");
           id=i.nextInt();
           System.out.println("enter the name");
           name=i1.next();
           System.out.println("enter the mobileNo");
           mobileNo=i2.nextLong();
} 
void display(){

 System.out.println("\nid:" + id +"\nname:" + name + "\nmobileNo:" + mobileNo);
}
public static void main(String args[]){
	int n;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size");
	n=s.nextInt();
    Employee emp[]=new Employee[n];
    for(int i=0;i<n;i++)
    {
    	emp[i]=new Employee(); //memory space for each obj//
    	emp[i].acceptData();
    	emp[i].display();
    }

    
    
   
}
}