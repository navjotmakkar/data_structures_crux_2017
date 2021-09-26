package assignment8a_recursion;

import java.util.ArrayList;

public class A8Q1_SStypes {

	public static void main(String[] args) {
		printSS("abcd","");
		int c=countSS("abcd");
		System.out.println(c);
		System.out.println(getSubsequences("abcd"));
	}
	public static ArrayList<String> getSubsequences(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rr = getSubsequences(ros);
		ArrayList<String> mr = new ArrayList<>();

		for (String rs : rr) {
			mr.add(rs); // ch says no
			mr.add(ch + rs); // ch says yes
		}

		return mr;
	}
	public static int countSS(String qst)
	{
		if(qst.length()==0)
		{
			return 1;
		}
		String roq=qst.substring(1);
		int c=countSS(roq);
		return c*2;
	}	
	public static void printSS(String qst,String ans)
	{
		if(qst.length()==0)
		{
			System.out.println(ans);
			return;
		}
		char ch=qst.charAt(0);
		String roq=qst.substring(1);
		printSS(roq,ans+"");
		printSS(roq,ans+ch);
	}
}


