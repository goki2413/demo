import java.util.*;
class Employee{
int id;
String name;
long mobileNo;
     Employee acceptData(){
             Employee emp=new Employee();
           Scanner i=new Scanner(System.in);
           Scanner i1=new Scanner(System.in);
           Scanner i2=new Scanner(System.in);
           System.out.println("enter the id");
           id=i.nextInt();
           System.out.println("enter the name");
           name=i1.next();
           System.out.println("enter the mobileNo");
           mobileNo=i2.nextLong();
 emp.id=id;
 emp.name=name;
 emp.mobileNo=mobileNo;
 return emp;

} 
void display(){

 System.out.println("\nid:" + id +"\nname:" + name + "\nmobileNo:" + mobileNo);
}
public static void main(String args[]){
Employee emp=new Employee();
Employee emp1=new Employee();
emp1=emp.acceptData();
emp1.display();
}
}