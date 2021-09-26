package ASSIGNMENT3_functions;

import java.util.Scanner;

public class A3Q8_Mirror_Inverse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a no.: ");
		int n=scn.nextInt();
		int val=n;
		int c=0;
		while(val!=0)
		{
			val=val/10;
			c++;
		}
		int i=1;
		int rem=0;
		int num=0;
		int temp=n;
		while(i<=c)
		{
			rem=n%10;
			n=n/10;
			int pow=(int)Math.pow(10, rem-1);
			num=num+i*pow;
			i++;
		}
		boolean b=check(num,temp);
		System.out.println(b);
	}
	public static boolean check(int n, int t)
	{
		if(n==t)
			return true;
		else
			return false;
	}

}
