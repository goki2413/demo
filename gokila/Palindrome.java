import java.util.*;
class Palindrome{
   StringBuffer word=new StringBuffer();
   int length;
StringBuffer rev=new StringBuffer();
   
void accept()
{
Scanner i=new Scanner(System.in);
System.out.println("enter the string:");
word.append(i.nextLine());
}
boolean check()
{
 
 length=word.length();

for(int i=length-1;i>=0;i--)
{
 rev=rev.append(word.charAt(i));
}
System.out.println(word);
System.out.println(rev);
String a=word.toString();
String b=rev.toString();
if(a.equals(b))
return true;
else
return false;
}
public static void main(String args[])
{
 Palindrome p=new Palindrome();
  p.accept();
 boolean result=p.check();
System.out.println(result);
}
}