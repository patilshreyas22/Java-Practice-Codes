import java.util.*;
class client{
	
	static int operations(int start , int end){
	
		int itr = 0;	
		int count = 2;
		for(int i = start+1 ; i<end ; i++){
			itr++;
			count++;

		
		}
		
		System.out.println("Total Iterations : " + itr);
		return count;
	}

	public static void main(String args []){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the starting and the ending number : ");

		int start = sc.nextInt();

		int end = sc.nextInt();

		System.out.println(operations(start , end));
	
	}


}
