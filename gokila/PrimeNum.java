import java.util.*;
class PrimeNum{
public static void main(String args[])
{
  Scanner s=new Scanner(System.in);
  System.out.println("enter the num:");
  int n=s.nextInt();
   int c;
   for(int i=2;i<=n;i++)
{
   if(n%i==0){
     c=1;
 } 
}
  if(c==1){ 
   System.out.println(" a prime number");
}
else 
{
  System.out.println(" not a prime number");
}

}
}