package June9;

import java.util.Scanner;

public class b2d {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a binary no.: ");
		int n=scn.nextInt();
		System.out.println("Its decimal form is: ");
		int rem=1;
		int dec=0;
		int pow=1;
		while(n!=0)
		{
			rem=n%10;
			n=n/10;
			dec=dec+(rem*pow);
			pow=2*pow;
		}
		System.out.println(dec);

	}

}
