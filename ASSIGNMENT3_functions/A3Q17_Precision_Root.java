package ASSIGNMENT3_functions;

import java.util.Scanner;

public class A3Q17_Precision_Root {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a no.: ");
		double a=scn.nextDouble();
		System.out.println("Enter the precision: ");
		int p=scn.nextInt();
		double val=Math.sqrt(a);
		val=precision(val,p);
		System.out.println(val);
	}
	public static double precision(double n, int p)
	{
		double root=0;
		int pow=(int)Math.pow(10, p);
		n=n*pow;
		int i=(int)n;
		root=i;
		root=root/pow;
		return root;
	}

}
