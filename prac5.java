package practice;

import java.util.Scanner;

public class prac5 {
	public static boolean isPalindrome(String str)
	{
		int left=0;
		int right=str.length()-1;
		
		while(left<right)
		{
			if(str.charAt(left)!=str.charAt(right))
			{
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string: ");
		String input=s.nextLine();
		
		if(isPalindrome(input))
		{
			System.out.println("Is palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}
}
