package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class DriverClass {

	public static void main(String[] args) {

		Employee employee = new Employee("firstname", "lastname");
		CredentialService cs = new CredentialService();
		String generatedEmail;
		char[] generatedPassword;
		int option;

		System.out.println("Please enter the department from the following ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		Scanner sc = new Scanner(System.in);
		 option = sc.nextInt();
		 
		 switch(option) {

		 case 1:
			generatedEmail = cs.generateEmailAddress(employee.getFirstName(),
					employee.getLastName(), "tech");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
			break;
		

		 case 2:
			generatedEmail = cs.generateEmailAddress(employee.getFirstName(),
					employee.getLastName(), "adm");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
			break;
		 
		 case 3:
		    generatedEmail = cs.generateEmailAddress(employee.getFirstName(),
					employee.getLastName(), "hr");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
			break;
		

		 case 4:
			generatedEmail = cs.generateEmailAddress(employee.getFirstName(),
					employee.getLastName(), "lg");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		    break;

		default:
			System.out.println(" Option is invalid : Enter a valid option");

		sc.close();
	}
}

}
