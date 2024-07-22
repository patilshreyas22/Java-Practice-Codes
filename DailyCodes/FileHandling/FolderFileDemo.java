import java.io.*;


class Demo{

	public static void main(String args [])throws IOException{
	
	
		File obj1 = new File("FolderDemo");

		obj1.mkdir();

		File obj2 = new File( obj1 , "Demo.txt");

		obj2.createNewFile();
	
	
	
	
	
	}


}
