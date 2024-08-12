package StudentData;
import java.io.*;
import java.util.*;

class StudentFile{

	void register() throws IOException{

	FileWriter fobj = new FileWriter("StudentNames.txt");

	BufferedWriter bobj = new BufferedWriter(fobj);

	Scanner sc = new Scanner(System.in);

	String Name = sc.nextLine();

	bobj.write(Name);

	fobj.close();

	bobj.close();
	
	}


}
