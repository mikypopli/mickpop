package com.gl.service;

import java.util.Random;

import com.gl.model.Employee;


public class PasswordGenerator {

	public char[] generatePassword( ) {
		String lowerCaseLetter = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "!@#$%^&*?_+<>";
			String Number = "1234567890";
			String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String numbers = "0123456789";

		String combinedChars = capitalLetters + lowerCaseLetter +specialCharacters + numbers;
				 char[] password = new char[8];
				 Random random = new Random();
				 
		for (int i=0; i<8; i++) {
			password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		}
		return password;
		
				
	}
	public String generateEmailAddress(String firstName, String lastName, String department)
	{
		return firstName+lastName+"@"+department+".abc.com";
	}
	
	public void showCredentials(Employee employee, String email, char[] generatedPassword) {
		System.out.println("Dear "+employee.getFirstName()+ " your generated credentials are as follows ");
		System.out.println("Email --> "+ email);
		System.out.print("Password --> 1"
				+ "");
		System.out.print(generatedPassword);
	}

}
