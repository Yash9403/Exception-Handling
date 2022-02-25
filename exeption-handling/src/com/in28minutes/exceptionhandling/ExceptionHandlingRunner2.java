package com.in28minutes.exceptionhandling;

public class ExceptionHandlingRunner2 {
	
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
		try {
		String str = null;
		str.length();
		System.out.println("Main 2 ended");
		}
		catch(Exception ex) {
//			ex.printStackTrace();
		}
	}
}
