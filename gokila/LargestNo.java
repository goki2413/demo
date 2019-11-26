import java.util.*;
class LargestNo{
int n;
     void largest(){
           Scanner s=new Scanner(System.in);
           System.out.println("enter the size");
           n=s.nextInt();
           System.out.println("enter the firstno");
           int f=s.nextInt();
           int max=f;

for(int i=1;i<n ;i++)
{
     f=s.nextInt();
     if(f>max)
{
   max=f;
}
}
System.out.println("large num:" +max);
}
public static void main(String args[])
{
   LargestNo lar=new LargestNo();
   lar.largest();
}
}

 
   
