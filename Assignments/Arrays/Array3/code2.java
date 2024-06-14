import java.util.*;
class code2{


	public static void main(String args []){
	
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the Array : ");
		
		int size = sc.nextInt();

		int arr [] = new int [size];
		
		for(int i = 0 ; i<arr.length ; i++){
		
			arr[i] = sc.nextInt();
		
		
		}

		System.out.println("Enter the number to be searched : ");

		int num = sc.nextInt();

		
		int flag = 0;
		for(int i = 0 ; i<arr.length ; i++){
		
			if(arr[i] == num){
				System.out.println("Number " + num + " first occurred at index : " + i );
				flag = 1;
				break;
			
			
			}
			
		
		}

		if(flag!=1){
		
			System.out.println("Number " + num + " not found in the array ");
		}
		
	}

}
