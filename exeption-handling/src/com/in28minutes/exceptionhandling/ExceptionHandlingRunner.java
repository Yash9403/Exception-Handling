package com.in28minutes.exceptionhandling;

public class ExceptionHandlingRunner {
	
	public static void main(String[] args) {
		main1();
		System.out.println("Main ended");
	}
	
	public static void main1()
	{
		main2();
		System.out.println("Main 1 ended");
	}
	
	public static void main2()
	{
		String str = null;
		str.length();
		System.out.println("Main 2 ended");
	}
	
}
