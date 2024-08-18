import java.util.*;

class PrioQue{
	
	public static void main(String args []){
	
		
		PriorityQueue que = new PriorityQueue();

		que.offer(70);
		que.offer(110);
		que.offer(90);
		que.offer(85);
		que.offer(62);

	//	System.out.println("Insertion Order : 10 , 30 , 50 , 40 , 20");

		System.out.println(que);

		que.poll();

	System.out.println(que);
	
	
	}


}
