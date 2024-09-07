import java.util.*;
class client{
	
	static int operations(int start , int end){
		
		int count = end - start + 1;

		return count;
	
	}

	public static void main(String args []){
		
		Scanner sc = new Scanner(System.in);

		int start = sc.nextInt();

		int end = sc.nextInt();

		System.out.println("Difference between " + start + " and " + end + " is " + operations(start , end));
	}

}
