package June19;

import java.util.Scanner;

public class is_palandrome {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1=scn.nextLine();
		boolean b=palandromic(s1);
		System.out.println(b);
	}
	public static boolean palandromic(String s1)
	{
			for(int i=0;i<=s1.length()/2;i++)
			{
				if(s1.charAt(i)!=s1.charAt(s1.length()-i-1))
					return false;
			}
		return true;
	}
}
