package assignment6_recursion;

import java.util.Scanner;

public class A6Q4_PascalTriangle {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		printpastriangle(0,0,n,1);

	}
	public static void printpastriangle(int r,int c,int n,int num)
	{
		if(r>=n)
			return;
		if(c>r)
		{
			System.out.println();
			printpastriangle(r+1, 0, n,1);
			return;
		}
		System.out.print(num+"\t");
		num = num * (r - c) / (c + 1);
		printpastriangle(r, c+1, n,num);
	}

}
