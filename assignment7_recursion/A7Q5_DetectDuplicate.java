package assignment7_recursion;

import java.util.Scanner;

public class A7Q5_DetectDuplicate {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1=scn.nextLine();
		String s=duplicate(s1,1);
		System.out.println(s);
	}
	public static String duplicate(String str,int vidx)
	{
		if(vidx==str.length())
			return str.substring(str.length()-1);
		StringBuilder rs=new StringBuilder();
		rs.append(str.charAt(vidx-1));
		if(str.charAt(vidx)==str.charAt(vidx-1))
		{
			rs.append("*");
			
		}
		rs.append(duplicate(str,vidx+1));
		return rs.toString();
	}
}
