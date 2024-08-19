import java.util.concurrent.*;

class Producer implements Runnable{

	BlockingQueue bQueue = null;

	Producer(BlockingQueue bQueue){
		
		this.bQueue = bQueue;
	
	}

	public void run(){
		
		for(int i = 1 ; i<= 6 ; i++){
			
			try{
			bQueue.put(i);
			System.out.println("Inserted " + i + " in the Queue");
			Thread.sleep(1000);
			}catch(InterruptedException ie){}

		}
	
	
	}


}

class Consumer implements Runnable{
	
	BlockingQueue bQueue = null;

	Consumer(BlockingQueue bQueue){
		
		this.bQueue = bQueue;
	
	}

	public void run(){
		
		for(int i = 1 ; i<=3 ; i++){
			
			try{
				bQueue.take();
				System.out.println("Taking Out " + i + " from the Queue");
				Thread.sleep(1000);
			}catch(InterruptedException ie){}
		
		}


	
	}

}

class Client{
	
	public static void main(String args [])throws InterruptedException{
		
		BlockingQueue bQueue = new ArrayBlockingQueue(3);

		Producer producer = new Producer(bQueue);
		Consumer consumer = new Consumer(bQueue);

		Thread proThread = new Thread(producer);

		Thread conThread = new Thread(consumer);

		proThread.start();

		conThread.start();

		

			}


}
