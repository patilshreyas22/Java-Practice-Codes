class demo extends Thread{

	public demo(String name){
	
		super(name);
	
	}
	
	
	
	public void run(){
	
	
		int count = 1;

		while(true){
		
			System.out.println(count++);
			try{
			Thread.sleep(1000);
			}catch(InterruptedException ie){
				
				System.out.println(ie);
			}
		
		}
	
	
	}

	public static void main(String args []){;

	demo obj = new demo("Demo Thread"); // when extending a Thread Class , you have to call the super method of the thread class to use the name method of that class to set name of the newly created thread
	
	obj.start();
	
	}




}
