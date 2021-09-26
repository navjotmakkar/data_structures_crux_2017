package assignment7_recursion;

import java.util.Scanner;

public class A7Q15_BracketsBal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1=scn.nextLine();
		System.out.println(IsBalanced(s1, ""));

	}
	public static boolean IsBalanced(String exp, String obsf){
		if(exp.length() == 0){
			if(obsf.length() != 0){
				return false; // more opening bracks
			}
			return true;
		}
		
		char ch = exp.charAt(0);
		String ros = exp.substring(1);
		
		if(ch == '(' || ch == '{' || ch == '['){
			return IsBalanced(ros, obsf + ch);
		} else if (ch == ')' || ch == '}' || ch == ']'){
			if(obsf.length() == 0){
				return false; // closing is more
			}
			
			char lob = obsf.charAt(obsf.length() - 1);
			if(ch == ')' && lob != '('){
				return false; // mismatach
			} else if(ch == '}' && lob != '{'){
				return false; // mismatach
			} else if(ch == ']' && lob != '['){
				return false; // mismatach
			}
			
			String robsf = obsf.substring(0, obsf.length() - 1);
			return IsBalanced(ros, robsf);
		} else {
			return IsBalanced(ros, obsf);
		}
		
	}

}
