package July4;

import java.util.Scanner;

public class MergeSort {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr=input();
		int[] sarr=mergeSort(arr,0,arr.length-1);
		display(sarr);
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
	public static int[] merge(int[] one, int[] two)
	{
		int[] result= new int[one.length +two.length];
		int i=0,j=0,k=0;
		while(i<one.length && j<two.length)
		{
			if(one[i]<two[j])
			{
				result[k]=one[i];
				i++;
				k++;
			}
			else
			{
				result[k]=two[j];
				j++;
				k++;
			}
		}
		while(i<one.length)
		{
			result[k]=one[i];
			i++;
			k++;
		}
		while(j<two.length)
		{
			result[k]=two[j];
			j++;
			k++;
		}
		return result;
	}
	public static int[] mergeSort(int[] arr,int lo,int hi)
	{
		if(lo==hi)
		{
			int[] br=new int[1];
			br[0]=arr[lo];
			return br;
		}
		
		int mid=(lo+hi)/2;
		int[] fhalf=mergeSort(arr,lo,mid);
		int[] shalf=mergeSort(arr,mid+1,hi);
		
		int[] sorted=merge(fhalf,shalf);
		return sorted;
	}
}
