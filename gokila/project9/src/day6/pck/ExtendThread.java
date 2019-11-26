package day6.pck;

class NewThreads extends Thread{

	public void run(){
		try{
			for(int i=0;i<5;i++){
				System.out.println("child" +i);
				Thread.sleep(100);
			}
		}
		catch(InterruptedException e){
			System.out.println("child interruptes");
		}
			
		}
	
}



public class ExtendThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewThreads t=new NewThreads();
		 t.start();
		 try{
				for(int i=0;i<5;i++){
					System.out.println("main" +i);
					Thread.sleep(100);
				}
		 }
			catch(InterruptedException e){
				System.out.println("main interruptes");
			}
				
		 
		 }
	
	}

