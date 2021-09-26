package June9;

import java.util.Scanner;

public class d2b {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a no.: ");
		int n=scn.nextInt();
		System.out.println("Its binary form is: ");
		int rem=1;
		int bin=0;
		int pow=1;
		while(n!=0)
		{
			rem=n%2;
			n=n/2;
			bin=bin+(rem*pow);
			pow=10*pow;
		}
		System.out.println(bin);
	}
}
