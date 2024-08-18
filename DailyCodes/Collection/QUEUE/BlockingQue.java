import java.util.concurrent.*;

class BlockingQueueDemo{
	
	public static void main(String args []){
	
		
		BlockingQueue bq = new ArrayBlockingQueue(); //here we are not passing the size to the constructor of ArrayBlockingQueue Class
							     //error : no suitable constructor found

		bq.put(10);
		bq.put(20);
		bq.put(30);
		bq.put(40);

		System.out.prinln(bq);

		bq.put(50);

	
	
	}


}
