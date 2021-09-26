package ASSIGNMENT3_functions;

import java.util.Scanner;

public class A3Q19_Valid_Invalid_Sequence {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		boolean b=false;
		int i=1;
		int c=0;
		int n1=scn.nextInt();
		while(i<n)
		{
			int n2=scn.nextInt();
			if(c==0)
			{
				if(n2>n1)
					c++;
			}
			else
			{
				if(n2<n1)
					c++;
			}
			n1=n2;
			i++;
				
		}
		if(c<=1)
			b=true;
		System.out.println(b);

	}

}

