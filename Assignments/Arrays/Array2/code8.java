import java.util.*;
class code8{



	public static void main(String args []){
	
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the size of the array : ");

		int size = sc.nextInt();

		int [] arr = new int [size];

		System.out.println("Enter the elements in the array : ");

		for(int i = 0 ; i<arr.length ; i++){
		
			arr[i] = sc.nextInt();
		
		
		}


		
		for(int i = 0 ; i<arr.length ; i++){
		
			if(arr[i]>5 && arr[i]<9){
			
				System.out.println(arr[i]);
			}
		
		
		
		}

		

		
	
	
	}

















};
