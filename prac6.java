package practice;

import java.util.Scanner;

public class prac6 {
	public static int SearchArr(int[] arr, int key)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(key==arr[i])
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter number of elements: ");
		int n=s.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter elements: ");
		for(int i=0; i<n; i++)
		{
			arr[i]=s.nextInt();
		}
		
		System.out.println("Enter keys: ");
		int key=s.nextInt();
		
		int search=SearchArr(arr,key);
		
		if(search==-1)
		{
			System.out.println("Not found");
		}
		else
		{
			System.out.println("Found at"+search);
		}
		
	}

}
