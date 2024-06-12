import java.util.*;
class code1{



	public static void main(String args []){
	
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the size of the array : ");

		int size = sc.nextInt();

		int [] arr = new int [size];

		System.out.println("Enter the elements in the array : ");

		for(int i = 0 ; i<arr.length ; i++){
		
			arr[i] = sc.nextInt();
		
		
		}

		System.out.println("Printing the even numbers from the array : ");
		int count = 0;
		for(int i = 0 ; i<arr.length ; i++){
		
		
			if(arr[i]%2==0){
				count +=1;
				System.out.print(arr[i] + "  ");
			}
		
		
		}

		System.out.println("Count of even numbers : " + count);
	
	
	}

















};
