package assignment8a_recursion;

import java.util.ArrayList;

public class A8Q2_SSasciiTypes {
	public static void main(String[] args) {
		printSSwASCII("abc","");
		System.out.println(countSS("abc"));
		System.out.println(getSubsequences("abc"));
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
			mr.add((int)ch+rs);//ch says ascii
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
		return c*3;
	}	
	public static void printSSwASCII(String qst,String ans)
	{
		if(qst.length()==0)
		{
			System.out.println(ans);
			return;
		}
		char ch=qst.charAt(0);
		String roq=qst.substring(1);
		printSSwASCII(roq,ans+"");
		printSSwASCII(roq,ans+ch);
		printSSwASCII(roq,ans+(int)ch);
	}
}
