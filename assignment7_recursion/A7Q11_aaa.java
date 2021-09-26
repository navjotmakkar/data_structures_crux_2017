package assignment7_recursion;

import java.util.Scanner;

public class A7Q11_aaa {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1=scn.nextLine();
		int count=triplet(s1,0);
		System.out.println(count);
		count=tripletnr(s1,0);
		System.out.println(count);
	}
	public static int triplet(String str, int vidx)
	{
		if(vidx==str.length()-2)
			return 0;
		
		int a;
		if(vidx<=str.length()-3 && str.substring(vidx, vidx+3).equals("aaa"))
		{
			a=triplet(str, vidx+1)+1;
		}
		else
			a=triplet(str, vidx+1);
		return a;
	}
	public static int tripletnr(String str, int vidx)
	{
		if(vidx>=str.length()-2)
			return 0;
		int a;
		if(vidx<=str.length()-3 && str.substring(vidx, vidx+3).equals("aaa"))
				a=tripletnr(str, vidx+3)+1;
		else
				a=tripletnr(str, vidx+1);
		return a;
	}
}
