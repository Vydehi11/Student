package com.socialSite.Signup;

import java.util.Scanner;

public class TestSignup {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Signup s=new Signup();
		
		//Checking name
		System.out.print("Enter Name: ");
		String name1=sc.nextLine();
		String name=s.name(name1);
		if(name.equals("John")) {
			System.out.println("TestCase passed");
		}
		else {
			System.out.println("TestCase Failed");
		}
		
		//Checking surename
		System.out.print("Enter Sure Name: ");
		String surename1=sc.nextLine();
		String surename=s.name(surename1);
		if(surename.equals("Smith")) {
			System.out.println("TestCase passed");
		}
		else {
			System.out.println("TestCase Failed");
		}
		
		//Checking Data of Birth
		System.out.print("Enter Date of Birth: ");
		String dob1=sc.nextLine();
		String dob=s.dob(dob1);
		if(dob.equals("2022/10/10")) {
			System.out.println("TestCase passed");
		}
		else {
			System.out.println("TestCase Failed");
		}
		
		//Checking mobile Number
		System.out.print("Enter Mobile Number: ");
		long mobile=sc.nextLong();
		long mobileno=s.mobile(mobile);
		if(mobileno==7979799979l) {
			System.out.println("TestCase passed");
		}
		else {
			System.out.println("TestCase Failed");
		}
		
		//Checking password
		System.out.print("Enter Password: ");
		String pwd=sc.nextLine();
		String pwd1=s.password(pwd);
		if(pwd1.equals("abc12346")) {
			System.out.println("TestCase passed");
		}
		else {
			System.out.println("TestCase Failed");
		}
		
		
		
		
		
	}

}