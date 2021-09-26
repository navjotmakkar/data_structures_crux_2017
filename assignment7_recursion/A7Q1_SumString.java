package assignment7_recursion;

import java.util.Scanner;

public class A7Q1_SumString {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		String s=scn.nextLine();
		int sum=sumstr(s,0);
		System.out.println(sum);
	}
	public static int sumstr(String s,int vidx)
	{
		if(vidx==s.length())
			return 0;
		int sumf=sumstr(s,vidx+1);
		char ch=s.charAt(vidx);
		sumf=sumf+(int)ch-48;
		return sumf;
	}
}
