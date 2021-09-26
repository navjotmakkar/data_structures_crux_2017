package July6;

import java.util.Scanner;

public class SubstrigPalindrome {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		String s1 = scn.nextLine();
		pal("nitin");
	}

	public static void pal(String str) {
		int c = 0;
		for (int axis = 0; axis < str.length(); axis++) {
			for (int orb = 0; (axis + orb) < str.length() && (axis - orb) >= 0; orb++) {
				if (str.charAt(axis - orb) == str.charAt(axis + orb)) {
					c++;
				} else
					break;
			}
		}

		for (double axis = 0.5; axis < str.length(); axis++) {
			for (double orb = 0.5; ((axis + orb) < str.length()) && ((axis - orb) >= 0); orb++) {
				if (str.charAt((int) (axis - orb)) == str.charAt((int) (axis + orb)))
					c++;
				else
					break;
			}
		}
		System.out.println(c);
	}
}
