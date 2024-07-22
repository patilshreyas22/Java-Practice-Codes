import java.io.*;

class Demo{ //this code will not be more efficient then this same code written using the BufferedWriter as the BufferedWriter will write the data in bulk whereas the FileWriter will write the Character wise data

	public static void main(String args [])throws IOException{
	
		FileWriter writer = new FileWriter("HugeData.txt");

		for(int i = 0 ; i<10000 ; i++){
		
			writer.write("This is line number : " + i + "\n");
		}

		writer.close(); 
	}

}
