package demo.pack;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProgram {
	
	public static void main(String[] args) throws IOException {
		
		 FileReader fw=new FileReader("num.txt");
		  FileWriter fw1=new FileWriter("output.txt");
		NewThread obj=new NewThread(fw,fw1);
          Thread t=new Thread(obj);
			t.start();
		
	}

}
