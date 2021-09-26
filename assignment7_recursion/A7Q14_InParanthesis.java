package assignment7_recursion;

import java.util.Scanner;

public class A7Q14_InParanthesis {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1=scn.nextLine();
		StringBuilder rs=new StringBuilder();
		String s=getstr(s1,0,rs,0);
		System.out.println(s);
	}
	public static String getstr(String str, int vidx, StringBuilder rs,int c)
	{
		if(vidx==str.length()-1)
			return "";
		
		if(str.charAt(vidx)=='(')
			getstr(str,vidx+1,rs,1);
		else if(str.charAt(vidx)==')')
			return "";
		else if(c==1)
		{
			rs.append(str.charAt(vidx));
			getstr(str,vidx+1,rs,c);
		}
		else
			getstr(str,vidx+1,rs,c);
		return rs.toString();
	}

}
