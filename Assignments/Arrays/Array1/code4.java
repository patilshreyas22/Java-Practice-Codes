import java.io.*;
class code4{

	public static void main(String args [])throws IOException{
	
	
	
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

		System.out.print("Enter the size of the Array : ");

		int size = Integer.parseInt(br.readLine());

		int [] arr = new int [size];

		System.out.println("Enter the elements of the array : ");

		for(int i = 0 ; i<arr.length ; i++){
		
		
			arr[i] = Integer.parseInt(br.readLine());
		
		
		}
		

		System.out.println("Printing the even elements in the array...");

		int sum = 0;
		for(int i =0 ; i<arr.length ; i++){
		
			if(arr[i]%2==0){
				//System.out.println(arr[i]);
			}
			else{
				sum+=arr[i];
				
			}
			
		
		}

		System.out.println("Sum of the odd elements in the array is " + sum);
	
	
	
	
	
	}













}
