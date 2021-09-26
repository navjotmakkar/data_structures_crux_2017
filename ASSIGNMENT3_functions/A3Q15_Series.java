package ASSIGNMENT3_functions;

import java.util.Scanner;

public class A3Q15_Series {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a no.: ");
		int num1=scn.nextInt();
		System.out.println("Enter a no.: ");
		int num2=scn.nextInt();
		series(num1,num2);

	}
	public static void series(int n1,int n2)
	{
		int i=1;
		int c=1;
		while(i<=n1)
		{
			int n=(3*c)+2;
			if(n%n2!=0)
			{
				System.out.println(n);
				i++;
			}
			c++;
		}
	}

}
