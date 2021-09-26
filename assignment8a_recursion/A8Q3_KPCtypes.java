package assignment8a_recursion;

import java.util.ArrayList;

public class A8Q3_KPCtypes {

	public static void main(String[] args) {
		System.out.println(getKPC("108"));
		printKPC("108","");
		System.out.println(countKPC("108"));
	}
	public static int countKPC(String qst)
	{
		if(qst.length()==0)
		{
			return 1;
		}
		char ch=qst.charAt(0);
		String roq=qst.substring(1);
		String code = getCode(ch);
		int c=countKPC(roq);
		return c*code.length();
	}
	public static void printKPC(String qst,String ans)
	{
		if(qst.length()==0)
		{
			System.out.println(ans);
			return;
		}
		
		char ch=qst.charAt(0);
		String roq=qst.substring(1);
		String code = getCode(ch);
		for (int i = 0; i < code.length(); i++) {
			printKPC(roq,ans+code.charAt(i));
		}
		
	}
	public static ArrayList<String> getKPC(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rr = getKPC(ros);
		ArrayList<String> mr = new ArrayList<>();

		for (String rs : rr) {
			String code = getCode(ch);
			for (int i = 0; i < code.length(); i++) {
				String ms = code.charAt(i) + rs;
				mr.add(ms);
			}
		}

		return mr;
	}

	public static String getCode(char ch) {
		if (ch == '1') {
			return "abc";
		} else if (ch == '2') {
			return "def";
		} else if (ch == '3') {
			return "ghi";
		} else if (ch == '4') {
			return "jkl";
		} else if (ch == '5') {
			return "mno";
		} else if (ch == '6') {
			return "pqrs";
		} else if (ch == '7') {
			return "tuv";
		} else if (ch == '8') {
			return "wx";
		} else if (ch == '9') {
			return "yz";
		} else {
			return ".;";
		}
	}


}
