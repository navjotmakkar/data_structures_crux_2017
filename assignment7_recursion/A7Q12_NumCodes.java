package assignment7_recursion;

public class A7Q12_NumCodes {

	public static void main(String[] args) {
		code("1023","");

	}
	public static void code(String qst, String ans){
		if(qst.length() == 0){
			System.out.println(ans);
			return;
		}
		
		String ch0 = qst.substring(0, 1);
		String ros0 = qst.substring(1);
		if(Integer.parseInt(ch0)!=0)
			code(ros0, ans + (char)(Integer.parseInt(ch0)+'a' - 1));
		else
			{	
			code(ros0,ans);
			return;
			}
		
		if(qst.length() >= 2){
			Integer ch01 = Integer.parseInt(qst.substring(0, 2));
			String ros01 = qst.substring(2);
			
			if(ch01 <= 26){
				code(ros01, ans + (char)('a' - 1 + ch01));
			}
		}
	}
	
}
