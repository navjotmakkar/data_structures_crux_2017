package June21;

import java.util.Scanner;

public class LastIndex {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		int[] arr=input();
		System.out.println("Enter the element: ");
		int d=scn.nextInt();
		int li= lastindex(arr,arr.length-1,d);
		System.out.println(li);
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
	public static int lastindex(int[] arr,int vidx,int data)
	{
		if(arr[vidx]==data)
		{
			return vidx;
		}
		if(vidx==0)
			return -1;
		int li=lastindex(arr,vidx-1,data);
		return li;
	}
}
