import java.util.Scanner;

public class pascal_hb {

	public static void main(String[] args) {
		int r, i, num=1, j;
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter Number of Rows : ");
		r=scn.nextInt();
		
		for(i=0;i<r;i++)
		{
            num = 1;
			for(j=0;j<=i;j++)
			{
				 System.out.print(num+ "\t");
                 num = num * (i - j) / (j + 1);
			}
			System.out.println();
		}

	}

}
