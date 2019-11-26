package day6.pck;


import java.io.*;
import java.util.Scanner;

public class BufferReader {

	
	void  writeFile() throws IOException{
		String text="";
		
		FileWriter fw=new FileWriter("file.txt");
		BufferedWriter bw =new BufferedWriter(fw);
		Scanner s= new Scanner(System.in);
        text=s.nextLine();
        try{
      
        
		while(true)
				{
			if(!text.equals("q")){
	         text=s.nextLine();
	         
			}
				
		
				}
        }

	catch(Exception e)
	{
		System.out.println(e);
	}
		finally{
			bw.close();
		}
		
	}
	
	

	/*void readFile() throws IOException{
		try{
		FileReader fw=new FileReader("samplefile.txt");
		BufferedReader bw =new BufferedReader(fw);
		int n;
        while ((n = bw.read()) != -1) {
		    System.out.print((char)n);
		   }
	
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		
	}	*/
	
	public static void main(String[] args) throws IOException {
		BufferReader bf=new BufferReader();
		bf.writeFile();
		//bf.readFile();
	}

}
