package June23;

import java.util.ArrayList;

public class Permutation {

	public static void main(String[] args) {
		System.out.println(permutation("abc"));
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
