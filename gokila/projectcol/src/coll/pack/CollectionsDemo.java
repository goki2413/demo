package coll.pack;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class CollectionsDemo {

	public static void main(String[] args) {
		// hash set

		HashSet<String>s1= new HashSet<String>();
		//HashSet s1= new HashSet<String>();
		s1.add("we");
		s1.add("are");
		s1.add("in");
		s1.add("java third week");
		//s1.add(540); //treeset is in sorted ordered here number can't be sorted
		System.out.println("elements as a set" +s1);
		//System.out.println("\n s1.contains java:" + s1.contains("Java"));
		
	
		//Tree set
		TreeSet<String> t1=new TreeSet<String>(s1);
		/*TreeSet t1=new TreeSet<String>(s1);
		System.out.println("t1.equals s1:" +t1.equals(s1));
		*/
		
		//iterator
		Iterator<String> itr=t1.iterator();
		//Iterator itr=t1.iterator();
		System.out.println("Iteration type1");
		while(itr.hasNext()){
			String e=(String)itr.next();
			System.out.println(e);
			
			
		}
		
		System.out.println("Iteration Type2");
		for(Object o:t1)
			System.out.println(o);
		
		
		
	}

}
