package assignment7_recursion;

import java.util.Scanner;

public class A7Q10_Twin {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String s1=scn.nextLine();
		int count=twin(s1,0);
		System.out.println(count);

	}
	public static int twin(String str, int vidx)
	{
		if(vidx==str.length()-2)
			return 0;
		
		int a;
		if(vidx<=str.length()-3 && str.charAt(vidx)==str.charAt(vidx+2) && str.charAt(vidx+1)!=str.charAt(vidx))
		{
			a=twin(str, vidx+1)+1;
		}
		else
			a=twin(str, vidx+1);
		return a;
	}
}
