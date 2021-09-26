package June19;

import java.util.Scanner;

public class count_palondromic_substrings {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1=scn.nextLine();
		int c = count_palandrome(s1);
		System.out.println(c);

	}

	public static int count_palandrome(String s1) {
		int c = 0;
		for (int i = 0; i < s1.length(); i++) {
			for (int j = i + 1; j <= s1.length(); j++) {
				String s2 = s1.substring(i, j);
				
				boolean b=palandromic(s2);
				if (b) {
					c++;
					System.out.println(s2);
				}

			}
		}
		return c;
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
