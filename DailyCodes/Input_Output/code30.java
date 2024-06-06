import java.io.*;

class code30{


	public static void main(String args [])throws IOException{
	
	
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);

	System.out.print("Please Enter the Employee ID : ");
	int empId = Integer.parseInt(br.readLine());
	System.out.print("Enter Company Name : ");
	String CompName = br.readLine();
	System.out.print("Enter Employee Name :");
	String Name = br.readLine();
	System.out.print("Enter Employee Salary :");
	double Salary = Double.parseDouble(br.readLine());

	System.out.println("Employee ID : " + empId);
	System.out.println("Company Name : " + CompName);
	System.out.println("Employee Name : " + Name);
	System.out.println("Employee Salary : " + Salary);

	
	
	
	}




}
