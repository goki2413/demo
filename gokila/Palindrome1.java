class Palindrome1{
   String word;
   int length;
   String rev=null;
void accept()
{
Scanner i=new Scanner(System.in);
System.out.println("enter the string:");
word=i.nextLine();
}
boolean check()
{
 length=word.length();
for(int i=length-1;i>=0;i--)
{
 rev=rev+word.charAt(i);
}
if(word.equals(rev))
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
 