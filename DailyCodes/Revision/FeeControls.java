import java.io.*;

class Fees extends Thread{

	private int amountPaid;
	Fees(int amount){
		
		this.amountPaid = amount;
	
	}

	Fees(){
		//this constructor is used just to start the 2nd thread
	}

	public static void totalFees(int totalFees){

		System.out.println();
		System.out.println("                   Total Fees : " + totalFees);
	
	}

	int pendingFees(int payingAmount){
		
		return 135000 - payingAmount;	
	}

	public void run(){
		


		try{
			
			Thread.sleep(2000);
		
		}catch(InterruptedException ie){
			
			System.out.println("Please try again later...");
		
		}

		pendingFees(amountPaid);

		System.out.println("Paid : " + amountPaid);

		int pendingfees = pendingFees(amountPaid);
		System.out.println();
		System.out.println("Pending Fees : " + pendingfees);
		
	}



}
public class FeeControls extends Fees{

	
	public static void main(String args []){

		

		totalFees(135000); //non static method totalFees cannot be referenced throught static context , so im gonna make this method as STATIC
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("                   Enter the amount you are paying : ");

		int Amount = 0;

		try{
		  Amount = Integer.parseInt(br.readLine());
		}catch(IOException ioe){
			
			System.out.println("Please try again later...");
		
		}

		
		Fees fee = new Fees(Amount);
		
		fee.start();
		
		
	
	}


}
