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
//		String str = null;
//		str.length();
		int[] i = {1,2};
		int number = i[3];
		System.out.println("Main 2 ended");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(NullPointerException ex) {
			ex.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
