import java.io.*;
import java.util.*;

public  class NextRound {


	static int [] operations(String line){
		
		String [] numbers = line.split(" ");

		int [] intArray = new int[numbers.length];

		for(int i = 0 ; i<numbers.length ; i++){
			
			intArray[i] = Integer.parseInt(numbers[i]);
		
		}
		
		return intArray;
	
	}

	static int passed( int [] nums , int n , int k ){
		
		int count = 0;

		for(int i = 0 ; i< n ; i++){
			
			if(nums[i] > 0){

			if(nums[i] >= nums[k-1]){
				count++;
			}
			
			}
		
		}
		
	
	return count;
	}


    	public static void main(String[] args) throws IOException {
        
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String nk = br.readLine(); 

	String [] nkNums = nk.split(" ");

	int [] arr = new int [nkNums.length];

	arr[0] = Integer.parseInt(nkNums[0]);
	
	arr[1] = Integer.parseInt(nkNums[1]);

	int n = arr[0];

	int k = arr[1];

        String line = br.readLine();
	
	int nums [] = operations(line);

	System.out.println(passed(nums , n , k));
    }
}

