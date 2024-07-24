import java.io.*;

class Demo{

	public static void main(String args [])throws IOException{
	
		BufferedReader br = new BufferedReader(new FileReader("file.txt"));
		
		String line;

		while((line = br.readLine()) != null){
		
			System.out.println(line);
		}

		br.close();
	
	
	}
}
