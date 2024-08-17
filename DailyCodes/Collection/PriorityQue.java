import java.util.*;

class PrioQue{
	
	public static void main(String args []){
	
		
		PriorityQueue que = new PriorityQueue();

		que.offer(10);
		que.offer(20);
		que.offer(30);
		que.offer(40);
		que.offer(50);

	//	System.out.println("Insertion Order : 10 , 30 , 50 , 40 , 20");

		System.out.println(que);

		que.poll();

		System.out.println(que);
	
	
	}


}
