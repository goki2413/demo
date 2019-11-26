package day6.pck;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.*;



public class Problem {
	String s="";

	void writeFile() throws IOException{
		FileWriter f=new FileWriter("numbers.txt");
		BufferedWriter b=new BufferedWriter(f);
	try{
	
	for(int i=0;i<=10;i++){
	s=Integer.toString(i);//converting to string
	b.write(s);
	b.write(",");
	}
	//System.out.println(b.write(i));
	}
	catch(Exception e){
		System.out.println(e);
	}
	finally{
		b.close();
	}
	}
	
	/*void readFile() throws IOException{
		
		FileReader f=new FileReader("numbers.txt");
		BufferedReader b=new BufferedReader(f);
		String result=b.readLine();
		String a[]=result.split(",");
		int n[]=new int[20];
		
		try{
			
			for(int i=0;i<a.length;i++){
				n[i]=Integer.valueOf(a[i]);
			
		
				if(n[i]%2==0){
					System.out.println(n[i]);
				}
			}
		}
		
		catch(Exception e){
			System.out.println(e);
		}
			finally{
				b.close();
			}
		}*/
		
	void readFile() throws IOException{
	File f=new File("numbers.txt");
	Scanner s=new Scanner(f);
    String line="";
    int n[]=new int[20];
	while(s.hasNext()){
		line=s.nextLine();
		System.out.println(line);
		
	}
	
	String a[]=line.split(",");
	for(int i=0;i<a.length;i++){
		n[i]=Integer.valueOf(a[i]);
		
		
		if(n[i]%2==0){
			System.out.println(n[i]);
	
		}
	}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Problem prob=new Problem();
prob.writeFile();
prob.readFile();
	}

}
