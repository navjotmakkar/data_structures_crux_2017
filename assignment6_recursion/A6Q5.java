package assignment6_recursion;

import java.util.Scanner;

public class A6Q5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int val=findtriangle(n);
		System.out.println(val);
	}
	public static int findtriangle(int n)
	{
		if(n==1)
			return 1;
		
		n=n+findtriangle(n-1);

		return n;
	}
}
