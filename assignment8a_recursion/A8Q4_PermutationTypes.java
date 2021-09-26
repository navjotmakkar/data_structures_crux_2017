package assignment8a_recursion;

import java.util.ArrayList;

public class A8Q4_PermutationTypes {

	public static void main(String[] args) {
		StringBuilder rs=new StringBuilder();
		System.out.println(permutation("abcd"));
		System.out.println(countperm("abcd"));
	}
	public static void printperm(String qst,String ans)
	{
		char ch=qst.charAt(0);
		String roq=qst.substring(1);
		for(int i=0;i<qst.length();i++)
			System.out.println(qst.charAt(arg0));
	}
	public static int countperm(String qst)
	{
		if(qst.length()==0)
		{
			return 1;
		}
		char ch=qst.charAt(0);
		String roq=qst.substring(1);
		int c=countperm(roq);
		return c*qst.length();
	}
	public static ArrayList<String> permutation(String s)
	{
		if(s.length()==0)
		{
			ArrayList<String> br=new ArrayList<>();
			br.add(s);
			return br;
		}
		char ch=s.charAt(0);
		String ros= s.substring(1);
	    ArrayList <String> rr=permutation(ros);
	    ArrayList <String> mr= new ArrayList<>();
	    for(String rs: rr)
	    {
	    	for(int i=0;i<=rs.length();i++)
	    	{
	    		mr.add(rs.substring(0,i)+ch+rs.substring(i));
	    	}
	    }
	    return mr;
	}

}
