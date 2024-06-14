import java.util.*;
class code1{

	public static void main(String args []){
	
	Scanner sc = new Scanner(System.in);

	System.out.print("Please Enter a Number : ");

	int num = sc.nextInt();

	System.out.println("Checking if the number is divisible by 2....");

	if(num%2==0){
		
		System.out.println(num + " is divisible by 2");
	}
	else{
	
		System.out.println(num + " is not divisible by 2");
	
	}
	
	}

}
