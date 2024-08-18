import java.util.concurrent.*; //the BlockingQueue is in the Concurrent package
			 
class BQD{
	
	public static void main(String args [])throws InterruptedException{
		
		BlockingQueue bq = new ArrayBlockingQueue(3);
		
		
			bq.put(10); //duplicate elements / data is allowed 
			bq.put(10);
			bq.put(20);

			System.out.println(bq);

			bq.put(30);

			System.out.println(bq);  //this code shows that the MAIN THREAD gets blocked as we are attempting to add extra data into the Blocking Queue
						 //it basically blocks the thread until and unless the queue has some empty space
			
		
		}
	
	}




