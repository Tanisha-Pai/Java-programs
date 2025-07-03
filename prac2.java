package practice;

import java.util.Scanner;

public class prac2 {
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int a = s.nextInt();
		System.out.println("Enter second number: ");
		int b = s.nextInt();
		int c=a+b;
		System.out.println("The addition is: "+c);
		s.close();
	}

}
