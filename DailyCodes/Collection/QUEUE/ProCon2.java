import java.util.concurrent.*;

//this code basically shows when the queue is full and we try to insert one more element , the we remove the first element and the new element in the queue 
//it works same as the producer consumer problem but the code is written by me in a different way using only the producer class and not a consumer class , that is 
//using only 2 threads (including main)

class Producer implements Runnable{
	
	BlockingQueue bQueue = null;

	boolean isFull = false;


	Producer(BlockingQueue bQueue){
		
		this.bQueue = bQueue;
	
	}



	

	public void run(){
		
		for(int i = 1 ; i<=6 ; i++){
			
			
			try{
				if(bQueue.remainingCapacity()==0){
					
					isFull = true;
					System.out.println("The Queue is already full , removing the first element");
					bQueue.take();
			
				
				}

				bQueue.put(i);
			
				System.out.println("Inserting " + i + " in the Queue");	
				
				Thread.sleep(3000);

			}catch(InterruptedException ie){}
		}

		System.out.println("Final Queue : " + bQueue);
	
	}

}

class Client{

	
	public static void main(String args []){
	
			BlockingQueue bQueue = new ArrayBlockingQueue(3);

			Producer producer = new Producer(bQueue);

			Thread proThread = new Thread(producer);

			proThread.start();
	
	}

}
