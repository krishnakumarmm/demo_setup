package com.hcl.java.string;

import java.util.Scanner;

public class LoginUtilDemo {

	public LoginUtilDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginUtil loginObj = new LoginUtil();
		loginObj.loginCredentials();
	}

}
class LoginUtil {
	public void loginCredentials() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the login id ");
		String login = sc.next();
		System.out.println("Enter the password");
		String password = sc.next();
		String s1 = "abc@hcl.com";
		String s2 = "HCLtech@123";
		if(s1.equalsIgnoreCase(login)) {
			if(s2.equals(password)) {
				System.out.println("Welcome to HCl technologies");
			}
		}
		else
			System.out.println("Invalid login credentials");
	}
}