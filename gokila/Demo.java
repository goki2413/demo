import java.util.*;
class Demo{
public static void main(String args[]){
int n;
int c=1;

Scanner s=new Scanner(System.in);
System.out.println("enter the num:");
n=s.nextInt();
while(n>0){
int a=n%10;
n=n/10;
if(c%2==0)
{
 r=*10+a;
c++;
}
else{

 e=e*10+a;
c++;
}
}
}
}
