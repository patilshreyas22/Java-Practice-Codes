import java.util.*;

class Demo{
	
	public static void main(String args []){
	
	
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int arr [] = new int[size];

		boolean isPalindrome = false;

		for(int i = 0 ; i<arr.length ; i++){
			
			arr[i] = sc.nextInt();
		
		}

		for(int i = 0 ; i<arr.length/2 ; i++){
		
			
			if(arr[i]==arr[size-1-i]){
			
				isPalindrome = true;
			
			}
			else{
			
				isPalindrome = false;
				System.out.println("The given array is not a Palindrome");
				break;
			}
		
		}

		if(isPalindrome == true){
		
			
			System.out.println("The given array is a Palindrome");
		}
	}

}
