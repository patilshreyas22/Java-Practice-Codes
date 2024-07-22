import  java.io.*;

class Demo{

	public static void main(String args [])throws IOException{
	
	
		File fobj = new File("/home/shreyas/Java/DailyCodes/FileHandling");


		String [] names = fobj.list(); 

		int DirCount = 0;

		int FileCount = 0;

		for(int i = 0 ; i<names.length ; i++){
		
			String name = names[i];           // this line stores the file from string array(names)

			File obj = new File(fobj , name); // This line creates a new object of every file present in the directory (fobj)

			if(obj.isDirectory()){
			
				DirCount++;

			}else if(obj.isFile()){
			
				FileCount++;
			}

			System.out.println(names[i]);

		}
	
		System.out.println("Folder Count " + DirCount);
		System.out.println("File Count " + FileCount);
	
	
	}




}
