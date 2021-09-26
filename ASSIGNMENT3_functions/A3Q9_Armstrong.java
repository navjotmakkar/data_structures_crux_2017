package ASSIGNMENT3_functions;

import java.util.Scanner;

public class A3Q9_Armstrong {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a no.: ");
		int num=scn.nextInt();
		boolean bool=armstrong(num);
		System.out.println(bool);
	}
	public static boolean armstrong(int n)
	{
		int temp=n;
		int c=0;
		while(temp!=0)
		{
			temp=temp/10;
			c++;
		}
		int sum=0;
		temp=n;
		while(temp!=0)
		{
			int a=temp%10;
			temp=temp/10;
			int pow=(int)Math.pow(a, c);
			sum+=pow;
			
		}
		if(sum==n)
			return true;
		else
			return false;
		
	}

}
