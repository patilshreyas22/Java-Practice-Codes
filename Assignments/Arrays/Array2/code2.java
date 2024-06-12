import java.util.*;
class code2{



	public static void main(String args []){
	
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the size of the array : ");

		int size = sc.nextInt();

		int [] arr = new int [size];

		System.out.println("Enter the elements in the array : ");

		for(int i = 0 ; i<arr.length ; i++){
		
			arr[i] = sc.nextInt();
		
		
		}

	//	System.out.println("Printing the even numbers from the array : ");
		int sum = 0;
		for(int i = 0 ; i<arr.length ; i++){
		
		
			if(arr[i]%3==0){
				sum += arr[i];
				//System.out.print(arr[i] + "  ");
			}
		
		
		}

		System.out.println("Sum of elements divisible by 3: " + sum);
	
	
	}

















};
