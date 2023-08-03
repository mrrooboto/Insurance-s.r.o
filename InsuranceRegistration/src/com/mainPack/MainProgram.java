package com.mainPack;
import java.util.Scanner;
import java.util.regex.*;

public class MainProgram {
	public static void main(String... args) {
		GUI gui = new GUI(); //"User interface"
		Scanner sc = new Scanner(System.in); // User input	
		DatabaseForCustomers DB = new DatabaseForCustomers(); // database instance
		
		String option; // option variable
		
		do {
			gui.welcomeAndLogin(); //welcome screen before logging in
			option = sc.nextLine(); //possibility to choose
			if (Pattern.matches("[12]", option)) {
			switch (option) {
			case "1":
				DB.logIn();
				break;
			case "2": 
				DB.createNewAccount();
				break;
			}
				}
		} while (!DB.loggedIn); // repeat while user is not logged in
		
		gui.welcomeAndOptions(); //welcome screen after logging in
		
		
		
	}
}
