package assignment7_recursion;

import java.util.Scanner;

public class A7Q4_CheckPalindrome {

	public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			String s=scn.nextLine();
			boolean b=checkPal(s,0);
			System.out.println(b);

	}
	public static boolean checkPal(String s,int vidx)
	{
		if(vidx>s.length()/2)
			return true;
		
		if(s.charAt(vidx)!=s.charAt(s.length()-1-vidx))
			return false;
		else
			return checkPal(s,vidx+1);
	}
}
