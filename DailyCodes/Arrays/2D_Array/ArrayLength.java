import java.io.*;

class Demo{

	
	public static void main(String args []){
		
		int size=0; //You cannot initialize the variable inside the TRY block as it will lessen the scope of it and then you wont be able to use it outside the TRY block
			    //you have to give it a size as 0 , as it will throw a error that the size has not been declared yet 
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Please provide the size of the Array : ");
		

		try{
		 size = Integer.parseInt(br.readLine());
		}catch(IOException e){
			
			System.out.println("IOException Occured");
		}

		int arr [] = new int[size];

		System.out.println("Array " + System.identityHashCode(arr) + " has been initialized with size " + arr.length );
	
	}

}
