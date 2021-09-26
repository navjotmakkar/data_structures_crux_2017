package assignment6_recursion;

import java.util.Scanner;

public class A6Q6 {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr=input();
		boolean b=CheckSorted(arr,arr.length-1);
		System.out.println(b);
	}
	public static int[] input() {
		int n=scn.nextInt();
		int[]rv=new int[n];
		for(int i=0;i<rv.length;i++)
		{
			rv[i]=scn.nextInt();
		}
		return rv;
	}
	public static boolean CheckSorted(int[] a,int vidx)
	{
		if(vidx==0)
		{
			return true;
		}
		
		boolean b=CheckSorted(a, vidx-1);
		if(b && a[vidx]>a[vidx-1])
				return true;
		else 
			return false;
	}
}
