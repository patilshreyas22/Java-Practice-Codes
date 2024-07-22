import java.io.*;

class Demo{

	public static void main(String args [])throws IOException{
		
		FileWriter writer = new FileWriter("Example.txt");

		writer.write("Hello , World \n");
		writer.write("This is an example of FileWriter. \n");

		writer.close();

		System.out.println("Data has been written to the file.");
		
	
	}

}
