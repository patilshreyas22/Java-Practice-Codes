import java.util.*;

class Demo{
	
	public static void main(String args []){
	
		Scanner scanner = new Scanner(System.in);
	

		System.out.print("Enter the size of the Array : ");

		int size = scanner.nextInt();

		int arr [] = new int[size];

		System.out.println("Enter the Elements in the Array : ");

		for(int i = 0 ; i<arr.length ; i++){
			
			arr[i] = scanner.nextInt();
		
		}

		System.out.println("Counting the Digits of the Elements in the Array : ");

		int digitCount [] = new int[size];

		for(int i = 0 ; i<digitCount.length ; i++){
		
			
			int num = arr[i];
			int count = 0;

			if(num==0){
			
				count=1;
			}else{
			
			while(num != 0){
			num = num / 10;
			count++;
			}
		}

			digitCount[i] = count;
		
		}
		
		for(int i = 0 ; i<digitCount.length ; i++){

			System.out.println("The Array element " + arr[i] + " has " + digitCount[i] + " Digits"); 

		}
	
	
	}
	

}
