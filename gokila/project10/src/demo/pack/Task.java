package demo.pack;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.*;

public class Task {
	
	
	
	void writeFile(String arr) throws IOException{
		FileWriter f=new FileWriter("num.txt");
		BufferedWriter b=new BufferedWriter(f);
		
		try{
	     
	       b.write(arr);
	       }
	catch(Exception e){
		System.out.println(e);
	}
	finally{
		b.close();
		
	}
	}
	
	//String reverseFile() throws IOException{
		void readFile() throws IOException{
		FileReader f=new FileReader("num.txt");
		BufferedReader b=new BufferedReader(f);
		int i=0;
		
		try{
			//while (true){
			while(i!=-1){
				
				 i=b.read();
				 if(i!=-1)
					 
	       System.out.print((char)i);
				}
			
	
		}
			catch(Exception e){
				System.out.println(e);
			}
				finally{
					b.close();
				}
		}
	  /*String result=b.readLine();
	    String rev="";
	    int n=result.length();
	    
	    try{
			
		for(int i=n-1;i>=0;i--)
		{
			rev=rev+result.charAt(i);
		}
       System.out.println(rev);
	    }
		catch(Exception e){
			System.out.println(e);
		}
			finally{
				b.close();
		
			}
	    return rev;
		}*/
	/* writeFileNext() throws IOException{
	
		File f=new File("numbers.txt");
		BufferedWriter b=new BufferedWriter(f);
		String foo=result;
		
		try{
	       
	       b.write(foo);
	       }
	catch(Exception e){
		System.out.println(e);
	}
	finally{
		b.close();
		s.close();
	}
	}*/
		
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String arr="";
		Scanner s=new Scanner(System.in);
		arr=s.nextLine();
Task t=new Task();
t.writeFile(arr);
t.readFile();
//String temp=t.reverseFile();
//t.writeFile(temp);
//t.writeFileNext();
	}

}


