package practice;

import java.util.Scanner;

public class prac3 {
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number: ");
	int num=s.nextInt();
	
	if(num % 2==0)
			{
		System.out.println("Even");
			}
	else
	{
		System.out.println("Odd");
	}
	s.close();		
}
}
