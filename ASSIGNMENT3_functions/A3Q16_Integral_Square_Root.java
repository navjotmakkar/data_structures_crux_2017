package ASSIGNMENT3_functions;

import java.util.Scanner;

public class A3Q16_Integral_Square_Root {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a no.: ");
		int a=scn.nextInt();
		int val=sqrroot(a);
		System.out.println(val);
	}
	public static int sqrroot(int n)
	{
		int root=0;
		root=(int)Math.pow(n, 1.0/2);
		return root;
	}

}
