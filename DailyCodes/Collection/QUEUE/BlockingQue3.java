import java.util.concurrent.*;

//BlockingQueue using the PriorityBlockingQueue object

class BQD{

	public static void main(String args [])throws InterruptedException{
	
		
		BlockingQueue bq = new PriorityBlockingQueue(5); //the integer we are passing here in the PriorityBlockingQueue is not the fixed size of the queue but is the initial
								 //capacity of the internal array used by the PriorityBlockingQueue.However since the queue is unbounded , this capacity
								 //will dynamically increase as more elements are added
	
		bq.put(10);
		bq.put(20);
		bq.put(30);
		bq.put(40);
		bq.put(50);
		
		System.out.println(bq);
		
		bq.put(60);

		System.out.println(bq);
	
	}

}
