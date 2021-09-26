package June29;

import java.io.CharArrayReader;
import java.util.ArrayList;

public class PermutationSuperior {

	public static void main(String[] args)
    {
       printPermutations("abc", "");
    }
	public static void printPermutations(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		boolean[] dupli = new boolean[256];

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String roq = ques.substring(0, i) + ques.substring(i + 1);

			if (dupli[ch] == false) {
				printPermutations(roq, ans + ch);
				dupli[ch] = true;
			}
		}
	}
}
  