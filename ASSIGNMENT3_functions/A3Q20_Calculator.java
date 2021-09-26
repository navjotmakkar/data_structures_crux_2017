package ASSIGNMENT3_functions;

import java.util.Scanner;

public class A3Q20_Calculator {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		while(true){
		char ch = scn.next(".").charAt(0);
		if(ch=='X'||ch=='x')
			return;
		else if(ch=='+')
		{
			int sum=add();
			System.out.println(sum);
		}
		else if(ch=='-')
		{
			int dif=sub();
			System.out.println(dif);
		}
		else if(ch=='*')
		{
			int product=multiply();
			System.out.println(product);
		}
		else if(ch=='/')
		{
			int quotient=divide();
			System.out.println(quotient);
		}
		else if(ch=='%')
		{
			int rem=mod();
			System.out.println(rem);
		}
		else
			System.out.println("Invalid operation. Try again.");
		}
	}
	public static int add()
	{
		System.out.println("Enter 2 nos.: ");
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		return n1+n2;
	}
	public static int sub()
	{
		System.out.println("Enter 2 nos.: ");
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		return n1-n2;
	}
	public static int multiply()
	{
		System.out.println("Enter 2 nos.: ");
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		return n1*n2;
	}
	public static int divide()
	{
		System.out.println("Enter 2 nos.: ");
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		return n1/n2;
	}
	public static int mod()
	{
		System.out.println("Enter 2 nos.: ");
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		return n1%n2;
	}
}
