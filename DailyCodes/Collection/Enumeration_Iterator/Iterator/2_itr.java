import java.util.*;

class itrDemo{
	
	String name;

	itrDemo(String name){
		
		this.name = name;
	
	}

	String printData(){
		
		return name;
	
	}

	public String toString(){
		
		return printData();
	
	}

}
class client{

	
	public static void main(String args []){
	
		
		ArrayList<itrDemo> al = new ArrayList<>();

		al.add(new itrDemo("Shreyas"));
		al.add(new itrDemo("Aditya"));
		al.add(new itrDemo("Tejas"));
		al.add(new itrDemo("Pranita"));

		
		System.out.println("Whole ArrayList : " + al);

		System.out.println("Iteration over the ArrayList using the Iterator : ");

		Iterator<itrDemo> itr = al.iterator();

		while(itr.hasNext()){
			
			System.out.println(itr.next());
		
		}
		
	
	}

}
