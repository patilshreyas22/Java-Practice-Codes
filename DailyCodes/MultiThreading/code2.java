class MultiThreadingDemo extends Thread{


	public void run()throws InterruptedException{ // this will cause a error as it violates the method signature of the run method defined in the runnable interface , the run method of the Thread class is defined in the RUNNABLE INTERFACE , so we cannot change the method signature of the overriden method of ours , instead we need to write a try catch block 
						     
		
		for(int i = 0 ; i<5 ; i++){
		
		
			System.out.println("In Fun");
			Thread.sleep(2000);
		
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
