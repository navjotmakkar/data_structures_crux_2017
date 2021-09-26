package June19;

import java.util.Scanner;

public class insert_char_diff {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1=scn.nextLine();
		String s2=insert(s1);
		System.out.println(s2);

	}
	public static String insert(String s1)
	{
		StringBuilder rs=new StringBuilder();
		rs.append(s1.charAt(0));
		char temp=s1.charAt(0);
		for(int i=1;i<s1.length();i++)
		{
			int val=s1.charAt(i)-s1.charAt(i-1);
			temp=s1.charAt(i);
			rs.append(val);
			rs.append(temp);
		}
		
		return rs.toString();
	}
}
