import java.util.Scanner;

public class pattern4_hb {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a no.: ");
		int n=scn.nextInt();
		int f0=0;
		int f1=1;
		int fn=0;
		int r=1;
		while(r<=n)
		{
			int c=1;
			while(c<=r)
			{
				System.out.print(fn+"\t");
				f0=f1;
				f1=fn;
				fn=f0+f1;
				c++;
			}
			System.out.println();
			r++;
		}
	}

}