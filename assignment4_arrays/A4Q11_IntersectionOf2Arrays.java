package assignment4_arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class A4Q11_IntersectionOf2Arrays {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size: ");
		int n=scn.nextInt();
		int[] arr1=input(n);
		int[] arr2=input(n);
		insertion(arr1);
	    insertion(arr2);
	    ArrayList result = new ArrayList<>();
	    result=intersection(arr1,arr2,n);
	    System.out.println(result);

	}
	public static int[] input(int n) {
		int[]rv=new int[n];
		System.out.println("Enter the value: ");
		for(int i=0;i<rv.length;i++)
		{
			rv[i]=scn.nextInt();
		}
		return rv;
	}
	public static void insertion(int[] arr)
	{
		int c=1;
		while(c<=arr.length-1)
		{
			for(int i=c;i>0;i--)
			{
				if(arr[i-1]>arr[i])
					swap(arr,i-1,i);
				else
					break;
			}
			c++;
		}
		
	}
	public static void swap(int[] arr,int i, int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static ArrayList<Integer> intersection(int[] arr1, int[] arr2, int n)
	{
		ArrayList result = new ArrayList<>();
		int i =0 ;
	    int j =0;
	    while(i< arr1.length && j<arr2.length){
	    if (arr1[i]>arr2[j]){
	        j++;

	    }else if (arr1[i]<arr2[j]){
	        i++;

	    }else {
	        result.add(arr1[i]);
	        i++;
	        j++;
	    }
	    }
		return result;
	}
}
