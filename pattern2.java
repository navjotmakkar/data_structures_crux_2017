import java.util.Scanner;

public class pattern2{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a odd no.: ");
		int n=scn.nextInt();
		int r=1;
		int a=(n/2)+1;
		int b=1;
		int count=0;
		while(r<=n)
		{
			while(count<a)
			{
				System.out.print(" ");
				count=count + 1;
			}
			count=0;
			while(count<b)
			{
				System.out.print("*");
				count=count+1;
			}
			count=0;
			while(count<a)
			{
				System.out.print(" ");
				count=count + 1;
			}
			count=0;
			System.out.print("\n");
			r=r+1;
			if(r<=(n/2)+1)
			{
				a=a-1;
				b=b+2;
			}
			else
			{
				a=a+1;
				b=b-2;
			}
				
		}
	}

}
