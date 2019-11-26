package dem2.pack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> hashMap=new HashMap<String,Integer>();
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		
		
		hashMap.put("one",new Integer( 1));
		hashMap.put("two",new Integer( 2));
		hashMap.put("three",new Integer( 3));
		hashMap.put(null,new Integer( 4));
		hm.putAll(hashMap);
		System.out.println(hashMap);
		
		System.out.println("hashmap contains" + hashMap.size() + "elements");
		
		
		if(hashMap.containsValue(new Integer(1))){
			System.out.println("contains 1");
			
		}else{
			System.out.println("doesnot contains 1");
		}
		
	if(hashMap.containsKey(null)){
		System.out.println("contains null");
	}else
	{
		System.out.println("doesnot contain null");
	}
	Integer o=(Integer) hashMap.get("one");
			System.out.println("value mapped with key \"one\"" +o);
	
	System.out.println("retrieving all keys");
	Iterator<String> iterator=hashMap.keySet().iterator();
	while(iterator.hasNext()){
		System.out.println(iterator.next());
	}
	
	System.out.println("Retrieving all key value pairs");
	Iterator<Map.Entry<String,Integer>> itr=hashMap.entrySet().iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	System.out.println("hashmap values");
	Iterator<Integer> i=hashMap.values().iterator();
	while(i.hasNext()){
		System.out.println(i.next());
	}
	//Iterator<Integer> id=hashMap.values().iterator();
	   for (Entry<String, Integer> entry : hashMap.entrySet())  {
		   System.out.println("Key = " + entry.getKey() + 
                   ", Value = " + entry.getValue());
	       
		
	}
	}
}
