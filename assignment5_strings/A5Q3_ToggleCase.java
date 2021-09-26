package assignment5_strings;

import java.util.Scanner;

public class A5Q3_ToggleCase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1=scn.nextLine();
		String ts = toggle(s1);
		System.out.println(ts);
	}
	public static String toggle(String s)
	{
		StringBuilder rs=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch<='Z' && ch>='A')
				ch=(char)(ch-'A'+'a');
			else
				ch=(char)(ch-'a'+'A');
			rs.append(ch);
		}
		return rs.toString();
	}
}
