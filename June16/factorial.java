package June16;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		int result=fact(n);
		System.out.println(result);
	}
	public static int fact(int n)
	{
		int rv;
		if(n==0)
			return 1;
		rv=n*fact(n-1);
		return rv;
	}
}
