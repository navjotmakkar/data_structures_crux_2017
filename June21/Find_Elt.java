package June21;

import java.util.Scanner;

public class Find_Elt {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int arr[]=input();
		System.out.println("Enter the data to be find: ");
		int d=scn.nextInt();
		boolean b=find(arr,0,d);
		System.out.println(b);
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
	public static boolean find(int[] arr,int vidx,int data)
	{
		boolean bb;
		if(vidx==arr.length)
		{
			bb=false;
			return bb;
		}
		if(arr[vidx]==data)
		{
			bb=true;
			return bb;
		}
		 bb=find(arr,vidx+1,data);
		 return bb;
	}
}
