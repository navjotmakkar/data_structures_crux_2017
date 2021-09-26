import java.util.Scanner;

public class fibonnaci_between {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a no.: ");
		int n=scn.nextInt();
		int f0=0;
		int f1=1;
		int fn=0;
		while(fn<=n)
		{
			System.out.println(fn); 
			f0=f1;
			f1=fn;
			fn=f0+f1;
		}
	}

}
