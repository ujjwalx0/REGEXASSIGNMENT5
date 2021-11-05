
/*Assignment 3:
Implement the Hierarchical Inheritance using the following objects.
Employee
1. getEmployeeName()
2. getEmployeeId()
PermanentEmployee
1. salaryOnMonthly()
ContractEmployee
1. salaryOnHourly()*/

package Assignments_Regex;
import java.util.Scanner;
class Employee{
	 String getEmployeeName(String E_Name) { return E_Name;}
	 String  getEmployeeId(String E_Id) {  return E_Id; }	 
		 
}		 
class PermanentEmployee extends Employee {
	int salaryOnMonthly(int monthly_Sal) { return monthly_Sal; }		 
}	 
class ContractEmployee extends Employee{
	int salaryOnHourly(int Hourly_Sal) {  return Hourly_Sal; }
		
} 
public class Hierarchical_Inheritance_Test {

	public static void main(String[] args) {
		Employee e= new Employee();
		PermanentEmployee pe = new PermanentEmployee();
		ContractEmployee ce = new ContractEmployee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Name of Employee: ");
		String  E_Name = sc.nextLine();
		System.out.println("Enter The Id of Employee: ");
		String E_Id = sc.nextLine();
		System.out.println("Enter Monthly Salary of Employee: ");
		int monthly_Sal = sc.nextInt();
		System.out.println(pe.salaryOnMonthly(monthly_Sal));
		System.out.println("Enter Hourly Salary of Employee: ");
		int Hourly_Sal = sc.nextInt();
		System.out.println("Permanent Employee Name is : "+pe.getEmployeeName(E_Name)+" his Id  is :"+pe.getEmployeeId(E_Id)+",And monthly salary is: "+pe.salaryOnMonthly(monthly_Sal));
		System.out.println("Contract Employee Name is : "+ce.getEmployeeName(E_Name)+" his Id  is :"+ce.getEmployeeId(E_Id)+",And hourly salary is: "+ce.salaryOnHourly(Hourly_Sal));
		
		
		
		
		
		

	}

}	
		 
		 
	

		
		 
		
		 
		
		 
		 
	 

	


		
		
		 
		 
		
	

	


		

