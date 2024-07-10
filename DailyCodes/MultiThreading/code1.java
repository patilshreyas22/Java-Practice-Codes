class MultiThreadingDemo extends Thread{


	public void run(){
		
		for(int i = 0 ; i<5 ; i++){
		
		
			System.out.println("In Fun");
		
		
		}
	
	}

	

}

class user{

	public static void main(String args [])throws InterruptedException{
	
		
		MultiThreadingDemo obj = new MultiThreadingDemo();

		obj.start();
		
		for(int i = 0 ; i<5 ; i++){
		
			System.out.println("In Main");
			Thread.sleep(2000);
		
		}
		
		
		

		
	
	
	
	}


}
