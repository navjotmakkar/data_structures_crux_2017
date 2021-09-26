package assignment6_recursion;

import java.util.Scanner;

public class A6Q1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		printseq(n);

	}
	public static void printseq(int n)
	{
		if(n==0)
			return;
		if(n%2!=0)
			System.out.println(n);
		printseq(n-1);
		if(n%2==0)
			System.out.println(n);
	}
}
