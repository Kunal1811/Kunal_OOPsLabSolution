package com.email.service;
import java.util.Random;

import com.email.model.Employee;

public class CredentialService {
	Random r = new Random();
	
	private String generatePassword() {
		
		String pwd = " ";
		for(int i=0;i<8;i++) {
			pwd+=(char)r.nextInt(33, 123);
		}
		return pwd;
		
	}
	private String generateEmailAddress(Employee e, String department) {
		return e.getFirstName().toLowerCase()+e.getLastName().toLowerCase()+"@"+department+".abc.com";
	}
	public void showCredentials(Employee e, String department) {
		System.out.println("Dear "+e.getFirstName()+" your generated credentials are as follows: ");
		System.out.println("Email -> "+generateEmailAddress(e , department));
		System.out.println("Password -> "+generatePassword());

	}
}
