package practice;

import java.util.Scanner;

public class prac4 {
	public static void main(String[] args)
	{
		int fact=1;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int a=s.nextInt();
		
		for(int i=a; i>1; i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is: "+fact);
		s.close();
		
	}

}
