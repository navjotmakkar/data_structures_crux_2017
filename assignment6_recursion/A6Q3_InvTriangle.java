package assignment6_recursion;

import java.util.Scanner;

public class A6Q3_InvTriangle {

public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n=scn.nextInt();
	printinvtriangle(1,1,n);
	}
	public static void printinvtriangle(int row,int col,int num)
	{
		if(row>num)
		{
			return;
		}
		if(col>row)
		{
			printinvtriangle(row+1,1,num);
			System.out.println();
			return;
		}
		
		printinvtriangle(row,col+1,num);
		System.out.print("*");
	}

}
