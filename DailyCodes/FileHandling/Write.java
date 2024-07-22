import java.io.*;

class Demo{

	public static void main(String args [])throws IOException{
	
		FileWriter writer = new FileWriter("WritingFile.txt" , true);

		writer.write("Hi this is Shreyas again , appending the file using the Append Parameter \n");

		writer.close();

		System.out.println("The file has been overwritten");
	
	
	}

}
