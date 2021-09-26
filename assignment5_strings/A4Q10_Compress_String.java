 package assignment5_strings;

import java.util.Scanner;

public class A4Q10_Compress_String {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1=scn.nextLine();
		String s2=compress(s1);
		System.out.println(s2);
	}
	public static String compress(String s1)
	{
		char temp=s1.charAt(0);
		StringBuilder rs=new StringBuilder();
		rs.append(temp);
		int c=1;
		for(int i=1;i<s1.length();i++)
		{
			if(temp!=s1.charAt(i))
			{
				temp=s1.charAt(i);
				if(c>1)
					rs.append(c);

				rs.append(temp);
				c=1;
			}
			else
			{
				c++;
			}
		}
			if(c>1)
				rs.append(c);
		return rs.toString();
	}
}
