package assignment6_recursion;

import java.util.Scanner;

public class A6Q15_SelectionSort {

	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr=input();
		selection(arr,1,1);
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
	public static void display(int[] arr) {
		for(int val:arr)
		{
			System.out.print(val+"\t");
		}
		System.out.println();
	}
	public static void selection(int[] arr,int vidx,int c)
	{
		if(c==arr.length)
		{
			return;
		}
		if(vidx==arr.length)
		{
			selection(arr, c+1, c+1);
			return;
		}
		if(arr[c-1]>arr[vidx])
			swap(arr,c-1,vidx);
		selection(arr, vidx+1, c);
		
		
			
	}
	public static void swap(int[] arr,int i, int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
