import java.util.*;
class code3{



	public static void main(String args []){
	
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the size of the array : ");

		int size = sc.nextInt();

		char [] arr = new char [size];

		System.out.println("Enter the elements in the array : ");

		for(int i = 0 ; i<arr.length ; i++){
		
			arr[i] = sc.next().charAt(0);
		
		
		}
		System.out.println("Checking for vowels in the array : ");

		for(int i = 0 ; i<arr.length ; i++){
		
		if(arr[i]=='a' || arr[i]=='A' || arr[i]=='e' || arr[i]=='E' || arr[i]=='i' || arr[i]=='I' || arr[i]=='o' || arr[i]=='O' || arr[i]=='u' || arr[i]=='U'){
			System.out.println("vowel " + arr[i] + " at index " + i);
		
		}

		//System.out.println("Sum of elements divisible by 3: " + sum);
	
	
	}


}
}
