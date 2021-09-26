package assignment5_strings;

import java.util.Scanner;

public class A5Q9_RemoveConsecutiveDuplicate {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1=scn.nextLine();
		String s2=remove_duplicate(s1);
		System.out.println(s2);
	}
	public static String remove_duplicate(String s1)
	{
		char temp=s1.charAt(0);
		StringBuilder rs=new StringBuilder();
		rs.append(temp);
		for(int i=1;i<s1.length();i++)
		{
			if(temp!=s1.charAt(i))
			{
				temp=s1.charAt(i);
				rs.append(temp);	
			}
		}
		return rs.toString();
	}
}
