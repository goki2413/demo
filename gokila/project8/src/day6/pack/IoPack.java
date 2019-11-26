package day6.pack;

import java.io.*;
import java.util.Scanner;

public class IoPack {

void writeFile() throws IOException  {
FileOutputStream fout = null;


	
	byte b[]=new byte[50];
	
	try{
		
		Scanner s=new Scanner(System.in);
		String name=s.nextLine();
	    fout=new FileOutputStream("overwrite.txt");
		fout.write(name.getBytes());
		fout.write("\n".getBytes());
		
		}
	catch(Exception e){
		System.out.println(e);
	}
	finally{
		fout.close();
	}
}

void readFile() throws IOException  {
FileInputStream fin = null;
	
	byte b[]=new byte[500];
	try{
		
	 fin=new FileInputStream("overwrite.txt");
		fin.read(b);
		String name=new String(b);
		System.out.println(name);
		System.out.println(name.trim());
		
		
		}
	catch(Exception e){
		System.out.println(e);
	}
	finally{
		fin.close();
	}


}


	public static void main(String[] args) throws IOException {
		
IoPack io=new IoPack();
io.writeFile();
io.readFile();
		
	}
	
}

