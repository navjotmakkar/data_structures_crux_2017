package assignment7_recursion;

import java.util.Scanner;

public class A7Q8_hi {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1=scn.nextLine();
		StringBuilder rs=new StringBuilder();
		int count=counthi(s1,0);
		System.out.println(count);
		
		String s=removehi(s1,0,rs);
		System.out.println(s);
		
		StringBuilder rs2=new StringBuilder();
		String ss=replacehi(s1,0,rs2);
		System.out.println(ss);
	}
	public static int counthi(String str, int vidx)
	{
		if(vidx==str.length()-1)
			return 0;
		int a;
		if(str.substring(vidx, vidx+2).equals("hi"))
			a=counthi(str, vidx+1)+1;
		else
			a=counthi(str, vidx+1);
		return a;
	}
	public static String removehi(String str, int vidx, StringBuilder ans)
	{
		if(vidx==str.length())
			return "";
		if(vidx==str.length()-1)
		{
			ans.append(str.substring(vidx));
			return "";
		}

		if(str.substring(vidx, vidx+2).equals("hi"))
			removehi(str, vidx+2, ans);
		
		else
		{
			ans.append(str.charAt(vidx));
			removehi( str, vidx+1, ans);
		}
		return ans.toString();
	}
	public static String replacehi(String str, int vidx, StringBuilder ans)
	{
		if(vidx==str.length())
			return "";
		if(vidx==str.length()-1)
		{
			ans.append(str.substring(vidx));
			return "";
		}

		if(str.substring(vidx, vidx+2).equals("hi"))
		{
			ans.append("bye");
			replacehi(str, vidx+2, ans);
		}
		
		else
		{
			ans.append(str.charAt(vidx));
			replacehi( str, vidx+1, ans);
		}
		return ans.toString();
	}
}

