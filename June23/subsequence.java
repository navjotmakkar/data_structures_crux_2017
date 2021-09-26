package June23;

import java.util.ArrayList;

public class subsequence {

	public static void main(String[] args) {
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
		}

		return mr;
	}
}
