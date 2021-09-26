import java.util.Scanner;

public class sum_odd_even_placed {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int i=1;
		int o=0;
		int e=0;
		int rem=0;
		while(n!=0)
		{
			rem=n%10;
			n=n/10;
			if(i%2==0)
				e=e+rem;
			else
				o=o+rem;
			i++;
		}
		System.out.println(o);
		System.out.println(e);

	}

}
