package ASSIGNMENT3_functions;

import java.util.Scanner;

public class A3Q6_CountDigits {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a no.: ");
		int num=scn.nextInt();
		System.out.println("Enter the digit to be counted: ");
		int dig=scn.nextInt();
		int n=count(num,dig);
		System.out.println(n);
	}
	public static int count(int n,int d)
	{
		int c=0;
		int temp=0;
		while(n!=0)
		{
			temp=n%10;
			n=n/10;
			if(temp==d)
			{
				c++;
			}
		}
		return c;
	}
}
