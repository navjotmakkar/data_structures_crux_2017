package ASSIGNMENT3_functions;

import java.util.Scanner;

public class A3Q18_ULI {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a no.: ");
		char c = scn.next(".").charAt(0);
		char val=check_uli(c);
		System.out.println(val);
	}
	public static char check_uli(char c)
	{
		int a=c;
		char b='I';
		if(a>=65 && a<=90)
			b='U';
		if(a>=97 && a<=122)
			b='L';
		return b;
	}
}
