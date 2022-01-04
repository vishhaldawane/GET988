package com.lti;

public class ExceptionTest2 {
	public static void main(String[] args) {
		
		try
		{
			int num[]= {10,20,30};
			System.out.println("array : "+num[0]);
			System.out.println("array : "+num[1]);
			System.out.println("array : "+num[3]);
			
			String str="Larsen and Tubro Infotech";
			
			System.out.println("str : "+str.toLowerCase());
			System.out.println("str : "+str.toUpperCase());
			
			System.out.println("str 4th letter : "+str.charAt(13));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("exception : "+e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End main");
	}
}
