import java.util.*;
import java.io.*;

class ShowNames {
	
public static void main(String args []) throws IOException{


	ArrayList<String>people = new ArrayList<>();

	Scanner sc = new Scanner(new File("names.txt"));

	while(sc.hasNext()){
		people.add(sc.nextLine());
	}
	people.remove(0);
	people.add(2 , "Shreyas Patil");

	for(String name : people){
		System.out.println(name);
	}

	sc.close();

}
}
