import java.util.Scanner;

public class printprimebetween {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a no.: ");
		int n1=scn.nextInt();
		System.out.println("Enter a no.: ");
		int n2=scn.nextInt();
		while(n1<=n2)
		{
			int i=2;
			while(i<n1)
			{
				if(n1%i==0)
				{
					break;
				}
				else
				{
					i=i+1;
				}
				
			}
			if(i==n1)
				System.out.println(n1);
			n1=n1+1;
			
		}
	
	}

}
