
/* Create a class named 'Employee' having the following members: Name, Age, Phone number, Address, Salary. It also has a 
method named 'printSalary( )' which prints the salary of the Employee. Two classes 'Officer' and 'Manager' inherits the 
'Employee' class. The 'Officer' and 'Manager' classes have data members 'specialization' and 'department' respectively. 
Now, assign name, age, phone number, address and salary to an officer and a manager by making an object of both of these 
classes and print the same. */

import java.util.Scanner;

class Employee
{
	Scanner user = new Scanner(System.in);
	String Name,Address,PhoneNumber,Salary;
	int Age;

	void Read()
	{
		System.out.println("Enter the name : ");
		Name=user.nextLine();
		System.out.println("Enter the age : ");
		Age=user.nextInt();
		System.out.println("Enter the phone number : ");
		user.nextLine();
		PhoneNumber=user.nextLine();
		System.out.println("Enter the address : ");
		Address=user.nextLine();
		System.out.println("Enter the Salary : ");
		Salary=user.nextLine();
	}

	void PrintSalary()
	{
		System.out.println("Salary is "+Salary);
	}
	
	void PrintDetails()
	{
		System.out.println("Name is "+Name);
		System.out.println("Age is "+Age);
		System.out.println("Phone Number is "+PhoneNumber);
		System.out.println("Address is "+Address);
	}
}

class Officer extends Employee
{
	Scanner user = new Scanner(System.in);	
	String Specialisation;

	void Officer_1()
	{
		System.out.println("------Office-----");
		Read();
		System.out.println("Enter the specialisation : ");
		Specialisation=user.nextLine();
        System.out.println("-----------------"); 
		PrintDetails();
		PrintSalary();
		System.out.println("Specialisation is "+Specialisation);
	}
}

class Manager extends Employee
{
	String Department;

	void Manager_1()
	{	
		System.out.println("-------Manager----");
		Read();
		System.out.println("Enter the Department : ");
		Department=user.nextLine();
        System.out.println("-----------------"); 
		PrintDetails();
		PrintSalary();
		System.out.println("Department is "+Department);
	}
}

class Employee_Inheritance
{
	public static void main(String args[])
	{
		Officer A1 = new Officer();
        A1.Officer_1();
		Manager B1 = new Manager();
        B1.Manager_1();
	}
}
