package com.mainPack;
import java.util.Scanner;

public class MainProgram {
	public static void main(String... args) {
		GUI gui = new GUI(); //"User interface"
		Scanner sc = new Scanner(System.in); // User input	
		DatabaseForCustomers DB = new DatabaseForCustomers(); // database instance
		
		int option; // option variable
		
		do {
			gui.welcomeAndLogin(); //welcome screen before logging in
			option = sc.nextInt(); //possibility to choose
			switch (option) {
			case 1:
				DB.logIn();
				break;
			case 2: 
				DB.createNewAccount();
				break;
			}
		} while (!DB.loggedIn); // repeat while user is not logged in
		
		gui.welcomeAndOptions(); //welcome screen after logging in
		
		
		
	}
}
