package coll.pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 		ArrayList<Integer> arrlist=new ArrayList<Integer>();
 		arrlist.add(24);
 		arrlist.add(13);
 		arrlist.add(98);
 		System.out.println("ARRAYLIST:" +arrlist);
 		
 		int i;
 		
 		Iterator<Integer> itr=arrlist.iterator();
 		System.out.println("Iteration type1");
		while(itr.hasNext()){
			int e=itr.next();
			System.out.println(e);
		   }
		
 		
			System.out.println("Iteration Type2");
			for(i=0;i<arrlist.size();i++){
				System.out.println(arrlist.get(i));
 	         }
			System.out.println("Iteration Type3");
			for(int o:arrlist){
				
			
				System.out.println(o);
			
		
			}
			System.out.println("sorted");
			Collections.sort(arrlist);
		Integer arr[]=arrlist.toArray(new Integer[arrlist.size()]);
		System.out.println(arr);
       ArrayList<Integer> arrlist1=new ArrayList<Integer>(Arrays.asList(arr));
       for( i=0;i<arrlist.size();i++)
       {
    	   
    	    System.out.println(arrlist1.get(i));
       }
    
		
	}

}
