package demo.pack;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;


class NewThread implements Runnable{
  
	BufferedReader bw=null;
	BufferedWriter bw1=null;
	public NewThread(FileReader fw, FileWriter fw1) {
		// TODO Auto-generated constructor stub
		this.bw =new BufferedReader(fw);
		this.bw1 =new BufferedWriter(fw1);
		
	}

	public void run() {
		/*System.out.println("1");
		FileReader fw=null;
		BufferedReader bw=null;
	    FileWriter fw1=null;
	    BufferedReader bw=null;
	    System.out.println("2");*/
		int i=0;
		
		try{
			/*System.out.println("3");
			FileReader fw=new FileReader("num.txt");
			BufferedReader bw =new BufferedReader(fw);
			 FileWriterf w1=new FileWriter("output.txt");
			 BufferedWriter bw1 =new BufferedWriter(fw1);*/
			//System.out.println("4");
		while(i!=-1){
			
			    
			
                for(int k=0;k<=10;k++){
                	i=bw.read();
				if(i==-1)
					break;
				else
					bw1.write((char)i);
				System.out.print((char)i);
			}
		System.out.println();
                System.out.println("10 character are copied");
			
		}
		
			
		}
		
		catch(IOException e){
			System.out.println(e);
		}
		finally{
			try {
				bw.close();
				bw1.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				bw1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}








	

}


