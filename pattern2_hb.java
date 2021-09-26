import java.util.Scanner;

public class pattern2_hb {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int r=1;
		while(r<=n)
		{
			int i=1;
			while(i<=r)
			{
				if(i==1 || i==r)
					System.out.print(r+"\t");
				else
					System.out.print("0\t");
				i++;
			}
			System.out.println();
			r++;
		}

	}

}
