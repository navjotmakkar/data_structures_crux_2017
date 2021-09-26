package June19;

import java.util.Scanner;

public class replace_with_ascii {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1=scn.nextLine();
		String s2=replace(s1);
		System.out.println(s2);

	}
	public static String replace(String s1)
	{
		StringBuilder rs=new StringBuilder();
		for(int i=0;i<s1.length();i++)
		{
			if(i%2==0)
			{
				char even=s1.charAt(i);
				even=(char)(even+1);
				rs.append(even);
			}
			else
			{
				char odd=s1.charAt(i);
				odd=(char)(odd-1);
				rs.append(odd);
			}
		}
		
		return rs.toString();
	}
}
