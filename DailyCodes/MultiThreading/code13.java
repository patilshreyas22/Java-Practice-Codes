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

		System.out.println("Main Thread Terminated");

		Thread.currentThread().join(); //here the join method throws the interrupted exception so we have to throw it as well or use the try catch block  
		
	
	}


}
