import java.io.*;

class code5{




	public static void main (String args [])throws IOException{
	
	
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
	
		System.out.println("Enter the size of the array : ");

		int size = Integer.parseInt(br.readLine());

		int [] arr = new int [size];

		System.out.println("Add elements : ");

		for(int i = 0 ; i<arr.length ; i++){
		
			arr[i] = Integer.parseInt(br.readLine());
		
		
		
		}

		System.out.println("Conversion...");

		for(int i = 0 ; i<arr.length ; i++){
		
			if(arr[i]<0){
			
				arr[i]*=arr[i];
			}
	
		
		
		}



		for(int i = 0 ; i<arr.length ; i++){
		
		
			System.out.println(arr[i]);
		
		}
	
	
	
	}


















}
