import java.io.*;

class Count{

	public static void main(String args [])throws IOException{
	
	
		File obj = new File("/home/shreyas/Java/DailyCodes/FileHandling/DemoFolder");

		String [] names = obj.list(); //this method from the File class will give us an array of names of the files in the given directory
					 
		int DirCount = 0 ;

		int FileCount = 0;
		
		if(names != null){	
		for(int i = 0 ; i<names.length ; i++){
		
			String name = names[i];

			File file = new File(obj , name);

			if(file.isDirectory()){
			
				DirCount++;
			
			}
			else if(file.isFile()){
			
				FileCount++;
			}

		}
		}else{
		
			System.out.println("The Directory is Empty!");
		
		}
		
		
	

		System.out.println("Folder Count : " + DirCount);
	
		System.out.println("File Count : " + FileCount);
	
	}

}




