package July4;

import java.util.Scanner;

public class QuickSort {

	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr=input();
		quickSort(arr,0,arr.length-1);
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
	public static void quickSort(int[] arr,int lo, int hi)
	{
		if(lo>=hi)
			return;
		
		int left=lo,right=hi;
		int mid=(lo+hi)/2;
		int pivot=arr[mid];
		
		while(left<=right)
		{
			while(arr[left]<pivot)
				left++;
			while(arr[right]>pivot)
				right--;
			if(left<=right)
			{
				int temp=arr[right];
				arr[right]=arr[left];
				arr[left]=temp;
				left++;
				right++;
			}
		}
		quickSort(arr,lo,right);
		quickSort(arr, left, hi);
		
	}

}
