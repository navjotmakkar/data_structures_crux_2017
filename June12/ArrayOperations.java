package June12;

import java.util.Scanner;

public class ArrayOperations {
	public static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		//int[] arr=input();
		int[] arr={13,12,1,45,25,8};
		int m=max(arr);
		System.out.println(m);
		display(arr);
		int search=linearsearch(arr,25);
		System.out.println(search);
		display(arr);
		reverse(arr);
		display(arr);
		int []invarr={2,4,0,1,3};
		display(invarr);
		int []inverse=inverse(invarr);
		display(inverse);
		int []rotate=rotate(inverse);
		display(rotate);
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
	public static int max(int[] arr){
		
		int max=arr[0];
		for (int c=0;c<arr.length;c++)
		{
			if(max<arr[c])
				max=arr[c];
		}
		return max;
	}
	public static int linearsearch(int[] arr,int data){
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==data)
				return i;
		}
		return -1;
	}
	public static void reverse(int[] arr){
		int left=0;
		int right=arr.length-1;
		while(left<=right)
		{
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
	}
	public static int[] inverse(int[] arr){
		int[] rv=new int[5];
		int val=0;
		for(int i=0; i<arr.length;i++)
		{
			val=arr[i];
			rv[val]=i;
		}
		return rv;
	}
	public static int[] rotate(int[] arr){
		System.out.println("Enter the no. of rotation: ");
		int k=scn.nextInt();
		k=k%arr.length;
		if(k<0)
			k+=arr.length;
		int []rot=new int[arr.length];
		int ridx=0;
		for(int i=arr.length-k;i<arr.length;i++)
		{
			rot[ridx]=arr[i];
			ridx++;
		}
		for(int i=0;i<arr.length-k;i++)
		{
			rot[ridx]=arr[i];
			ridx++;
		}
		return rot;
	}
}
