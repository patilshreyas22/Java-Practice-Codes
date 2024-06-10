import java.util.*;



class code28{


	public static void main(String args []){
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Your Name : ");

	String Name = sc.nextLine();

	StringTokenizer st = new StringTokenizer(Name , "@");

	while(st.hasMoreTokens()){
	
		System.out.println(st.nextToken());
	}
	
	
	
	
	
	}




}
