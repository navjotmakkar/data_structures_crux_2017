package June29;

public class SSwithASCII {

	public static void main(String[] args) {
		printSSwASCII("abc","");
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
