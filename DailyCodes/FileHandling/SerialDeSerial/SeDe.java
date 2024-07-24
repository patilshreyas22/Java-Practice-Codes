import java.io.*;

class Employee implements Serializable{
	
	int empid;

	String empname;

	Employee(int empid , String empname){
	
		this.empid = empid;

		this.empname = empname;
	
	}

}

class SerializationDemo{


	public static void main(String args [])throws IOException{
	
	
		Employee emp1 = new Employee(101 , "Shreyas");

		Employee emp2 = new Employee(102 , "Aditya");

		FileOutputStream fos = new FileOutputStream("Demo.txt");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(emp1);

		oos.writeObject(emp2);


	
	}


}
