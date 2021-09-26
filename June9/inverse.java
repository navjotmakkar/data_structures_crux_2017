package June9;

import java.util.Scanner;

public class inverse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a no.: ");
		int n=scn.nextInt();
		int val=n;
		int c=0;
		while(val!=0)
		{
			val=val/10;
			c++;
		}
		int i=1;
		int rem=0;
		int num=0;
		while(i<=c)
		{
			rem=n%10;
			n=n/10;
			int pow=(int)Math.pow(10, rem-1);
			num=num+i*pow;
			i++;
		}
		System.out.println(num);
	}

}
