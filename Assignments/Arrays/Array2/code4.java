import java.util.*;
class code4{



	public static void main(String args []){
	
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the size of the array : ");

		int size = sc.nextInt();

		int [] arr = new int [size];

		System.out.println("Enter the elements in the array : ");

		for(int i = 0 ; i<arr.length ; i++){
		
			arr[i] = sc.nextInt();
		
		
		}

		System.out.print("Enter the element to be searched in the array : ");

		int number = sc.nextInt();


		for(int i = 0 ; i<arr.length ; i++){
		
		
			if(arr[i] == number){
			
			
				System.out.println(number + " found at index " + i);
			}
		
		
		}

		
	
	
	}

















};
