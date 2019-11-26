package comd.pack;

import java.util.Scanner;

public class Task {
	
	Integer meth1(double d)
	{
      
      int first=(int)d;
      Integer i=Integer.valueOf(first);
      return i;

	}
	
	
	
	
	float meth2 (Integer i)
	{
        
        int j=i.intValue();
        float f=(float)j;
         return f;

	}

	
	

	public static void main(String[] args) {
		 Task t=new Task();
		Scanner s=new Scanner(System.in);
		double d=s.nextDouble();
		Integer i=t.meth1(d);
		Float r=t.meth2(i);
		System.out.println(i);
		System.out.println(r);
		

	}

}
