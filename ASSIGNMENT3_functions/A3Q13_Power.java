package ASSIGNMENT3_functions;

import java.util.Scanner;

public class A3Q13_Power {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a no.: ");
		int a=scn.nextInt();
		System.out.println("Enter a no.: ");
		int b=scn.nextInt();
		int val=pow(a,b);
		System.out.println(val);
	}
	public static int pow(int a,int b)
	{
		int value=(int)Math.pow(a, b);
		return value;
	}
}
