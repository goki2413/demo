package demo.pack;



class New_Thread implements Runnable{
int i;

	public void run() {
		
		try{
			for(int i=5;i>0;i--){
				System.out.println("child"+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
		
	
	
	}
}
public  class RunnableInterface {

	public static void main(String[] args)  {
		
		New_Thread obj=new New_Thread();
		Thread t1=new Thread(obj);
		 t1.start();
		 try{
				for(int i=5;i>0;i--){
					System.out.println("main" +i);
					Thread.sleep(500);
				}
				 t1.join();
		 }
			catch(InterruptedException e){
				System.out.println("main interruptes");
			}
		
				System.out.println("main exiting");
		 
		 }
	
	}

	


