class Demo implements Runnable{
	
	public void run(){
	
		for(int i = 0 ; i<5 ; i++){
		
			System.out.println(Thread.currentThread().getName());
		
		}
	
	}

	public static void main(String args []){
	
		Demo obj = new Demo();

		Thread t = new Thread(obj);

		t.setName("Demo Thread");

		t.start();

		for(int i = 0 ; i<5 ; i++){
		
			System.out.println(Thread.currentThread().getName());
		
		}
	
	
	}



}
