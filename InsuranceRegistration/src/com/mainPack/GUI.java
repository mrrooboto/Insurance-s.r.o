package com.mainPack;

public class GUI {
	
	public void welcomeAndLogin() {
	System.out.println("""
			Welcome to the Insurance s.r.o
			What would you like to do ?
			------------------------------
			1. Login.
			2. Create a new account.
			""");	
	}
	
	public void welcomeAndOptions() {
		System.out.println("""
				Welcome to the Insurance s.r.o
				What would you like to do ?
				------------------------------
				1. See the insurance packages.
				2. See your existing insurance package.
				3. Select new insurance package.	
				4. Delete account.
				5. Exit.
				""");
	}

}
