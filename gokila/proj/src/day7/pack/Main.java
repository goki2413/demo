package day7.pack;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		HashSet<Student> hs=new HashSet<Student>();
		//Student s1=new Student();
		
	   /* s1.setId(10);
	    s1.setMobilenum(9876);
		s1.setName("guju");
		hs.add(s1);*/
	
		String choice;
	
		do{
			Scanner s=new Scanner(System.in);
			Student stud=new Student();
			int id=s.nextInt();
			 stud.setId(id);
			 long mobilenum=s.nextLong();
		    stud.setMobilenum(mobilenum);
		    String name=s.next();
		    stud.setName(name);
		    hs.add(stud);
			choice=s.next();
			}while(choice.equals("yes"));
		
	
		
	
		
		//System.out.println(s1);
	/*Iterator<Student> itr=hs.iterator(); //iteration type1
	Student b;
	while(itr.hasNext()){
		b=itr.next();
			System.out.println(b.getId()+ " " +b.getName()+ " "+b.getMobilenum());
		}*/
	for(Student st:hs){
		System.out.println(st.getId()+" "+st.getName()+" "+st.getMobilenum());
	}
		
		
	}

}
