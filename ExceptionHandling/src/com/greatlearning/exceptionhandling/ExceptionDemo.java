package com.greatlearning.exceptionhandling;

public class ExceptionDemo {
	public static void main(String[] args) {
		
		try {
			int x = 10;
			int y = 0;
			
			int z = (x/y); //after this line
			System.out.println("Division result : " +z);
			//
			//
			
			int arr[] = {1,2,3};//index 0 to 2
			System.out.println("2nd element " +arr[1]);
			
			System.out.println("Nth element" + arr[3]);
			
		} catch (ArithmeticException ae) {
			//exception handler block
			//set default values
			ae.printStackTrace();
			//prompt user to input new values
			
			String name = "JC";
			//
			name = null;
			
			System.out.println(name.length());
		
		} 
		catch (Exception e) {
			e.printStackTrace();
			//System.out.println("Division result : 0 " );
		} 
		finally {
			//filehandle close
			//connection close
		}
		
		
		int a = 10;
		int b = 20;
		
		int c = a + b;
		System.out.println("Addition result : " + c);
		
	}
}
