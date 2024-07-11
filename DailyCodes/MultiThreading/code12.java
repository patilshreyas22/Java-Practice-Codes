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

		try{
		
			Thread.sleep(1);
		}catch(Exception e){
		
			System.out.println(e);
		}
		
	
	}


}
