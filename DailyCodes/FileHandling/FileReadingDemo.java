import java.io.*;

class Demo{

	public static void main(String args [])throws IOException{
		

		FileReader fr = new FileReader("file.txt");

		int ch ;

		while((ch = fr.read()) != -1){
		
			System.out.println((char)ch);
		}

		fr.close();	
	}

}
