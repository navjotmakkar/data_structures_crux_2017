import java.util.Scanner;

public class printprime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a no.: ");
		int n=scn.nextInt();
		int i=2;
		if(n<2)
		{
			System.out.println("Prime");
			return;
		}
		while(i<n)
		{
			if(n%i!=0)
			{
				i++;
			}
			else
			{
				System.out.println("not prime");
				return;
			}
			
		}
		System.out.println("prime");

	}

}
