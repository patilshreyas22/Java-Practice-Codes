class Demo extends Thread{

	public void run(){
	
		int count = 1;

		while(true){
			
			System.out.println(count++);
		}
	
	}


}
class client{

	public static void main(String args [])throws InterruptedException{
	
		Demo obj = new Demo();
		
		obj.setDaemon(true);

		obj.start();
		
		while(true){
		
			System.out.println("Main");
			Thread.currentThread().yield(); //the yield method , stops the thread and gives time to the other thread as they have less priority compared to the main thread
			
		}	
		
	
	}


}
