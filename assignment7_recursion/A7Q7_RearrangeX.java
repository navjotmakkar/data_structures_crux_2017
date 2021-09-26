package assignment7_recursion;

import java.util.Scanner;

public class A7Q7_RearrangeX {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1=scn.nextLine();
		StringBuilder rs=new StringBuilder();
		String s=rearrange(s1,0,rs);
		System.out.println(s);

	}
	public static String rearrange(String str, int vidx, StringBuilder ans)
	{	if(vidx==str.length())
			return "";
	
		if(str.charAt(vidx)!='x')
			ans.append(str.charAt(vidx));
		rearrange(str, vidx+1, ans);
		if(str.charAt(vidx)=='x')
			ans.append('x');
		
		return ans.toString();
	}
}
