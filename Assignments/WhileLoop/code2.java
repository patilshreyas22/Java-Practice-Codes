import java.util.Scanner;
class code2{

	public static void main(String args []){
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Please Enter a Number : ");

		int num = sc.nextInt();

		System.out.println("Performing required operations...");

		if(num%3==0){
		
			System.out.println(num + " is divisible by 3");
		}

		else{
			System.out.println(num + " is not divisbile by 3");
		}
	
	}

}
