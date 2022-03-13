package com.email.main;
import java.util.Scanner;

import com.email.model.Employee;
import com.email.service.CredentialService;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Employee e = new Employee();
		String opt;
		
		
		System.out.println("Please enter first name: ");
		String firstName = sc.next();
	
		System.out.println("Please enter second name: ");
		String lastName = sc.next();
		
		Employee e = new Employee(firstName, lastName);
		
		CredentialService gen = new CredentialService();

		System.out.println("Please Enter The Department From The Following: ");
		do {
			System.out.println("1. Technical ");
			System.out.println("2. Admin ");
			System.out.println("3. Human Resource ");
			System.out.println("4. Legal ");
			System.out.println("0. Exit ");

			int choice = sc.nextInt();
		
			switch(choice) {
				case 1:{
					//Technical
					gen.showCredentials(e, "Tech"); break;

				}
				case 2:{
					//Admin
					gen.showCredentials(e, "Admin"); break;

				}
				case 3:{
					//Human Resource
					gen.showCredentials(e, "HR"); break;
				
				}
				case 4:{
					//Legal
					gen.showCredentials(e, "Legal"); break;

				}
				case 0:{
					break;
				}
				
			}
		System.out.println("Do you want to continue the transaction: yes/no? ");
		opt = sc.nextLine();
		}while(opt.equals("yes"));
		
	}


}
