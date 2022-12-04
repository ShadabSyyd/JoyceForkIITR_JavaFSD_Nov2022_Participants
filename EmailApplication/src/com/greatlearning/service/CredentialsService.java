package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.interfaces.ICredentials;
import com.greatlearning.model.Employee;

public class CredentialsService implements ICredentials {

	//specific implementation for each method in ICredentials
	
	@Override
	public String generateEmailAddress(String firstName, String lastName, String department) {
		String atSymbol = "@";
		String emailAddress = firstName+lastName+atSymbol+department+".gl.com";
		//johnandrew@adm.gl.com
		return emailAddress;
	}
	
	@Override
	public String generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		
		String allValues = capitalLetters + smallLetters 
				+ numbers + specialCharacters;
		
		//allValues = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*_=+-/.?<>)";
		
		Random randomObj = new Random();			
		String password="";
		
		for (int i=0; i < 8; i++) {

			int boundValue = allValues.length();//70
			int randomIndex = randomObj.nextInt(boundValue);//randomObj.nextValue(70) - between 0 and 70	
			char randomChar = allValues.charAt(randomIndex);//allValues.charAt(3)			
			password += String.valueOf(randomChar);//"D"
		}	
		//Dl0*w?#q
		return password;
	}

	@Override
	public void showCredentials(Employee employee) {
		//welcome message
		//display email, password
		System.out.println("Dear "+employee.getFirstName() + " your generated credentials are :");
		System.out.println("Email ID : " + employee.getEmail());
		System.out.println("Password : " +employee.getPassword());
	}
	
}
