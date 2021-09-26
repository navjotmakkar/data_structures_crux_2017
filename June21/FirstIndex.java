package June21;

import java.util.Scanner;

public class FirstIndex {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr=input();
		System.out.println("Enter the element: ");
		int d=scn.nextInt();
		int fi= firstindex(arr,0,d);
		System.out.println(fi);
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
	public static int firstindex(int[] arr,int vidx,int data)
	{
		if(vidx==arr.length-1)
			return -1;
		if(arr[vidx]==data)
		{
			return vidx;
		}
		int fi=firstindex(arr,vidx+1,data);
		return fi;
	}
}
