package assignment6_recursion;

import java.util.Scanner;

public class A6Q14_BubbleSort {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr=input();
		bubble(arr,0,arr.length-1);
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
	public static void bubble(int[] arr,int vidx,int c)
	{
		if(c==0)
		{
			return;
		}
		if(vidx==c)
		{
			bubble(arr, 0, c-1);
			return;
		}
		
		if(arr[vidx]>arr[vidx+1])
		{
			swap(arr,vidx,vidx+1);
		}
		bubble(arr,vidx+1,c);
		
			
	}
	public static void swap(int[] arr,int i, int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
