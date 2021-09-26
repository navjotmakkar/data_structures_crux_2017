package June9;

import java.util.Scanner;

public class sb2db {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a no.: ");
		int n=scn.nextInt();
		System.out.println("Enter a source base: ");
		int sb=scn.nextInt();
		System.out.println("Enter a destination base: ");
		int db=scn.nextInt();
		System.out.println("after conversion: ");
		int rem=1;
		int dn=0;
		int pow=1;
		while(n!=0)
		{
			rem=n%10;
			n=n/10;
			dn=dn+(rem*pow);
			pow=sb*pow;
		}
		n=dn;
		dn=0;
		pow=1;
		while(n!=0)
		{
			rem=n%db;
			n=n/db;
			dn=dn+(rem*pow);
			pow=10*pow;
		}
		System.out.println(dn);

	}

}
