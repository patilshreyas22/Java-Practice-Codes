import java.util.*;
import java.text.NumberFormat;

class InventoryB{

	public static void main(String args []){
	
	
		final double boxprice = 3.25;
		Scanner keyboard = new Scanner(System.in);
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String numBoxesIn = "0";
		int numBoxes = Integer.parseInt(numBoxesIn);
		System.out.println("How many boxes do we have ? ");
		try{
		numBoxesIn = keyboard.next();
		numBoxes = Integer.parseInt(numBoxesIn);
		}catch(NumberFormatException nfe){
		
			System.out.println("Enter the Value of Boxes Again : ");
			numBoxesIn = keyboard.next();
			numBoxes = Integer.parseInt(numBoxesIn);
			System.out.println(nfe.getMessage()); // getMessage is a method which prints the description of the Exception
		
		}

		System.out.println("The Value is : " + currency.format(numBoxes * boxprice));
		keyboard.close();
	}



}
