package com.mainPack;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class DatabaseForCustomers {
	
	//health info.
	protected Integer height;
	protected Integer weight;
	protected String currentMedicalCondition;
	protected ArrayList<String> userNames = new ArrayList<String>();
	protected ArrayList<String> passwords = new ArrayList<String>();
	
	//account info
	protected String username;
	protected String password;
	
	//Scanner input
	Scanner sc = new Scanner(System.in);
	
	
	/**
	 * Checks if the conditions for password creation are met
	 * @return password is valid
	 * boolean variable for password 1st step password check
	 */
	protected boolean valid; 
	
	public boolean passwordVerification() {
		if(Pattern.matches("[123456789]+", password)) {
		} else if (password.length() > 8){
			valid = true;
			userNames.add(username);
		} else {
			System.out.println("Password has not met conditions. Please try again.");
		}
		return valid;
	}
	
	
	/**
	 * Checks if passwords match in the 2nd step of the verification
	 * @return verification confirmed
	 * boolean to check if password matches
	 */
	protected boolean confirmed;
	
	public boolean passwordConfirmation() {
		confirmed = false;
		if(password.matches(confirm)) {
			confirmed = true;
			System.out.println("Password matches !");
			passwords.add(password);
		} else {
			System.out.println("Password doesn't match.");
		}
		return confirmed;
	}
	
	/**
	 * Checks if the login details are correct
	 * @return login checked
	 * boolean variable to see if logging in passed the check
	 */
	protected boolean loggedIn;
	
	public boolean logInVerification() {
		loggedIn = false;
		if (userNames.contains(username) && passwords.contains(password)) {
			System.out.println("Succesfully logged in.\n");
			loggedIn = true;
		} else if (!userNames.contains(username) && !passwords.contains(password)){
			System.out.println("Account not found.\n");
		} else {
			System.out.println("Wrong username or password. \n");
		}
		return loggedIn;
	}
	/**
	 * Should take as input existing username and password
	 * If the input is correct logIn is true (successfull)
	 */
	
	public void logIn() {
		System.out.println("Please fill in your username and password details.\n");
		System.out.println("Username: ");
		username = sc.nextLine();
		System.out.println("Password: ");
		password = sc.nextLine();
		logInVerification();
	}
	
	/**
	 * Method for new account creation
	 * will create new account via username input and password input
	 * confirm String is input to check password identity
	 */
	protected String confirm; 
	
	public void createNewAccount() {
		System.out.println("To create account you need to enter your \nnew username and password.");

			//Username input
			System.out.println("Username: ");
			username = sc.nextLine().trim();
			
			//Password input, correctness check
			while (valid == false) {
				System.out.println("Password length must be at least 8 characters long \nmust contain at least one digit \nand cannot contain any special characters.");
				System.out.println("Password: ");
				password = sc.nextLine();
				passwordVerification();
			}
			
			//Password confirmation
			while (confirmed == false) {
				System.out.println("Confirm password: ");
				confirm = sc.nextLine();
				passwordConfirmation();
			}
			
			System.out.println("Account succesfully created and saved !\n");
	}
	
}









