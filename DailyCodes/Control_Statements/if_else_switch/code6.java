import java.util.Scanner;
class code6{


	public static void main(String args []){

	//System.out.println("Start Main");

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter Your Number : ");

	int num = sc.nextInt();

	if(num<0){
	
	System.out.println("Number is negative");

	}
	else if(num>0){
	
	System.out.println("Number is positive");
	
	}

	else if(num==0){

	System.out.println("Number is zero");

	}

}
}
