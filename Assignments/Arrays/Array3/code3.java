import java.util.*;
class code3{


	public static void main(String args []){
	
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array :");

		int size = sc.nextInt();

		int [] arr = new int [size];

		System.out.println("Add the elements in the array : ");

		for(int i = 0 ; i<arr.length ; i++){
		
			arr[i] = sc.nextInt();
		
		
		
		}

		System.out.println("Enter the number to be counted : ");

		int num = sc.nextInt();

		int count = 0;

		boolean found = false;

		for(int i = 0 ; i<arr.length ; i++){
		
			if(arr[i] == num){
				found = true;
				count += 1;
			}
		
		
		}

		if(!found){
		
			System.out.println("Number " + num + " not found in the array ");
		}
		else{
		
			System.out.println(" Number " + num + " occurred " + count + " times in the array");
		
		}
	
	
	
	
	}
	
	
	


}
