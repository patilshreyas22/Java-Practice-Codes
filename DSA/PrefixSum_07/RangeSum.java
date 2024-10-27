import java.util.*;

// a the  time complexity is checked for the worst scenarios possible , the TC for the below given program is O(N)
class demo{
	
	public static void main(String args []){
	

		Scanner sc = new Scanner(System.in);

		int arr [] = new int []{2 , 5 , 3 , 11 , 7 , 9 , 4};

		int size = arr.length;

		int start = sc.nextInt();

		int end = sc.nextInt();

		int sum = 0;

		for(int i = start ; i<=end ; i++ ){
			
			sum+=arr[i];
		
		}

		System.out.println("Sum of the array elements from " + start + " to " + end + " is :" + sum);

	}

}
