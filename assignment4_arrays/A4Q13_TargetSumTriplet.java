package assignment4_arrays;

import java.util.Scanner;

public class A4Q13_TargetSumTriplet {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr=input();
		System.out.println("Enter the sum target");
		int targ=scn.nextInt();
		sumtarget(arr,targ);
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
	public static void sumtarget(int[]a,int t)
	{
		for(int i=0;i<a.length-2;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					if(a[i]+a[j]+a[k]==t)
						System.out.println(a[i]+","+a[j]+","+a[k]);
				}
			}
		}
	}

}
