import StudentData.Names.*;
import java.util.*;
import java.io.*;

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
	public static void main(String args [])throws IOException{
	
	
		Scanner sc = new Scanner(System.in);
	
		Controls controls = new Controls();

		int choice = sc.nextInt();

		OpeningPage ChoicePass = new OpeningPage(choice);

				
		switch(choice){
			
			case 0:
				
				StudentName obj = new StudentName();
				obj.register();		
				break;
		
		}		
		
		
	
	}
}
