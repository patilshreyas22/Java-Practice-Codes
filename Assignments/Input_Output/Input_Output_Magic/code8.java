import java.util.*;

class code8{

	public static void main(String args []){
	
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Please Enter a Number 1 : ");

		int num1 = sc.nextInt();

		System.out.print("Please Enter a Number 2 : ");

		int num2 = sc.nextInt();
		
		int sum = 0;


		for(int i = num1 ; i<=num2 ; i++){
		
			sum += i;
		
		}

		System.out.println("The Sum is " + sum);

	
	
	}


}
