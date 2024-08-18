import java.util.concurrent.*;

class BQD{
	
	public static void main(String args [])throws InterruptedException{
	
		
		BlockingQueue bq = new ArrayyBlockingQueue(5);

		bq.put(30);
	
		bq.put(20);
	
		bq.put(10);
		bq.put(50);
		
		bq.put(40);

		System.out.println(bq);
		// the insertion order here remains the same

	}

}
