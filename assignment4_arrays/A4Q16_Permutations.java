package assignment4_arrays;

import java.util.Scanner;

public class A4Q16_Permutations {
	public static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] arr=input();
		

	}
	public static int[] input() {
		System.out.println("Enter the size: ");
		int n=scn.nextInt();
		int[]rv=new int[n];
		for(int i=0;i<rv.length;i++)
		{
			System.out.println("Enter the value: ");
			rv[i]=scn.nextInt();
			
		}
		return rv;
	}
}
