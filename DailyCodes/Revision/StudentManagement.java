import java.util.*;
import StudentData;

class OpeningPage{
	
	int choice;

	OpeningPage(){
	
	System.out.println("-------------------Student Console-----------------------");

	System.out.println("                   0) Register                           ");

	System.out.println("                   1) Attendance                         ");

	System.out.println("                   2) Marks                              ");

	System.out.println("                   3) Fees                               ");

	System.out.print("                   Enter your Choice : ");

	
	}
	
	OpeningPage(int choice){

	this.choice = choice;

	}

}
class Controls extends OpeningPage{

	Controls(){
		
		super();
	}
	public static void main(String args []){
	
	
		Scanner sc = new Scanner(System.in);
	
		Controls controls = new Controls();

		int choice = sc.nextInt();

		OpeningPage ChoicePass = new OpeningPage(choice);

		StudentFile SF = new StudentFile();

		
		switch(choice){
			
			case 0:
				
				SF.register();
				break;
		
		}		
		
		
	
	}
}
