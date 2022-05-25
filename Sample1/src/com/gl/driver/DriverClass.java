package com.gl.driver;

import java.util.Scanner;

import com.gl.model.Employee;
import com.gl.service.PasswordGenerator;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee("Harshit", "Choudhary");
		String generatedEmail;
		char[] generatedPassword;
	PasswordGenerator generator = new PasswordGenerator();
	System.out.println("Please enter the department from the following ");
	System.out.println("1. Technical");
	System.out.println("2. Admin");
	System.out.println("3. Human Resource");
	System.out.println("4. Legal");
	int option = sc.nextInt();

	if (option == 1) {
		generatedEmail = generator.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(), "tech");
		generatedPassword = generator.generatePassword();
		generator.showCredentials(employee, generatedEmail, generatedPassword);
	}
	else if (option == 2) {
		generatedEmail = generator.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(), "adm");
		generatedPassword = generator.generatePassword();
		generator.showCredentials(employee, generatedEmail, generatedPassword);
	}
	else if (option == 3) {
		generatedEmail = generator.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(), "hr");
		generatedPassword = generator.generatePassword();
		generator.showCredentials(employee, generatedEmail, generatedPassword);
	}
	else if (option == 4) {
		generatedEmail = generator.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(), "lg");
		generatedPassword = generator.generatePassword();
		generator.showCredentials(employee, generatedEmail, generatedPassword);
	}
	
	else
		System.out.println("Enter a valid option");
	
	sc.close();
	}

}
