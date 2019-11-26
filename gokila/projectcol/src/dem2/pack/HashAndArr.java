package dem2.pack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashAndArr {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("num1");
		hs.add("num2");
		ArrayList<Integer> arrlist=new ArrayList<Integer>(); 		
		arrlist.add(24);
		arrlist.add(13);
		HashMap<HashSet<String>,ArrayList<Integer>> hm=new HashMap<HashSet<String>,ArrayList<Integer>>();
		hm.put(hs,arrlist);
		System.out.println("Retrieving all key value pairs");
		
			System.out.println(hm);
		
	/*HashMap<String,Integer> hm=new HashMap<String,Integer>();
	Iterator<String> itr=hs.iterator();
	Iterator<Integer> itr1=arrlist.iterator();
	while(itr.hasNext()&& itr1.hasNext())
		{
			for(int i=0;i<hs.size();i++){
			hm.put(itr.next(),itr1.next());
			System.out.println(hm);*/
	}
	
	}
	
	
	}
	

}
