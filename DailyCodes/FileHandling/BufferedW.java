import java.io.*;

class BufferedWriterExample{

	public static void main(String args [])throws IOException{
	
	
		FileWriter fwriter = new FileWriter("BufferedExample.txt");

		BufferedWriter bwriter = new BufferedWriter(fwriter);

		for(int i = 0 ; i< 10000 ; i++){
		
			bwriter.write("This is line number " + i + "\n");
		}

		bwriter.close();

		fwriter.close();

		System.out.println("Data has been written succesffuly using the BufferedWriter");






	
	}

}
