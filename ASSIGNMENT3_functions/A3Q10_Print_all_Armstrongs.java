package ASSIGNMENT3_functions;

import java.util.Scanner;

public class A3Q10_Print_all_Armstrongs {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a no.: ");
		int num1=scn.nextInt();
		System.out.println("Enter a no.: ");
		int num2=scn.nextInt();
		armstrong(num1,num2);
	}
	public static void armstrong(int n1,int n2)
	{
		while(n1<=n2)
		{
			int temp=n1;
			int c=0;
			while(temp!=0)
			{
				temp=temp/10;
				c++;
			}
			int sum=0;
			temp=n1;
			while(temp!=0)
			{
				int a=temp%10;
				temp=temp/10;
				int pow=(int)Math.pow(a, c);
				sum+=pow;
			}
			if(sum==n1)
				System.out.println(n1);
			n1++;
		}
		
	}

}
