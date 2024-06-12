import java.util.*;
class code7{



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
		
			if(size%2==0){
			
				if(i%2==0){
				System.out.println(arr[i]);
				}
			
			}
			else{
			
				System.out.println(arr[i]);
			
			}
		
		
		
		}

		

		
	
	
	}

















};
