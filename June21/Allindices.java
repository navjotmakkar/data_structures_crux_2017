package June21;

import java.util.Scanner;

public class Allindices {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr=input();
		System.out.println("Enter the element: ");
		int d=scn.nextInt();
		int[] fi= allindices(arr,0,d,0);
		for(int val:fi)
		{
			System.out.print(val+"\t");
		}
		System.out.println();

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
	
	public static int[] allindices(int[] arr,int vidx,int data,int count)
	{
		if(vidx==arr.length)
		{
			int[] a=new int[count];
			return a;
		}
		if(arr[vidx]==data)
			count++;
		int ind[]=allindices(arr,vidx+1,data,count);
		if(arr[vidx]==data)
		{
			ind[count-1]=vidx;
		}
		return ind;
	}
}

