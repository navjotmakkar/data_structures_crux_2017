package assignment7_recursion;

import java.util.Scanner;

public class A7Q6_RemoveConsDuplicate {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1=scn.nextLine();
		StringBuilder rs=new StringBuilder();
		rs.append(s1.charAt(0));
		String s=compress(s1,1,rs);
		System.out.println(s);

	}
	public static String compress(String str,int vidx, StringBuilder rs)
	{
		if(vidx==str.length())
			return "";
		
		if(str.charAt(vidx)!=str.charAt(vidx-1))
		{
			char ch=str.charAt(vidx);
			rs.append(ch); 
		}
			
		compress(str,vidx+1,rs);
			
		return rs.toString();
	}
	
}
