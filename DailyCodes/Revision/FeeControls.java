import java.io.*;

class Fees extends Thread{

	public void totalFees(int totalFees){
		
		System.out.println("Total Fees : " + totalFees);
	
	}



}
public class FeeControls{

	
	public static void main(String args []){
	
		
		Fees fee = new Fees();

		fee.totalFees(135000);
		
	
	}


}
