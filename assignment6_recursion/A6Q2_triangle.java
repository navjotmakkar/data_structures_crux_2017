package assignment6_recursion;

import java.util.Scanner;

public class A6Q2_triangle {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		printtriangle(1,1,n);

	}
	public static void printtriangle(int r,int c,int num)
	{
		if(r>num)
			return;
		if(c>r)
		{
			System.out.println();
			printtriangle(r+1, 1, num);
			return;
		}
		
		System.out.print("*");
		printtriangle(r, c+1, num);
	}
}
