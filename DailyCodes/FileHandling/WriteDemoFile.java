import java.io.*;

class Demo{

	public static void main(String args [])throws IOException{
	
		FileWriter writer = new FileWriter("WritingFile.txt");

		writer.write("Hello , Shreyas This side , I am now OverWriting this File");

		writer.close();

		System.out.println("Data has been written to the file");
	
	}

}
