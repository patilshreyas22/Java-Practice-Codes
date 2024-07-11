class Demo extends Thread{

	public void run(){
	
		int count = 1;

		while(true){
			
			System.out.println(count++);
		}
	
	}


}
class client{

	public static void main(String args []){
	
		Demo obj = new Demo();
		
		obj.setDaemon(true);

		obj.start();

		System.out.println("Main Thread Terminated");
	//this code shows how the daemon thread terminates itself when the main thread terminates , as the daemon thread have the least priority , it is a dependent thread	
	
	}


}
