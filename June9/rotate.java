package June9;

import java.util.Scanner;

public class rotate {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a no.: ");
		int n=scn.nextInt();
		System.out.println("Enter a no.: ");
		int r=scn.nextInt();
		int val=n;
		int c=0;
		while(val!=0)
		{
			val=val/10;
			c++;
		}
		int i=0;
		if(r>=0)
		{
			i=r%c;
		}
		else
		{
			r=-r;
			i=r%c;
			i=c-i;
		}
		if(i==0)
		{
			System.out.println(n);
		}
		else
		{
			int pow=1;
			int powc=0;
			while(powc<c-1)
			{
				pow=pow*10;
				powc++;
			}
			while(i!=0)
			{
				int rem=0;
				rem=n%10;
				System.out.println("rem is "+rem);
				n=n/10;
				System.out.println("n is "+n);
				n=(rem*pow)+n;
				i--;
			}
			System.out.println(n);
		}

	}

}
