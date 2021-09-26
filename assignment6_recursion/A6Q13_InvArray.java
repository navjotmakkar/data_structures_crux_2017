package assignment6_recursion;

import java.util.Scanner;

public class A6Q13_InvArray {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr=input();
		inverse(arr,0);
		display(arr);
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
	public static void inverse(int[] arr, int vidx)
	{
		if(vidx==arr.length)
			return;
		
		int temp=arr[vidx];
		inverse(arr,vidx+1);
		arr[temp]=vidx;
		return;
	}
	public static void display(int[] arr) {
		for(int val:arr)
		{
			System.out.print(val+"\t");
		}
		System.out.println();
	}
}
