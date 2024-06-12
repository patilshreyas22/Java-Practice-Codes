import java.util.*;
class code10{



	public static void main(String args []){
	
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the size of the array : ");

		int size = sc.nextInt();

		int [] arr = new int [size];

		System.out.println("Enter the elements in the array : ");

		for(int i = 0 ; i<arr.length ; i++){
		
			arr[i] = sc.nextInt();
		
		
		}


		int temp = arr[0];
		for(int i = 1 ; i<arr.length ; i++){
		
			if(temp>=arr[i]){
			
		
			}
			else{
			
			
				temp=arr[i];
			}
		
		
		
		}

		System.out.println("Biggest Element from the array is " + temp);

		

		
	
	
	}

















};
