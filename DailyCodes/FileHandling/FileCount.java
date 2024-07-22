import java.io.*;

class FileCount{

	public static void main(String args [])throws IOException{
	
	
		File obj = new File("/home/shreyas/Java/DailyCodes/FileHandling");

		String names [] = obj.list();

		for(int i = 0 ; i<names.length ; i++){
		
			System.out.println(names [i]);
		}

		System.out.println(names.length);
	
	
	
	}



}
