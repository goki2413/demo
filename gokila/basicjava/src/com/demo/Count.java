package com.demo;

public class Count {
	int count=0;
 public int  countChar(String str,char search){
	for(int i=0;i<str.length();i++){
		if(str.charAt(i)==search){
			count++;
		}
	
	}
	
	return count;
	 
 }
}
