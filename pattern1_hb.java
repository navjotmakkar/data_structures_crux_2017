import java.util.Scanner;

public class pattern1_hb {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int r=1;
		int i=1;
		while(r<=n)
		{
			int c=1;	
			while(c<=r)
			{
				System.out.print(i+"\t");
				i++;
				c++;
			}
			System.out.println();
			r++;
		}
	}

}
