import java.util.Scanner;

public class GCD_LCM {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter dividend: ");
		int divd=scn.nextInt();
		System.out.println("Enter divisor: ");
		int divs=scn.nextInt();
		int rem=1;
		System.out.println("GCD of numbers is: ");
		while(rem!=0)
		{
			rem=divd%divs;
			divd=divs;
			divs=rem;
		}
		System.out.println(divd);
		System.out.println("Enter 2 nos: ");
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		int i=1;
		if(n1<n2)
			i=n1;
		else
			i=n2;
		int a=1,b=1;
		System.out.println("LCM of numbers is: ");
		while(n1>0 && n2>0)
		{
			a=i%n1;
			b=i%n2;
			if(a==0 && b==0)
			{
				System.out.println(i);
				return;
			}
			i++;
		}
	}

}
