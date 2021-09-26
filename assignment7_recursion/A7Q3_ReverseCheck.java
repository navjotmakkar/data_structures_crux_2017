package assignment7_recursion;

import java.util.Scanner;

public class A7Q3_ReverseCheck {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1=scn.nextLine();
		String s2=scn.nextLine();
		boolean b=checkrev(s1,s2,0);
		System.out.println(b);
	}
	public static boolean checkrev(String s1,String s2, int vidx)
	{
		if(vidx==s1.length())
			return true;
		
		if(s1.charAt(vidx)!=s2.charAt(s2.length()-1-vidx))
			return false;
		else
			return checkrev(s1,s2,vidx+1);
		
	}
}
