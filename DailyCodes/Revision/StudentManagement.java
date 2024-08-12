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

	System.out.println("                   4) Exit                               ");

	System.out.print("                   Enter your Choice : ");

	
	}
	
	OpeningPage(int choice){

	this.choice = choice;

	}

}
class Attendance{


	public void AttendancePercentage(int percentage){
		
		System.out.println("                   Your Percentage is " + percentage + "% ");

		if(percentage>0 && percentage<100){

			if(percentage<75){
			
				System.out.println("                   You are not eligible for Exams");
		
			}else{
			
				System.out.println("                   You are eligible for Exams");
			
			}
		}else{
			
			System.out.println("Invalid Percentage");
		
		} 

	
	}



}

class Controls extends OpeningPage{

	Controls(){
		
		super();
	}
	public static void main(String args [])throws IOException{
	
	
		Scanner sc = new Scanner(System.in);

		boolean Running = true;

	while(Running == true){
	
		Controls controls = new Controls();

		int choice = sc.nextInt();

		OpeningPage ChoicePass = new OpeningPage(choice);
		
		Attendance attper = new Attendance();

				
		switch(choice){
			
			case 0:
				
				StudentName obj = new StudentName();
				obj.register();		
				break;

			case 1:
				attper.AttendancePercentage(77);
				break;


			case 4:
				Running = false;
				System.out.println("                   Exiting the App               ");
				break;
		
		}		
		
	    }
	
	}
}
