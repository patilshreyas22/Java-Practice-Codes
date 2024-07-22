import java.io.*;

class Demo{

	public static void main(String args [])throws IOException{
		
		FileWriter writer = new FileWriter("Example.txt");

		writer.write("Hello , World \n");
		writer.write("This is an example of FileWriter. \n");

		writer.close(); //IF YOU DONT CALL THE CLOSE METHOD , THE EXAMPLE.TXT FILE WONT BE WRITTEN BY THE PROGRAM

		System.out.println("Data has been written to the file.");
		
	
	}

}
