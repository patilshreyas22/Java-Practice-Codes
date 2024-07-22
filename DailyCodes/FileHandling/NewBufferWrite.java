import java.io.*;

class Demo{

	public static void main(String args [])throws IOException{
	
		FileWriter fobj = new FileWriter("NewFile.txt");

		BufferedWriter bobj = new BufferedWriter(fobj);

		bobj.write("I am writing using the BufferedWriter \n");

		bobj.write("If you give the same name of your class/java program as the name of the pre-defined class , then it shows the duplicate class name Error");

		bobj.close();

		fobj.close();	
	}

}
