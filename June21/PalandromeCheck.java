package June21;

import java.util.Scanner;

public class PalandromeCheck {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr=input();
		boolean b=ispal(arr,0,arr.length-1);
		System.out.println(b);
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
	public static boolean ispal(int[] arr,int fvidx,int lvidx)
	{
		if(fvidx>=arr.length/2)
		{
			return true;
		}
			
		if(arr[fvidx]==arr[lvidx])
		{
			return ispal(arr,fvidx+1,lvidx-1);
			
		}	 
		else
		{
			return false;
		}	
	}
}
