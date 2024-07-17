class JoinDemo extends Thread{

	public static Thread myThread = null;

	public void run(){

		for(int i = 0 ; i<5 ; i++){
		
			System.out.println(getName());
			try{myThread.join();}catch(Exception e){}
		
		}
	
	
	
	}


	public static void main(String args [])throws Exception{
		
		myThread = Thread.currentThread();
	
		JoinDemo newThread = new JoinDemo();

		newThread.setName("New Thread");

		newThread.start();

		for(int i = 0 ; i<5 ; i++){
		
			System.out.println(Thread.currentThread().getName());
			newThread.join();
		
		}
	
	
	}



}
