import java.io.*;
class FileDemo{
	
	public static void main(String args [])throws IOException{
	
		File fobj = new File("Incubators.txt");
		
		fobj.createNewFile();

		File dirObj = new File("Java2024");

		dirObj.mkdir();

		File fobj2 = new File(dirObj , "Core2Web.txt");

		fobj2.createNewFile();
	
	}

}
