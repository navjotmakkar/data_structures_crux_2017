import java.util.Scanner;

public class nth_fibonnaci {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a no.: ");
		int n=scn.nextInt();
		int f0=0;
		int f1=1;
		int fn=0;
		String s=scn.nextLine()
				
		int i=0;
		if(n==0)
		{
			System.out.println("0");
			return;
		}
		i=2;
		while(i<=n)
		{
			fn=f0+f1;
			f0=f1;
			f1=fn;
			i++;
		}
		System.out.println(f1);

	}

}
