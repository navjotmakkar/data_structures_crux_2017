import java.util.Scanner;

public class pattern9_hb {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int r=1;
		while(r<=n)
		{
			int c=1;
			int i=1;
			while(c<=(2*n)-1)
			{
				if(i<=r)
					System.out.print(i+"\t");
				else
					System.out.print("\t");
				if(c<n)
					i++;
				if(c>=n)
					i--;
				c++;
				
			}
			System.out.println();
			r++;
		}

	}

}
