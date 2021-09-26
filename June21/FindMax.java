package June21;

import java.util.Scanner;

public class FindMax {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr=input();
		int max=findmax(arr,0);
		System.out.println(max);
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
	public static int findmax(int[] arr,int vidx)
	{
		if(vidx==arr.length-1)
			return arr[vidx];
		int m=findmax(arr,vidx+1);
		if(arr[vidx]>m)
		{
			m=arr[vidx];
		}
		
		return m;
	}
}
