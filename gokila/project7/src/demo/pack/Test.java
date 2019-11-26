package demo.pack;

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Test {

	
	public static void main(String[] args) {
		

		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter string");
			String s=br.readLine();
			System.out.println("enter num");
			int n=Integer.parseInt(br.readLine());
			System.out.println("enter num");
			int n1=Integer.parseInt(br.readLine());
			System.out.println(s+""+n+""+n1);
		
		}
		catch(Exception e)
		{
			System.out.println("exception occur");
		}
	}	

}
