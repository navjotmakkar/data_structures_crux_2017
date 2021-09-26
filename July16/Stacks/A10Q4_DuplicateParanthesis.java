package July16.Stacks;

import java.util.Scanner;

public class A10Q4_DuplicateParanthesis {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		String s1=scn.nextLine();
		System.out.println(DupParanthesis(s1));
	}
	public static boolean DupParanthesis(String str) throws Exception
	{
		StackClass s1=new DynamicStack();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='(')
				s1.push(ch);
			else if(ch==')' && s1.isempty())
				return false;
			else if(ch==')')
				s1.pop();
				
		}
		return s1.isempty();
	}
}
