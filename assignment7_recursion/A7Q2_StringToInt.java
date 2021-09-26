package assignment7_recursion;

import java.util.Scanner;

public class A7Q2_StringToInt {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String s=scn.nextLine();
		int num=convert(s,s.length()-1);
		System.out.println(num);
	}
	public static int convert(String s,int vidx)
	{
		if(vidx<0)
			return 0;
		
		int rv=convert(s,vidx-1);
		int n=s.charAt(s.length()-1-vidx)-48;
		rv=rv+n*((int)Math.pow(10, vidx));
		
		return rv;
	}
}
