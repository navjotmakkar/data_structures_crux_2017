package June21;

import java.util.Scanner;

public class DisplayReverse {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr=input();
		dispRev(arr,arr.length-1);
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
	public static void dispRev(int[] arr, int vidx)
	{
		if(vidx<0)
			return;
		System.out.print(arr[vidx]+"\t");
		dispRev(arr,vidx-1);
	}
}
