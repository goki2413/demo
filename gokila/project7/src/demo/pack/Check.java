package demo.pack;
import java.util.Scanner;

class UserDefinedException extends Exception {

	  public String toString(){
		   return "exception";
	   }
		
}
public class Check{
	static int num;
	
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		try{
		if(num<0)
			
			throw new UserDefinedException();
		
		else
			System.out.println(num);
			
	}

	catch(UserDefinedException e)
	{
		System.out.println(e);
	}
	}

}


