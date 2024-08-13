import java.io.*;

class Employee implements Serializable{

	int empid ;

	String empName ;

	Employee(int empid , String empName){
		this.empid = empid;
		this.empName = empName;
	
	}

}

class Demo{

	public static void main(String args [])throws IOException{
	
		Employee emp1 = new Employee(101 , "Shreyas");

		

		FileOutputStream fos = new FileOutputStream("Serialization.txt");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		ObjectOutputStream oos1 = new ObjectOutputStream(fos);

		oos.writeObject(emp1);
		

		System.out.println("Employee object has been serialized and saved in Serialization.txt");

	
	}

}
