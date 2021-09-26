import java.util.Scanner;

public class pattern3{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a odd no.: ");
		int n=scn.nextInt();
		int r=1;
		int nsp=n-1;
		int nst=1;
		int cst=0;
		int csp=0;
		int val=1;
		while(r<=(2*n)-1)
		{
			while(csp<nsp)
			{
				System.out.print(" ");
				csp++;
			}
			
			while(cst<nst)
			{
				System.out.print(val);
				if(cst<(nst/2))
					val++;
				else
					val--;
				cst++;
			}
			csp=0;
			cst=0;
			if(r<=n-1)
			{
				nsp=nsp-1;
				nst=nst+2;
			}
			else
			{
				nsp=nsp+1;
				nst=nst-2;
			}
			r=r+1;
			if(r<n)
				val=r;
			else
				val=(2*n-r);
			System.out.println();
		}
	}

}
