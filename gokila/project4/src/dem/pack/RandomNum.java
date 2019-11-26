package dem.pack;
import java.util.Arrays; 
import java.util.*;

public class RandomNum {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[] a=new int[n];
	int[] b=new int[n];
	int[] temp=new int[n];
	char[] c=new char[n];
	int flag;
	int k;
	int i;
	void random(){
		for(int i=0;i<n;i++)
		{
			a[i]=(int)(Math.random()*27)+97;
			System.out.println(a[i]);
		}
	}
	
		void sort()
		{
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<i;j++)
				{
					if(a[i]>a[j+1])
					{
					temp[i]=a[i];
					a[i]=a[j+1];
					a[j+1]=temp[i];
				}	
			}
			}
			for(int i=0;i<n;i++)
			{
		
				System.out.println(a[i]);	
			}
			
		}
		
  	/*void removeDuplicate()
				{
  		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[i]==a[j+1])
				{
					flag=0;
				}
				else if(a[i]!=a[j+1])
				{
					flag=1;
					
				}
		 
			}
				
  		if(flag==1)
  		{
  			i=0;
  			b[i]=a[i];
  			i++;
  		}
			
		}
		System.out.println(b[i]);*/
		
				
		void casting()
		{
			
		for(int k=0,i=0;k<n;k++,i++)
		{
			c[k]=(char)b[i];
			System.out.println();
			 System.out.println(c[k]);
		}

	}

	public static void main(String[] args) {
		RandomNum r=new RandomNum();
		r.random();
		r.sort();
		//r.removeDuplicate();
		r.casting();
		
		
		
		
	}

}
