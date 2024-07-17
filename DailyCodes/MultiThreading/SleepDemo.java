public class SleepDemo extends Thread{

	SleepDemo(String str){
	
		super(str);
	
	}
	
	public void run(){
	
		for(int i = 0 ; i<10 ; i++){
		
			System.out.println(getName());
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}

		}
	
	
	
	}

	public static void main(String args []){
	
		SleepDemo sleepdemo = new SleepDemo("New Thread");
		sleepdemo.start();

		for(int i = 0 ; i<10 ; i++){
		
			System.out.println(Thread.currentThread().getName());
		}


	
	}



}
