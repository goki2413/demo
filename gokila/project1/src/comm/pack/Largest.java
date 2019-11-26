package comm.pack;
import java.util.*;
public class Largest {
    int n;
     void accept()
    {
    	Scanner s=new Scanner(System.in);
    	System.out.println("enter the size");
    	n=s.nextInt();
    	int[] arr=new int[n];
    	System.out.println("enter the array");
    	for(int i=0;i<n;i++)
    	{
    	arr[i]=s.nextInt();
    	}
    	int lar=arr[0];
    	for(int i=1;i<n;i++)
    	{
    	if(arr[i]>lar)
    		lar=arr[i];
    	}
    	System.out.println(lar);
    }
	
	public static void main(String[] args) {
		Largest l=new Largest();
		l.accept();
	
	}

}
