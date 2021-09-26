import java.util.Scanner;

public class pattern7_hb {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int r=1;
		int i=1;
		while(r<=n)
		{
			i=r;
			int c=1;
			while(c<=n+r-1)
			{
				if(c<=n-r)
					System.out.print("\t");
				else
				{
					System.out.print(i+"\t");
					if(c<n)
						i++;
					else
						i--;
				}
				c++;
			}
			System.out.println();
			r++;
		}
	}

}
