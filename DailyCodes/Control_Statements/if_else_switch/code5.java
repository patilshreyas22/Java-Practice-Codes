import java.util.Scanner;
class code5{


	public static void main(String args []){

	System.out.println("Start Main");

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter Your Age : ");

	int age = sc.nextInt();

	if(age<18){
	
	System.out.println("You are not eligible for voting");

	}
	else{
	
	System.out.println("You are eligible for voting");
	
	}

	System.out.println("End Main");

}
}
