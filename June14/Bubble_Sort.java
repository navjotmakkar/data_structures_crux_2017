package June14;

import java.util.Scanner;

public class Bubble_Sort {
	public static void main(String[] args) {
		int []arr={20,5,6,85,12,45};
		display(arr);
		bubble(arr);
		display(arr);

	}
	public static void display(int[] arr) {
		for(int val:arr)
		{
			System.out.print(val+"\t");
		}
		System.out.println();
	}
	public static int[] bubble(int[] arr)
	{
		int c=1;
		while(c<=arr.length-1)
		{
			for(int i=0;i<arr.length-c;i++)
			{
				if(arr[i]>arr[i+1])
					swap(arr,i,i+1);
			}
			c++;
		}
		return arr;
	}
	public static void swap(int[] arr,int i, int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
