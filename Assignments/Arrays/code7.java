import java.io.*;
class code7{

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


		for(int i =0 ; i<arr.length ; i++){
		
			if(arr[i]%4==0){
				System.out.println(arr[i]);
			}
			
		
		}
	
	
	
	
	
	}













}
