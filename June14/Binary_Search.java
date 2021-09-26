package June14;

import java.util.Scanner;

public class Binary_Search {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr=input();
		System.out.println("Enter the value to be find: ");
		int data=scn.nextInt();
		System.out.println(binary_search(arr,data));
		
	}
	public static int[] input() {
		System.out.println("Enter the size: ");
		int n=scn.nextInt();
		int[]rv=new int[n];
		for(int i=0;i<rv.length;i++)
		{
			rv[i]=scn.nextInt();
		}
		return rv;
	}
	public static int binary_search(int[] arr, int data)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==data)
			return mid;
			else if(arr[mid]<data)
				low=mid+1;
			else if(arr[mid]>data)
				high=mid-1;
		}
		return -1;
	}
}
	
