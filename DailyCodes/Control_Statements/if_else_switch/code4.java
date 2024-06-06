import java.util.Scanner;
class code4{


	public static void main(String args []){

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter Your Age : ");

	int age = sc.nextInt();

	if(age<18){
	
	System.out.println("You are not eligible for voting");

	}
	else{
	
	System.out.println("You are eligible for voting");
	
	}

}
}
