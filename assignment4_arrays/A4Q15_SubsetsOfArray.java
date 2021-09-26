package assignment4_arrays;

import java.util.Scanner;

public class A4Q15_SubsetsOfArray {
	public static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the size: ");
		int n=scn.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the value: ");
			arr[i]=scn.nextInt();
			
		}
		
		int limit = (int)Math.pow(2, n);
		int counter = 0;
		
		while(counter < limit){
			int temp = counter;
			
			System.out.print("[");
			for(int i = 0; i < arr.length; i++){
				int rem = temp % 2;
				
				if(rem == 1){
					System.out.print(arr[i] + " ");
				}
				
				temp = temp / 2;
			}
			System.out.println("]");
			
			counter++;
		}
	}
}
