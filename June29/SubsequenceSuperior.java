package June29;

public class SubsequenceSuperior {

	public static void main(String[] args) {
		printSS("abc","");

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
