import java.util.*;
class client{
	
	static int operations(int number){
		
		int sum = (number*(number+1))/2;
		return sum;
	
	}
	public static void main(String args []){
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");

		int number = sc.nextInt();

		System.out.println("Sum of the numbers is : " + operations(number));
	
	}


}
