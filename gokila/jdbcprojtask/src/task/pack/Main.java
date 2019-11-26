package task.pack;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException {
		//int i;
	   int x=0;
		Student stud=new Student();
		StudentDAO std=new StudentDAO();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the choice:");
		int choice=s.nextInt();
		if(choice==1){
			//System.out.println("inserting into table");
			System.out.println("enter the id");
			stud.setId(s.nextInt());
		    System.out.println("enter the name");
			stud.setName(s.next());
			x=std.insert(stud);
			if(x==1){
				System.out.println("inserted");
			}
			
		}
		else if(choice==0){
			//System.out.println("updating the table");
			System.out.println("enter the id");
			stud.setId(s.nextInt());
		  System.out.println("enter the name");
			stud.setName(s.next());
		    x=std.update(stud);
		    if(x==1){
		    	System.out.println("updated");
		    }
			
		}
		std.close();

		}
			
		}
	


