import java.util.*;
class code5{



	public static void main(String args []){
	
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the size of the array : ");

		int size = sc.nextInt();

		int [] arr = new int [size];

		System.out.println("Enter the elements in the array : ");

		for(int i = 0 ; i<arr.length ; i++){
		
			arr[i] = sc.nextInt();
		
		
		}


		int sum = 0;
		for(int i = 0 ; i<arr.length ; i++){
		
		
			if(i%2!=0){
			
			sum+=arr[i];
			}
		
		
		}

		System.out.println("Sum of the odd indexed elements is : " + sum);

		
	
	
	}

















};
