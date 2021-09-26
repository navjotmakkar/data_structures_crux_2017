package June14;

import java.util.Scanner;

public class shell_rotate {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int [][]a={{1,2,3,4,5,6},{11,12,13,14,15,16},{21,22,23,24,25,26},{31,32,33,34,35,36},{41,42,43,44,45,46},{51,52,53,54,55,56},{61,62,63,64,65,66}};
		System.out.println("Enter r and k: ");
		int r=scn.nextInt();
		int k=scn.nextInt();
		display(a);
		shell(a,k,r);
		display(a);
	}
	public static void shell(int[][] a,int k, int rot)
	{
		int cmin=k-1;
		int rmin=k-1;
		int cmax=a[0].length-k;
		int rmax=a.length-k;
		int r=rmin;
		int c=cmin;
		int t1=a[rmin][cmin];
		int counter=0;
		int dir=0;
		int j=0;
		while(j<r){
		while(counter<((cmax+1)*4)-2)
		{
			if(dir==0)
			{
				int t2=a[r+1][c];
				a[r+1][c]=t1;
				t1=t2;
				
				r++;
				if(r==rmax)
					dir++;
			}
			if(dir==1)
			{
				int t2=a[r][c+1];
				a[r][c+1]=t1;
				t1=t2;
				
				c++;
				if(c==cmax)
					dir++;
			}
			if(dir==2)
			{
				int t2=a[r-1][c];
				a[r-1][c]=t1;
				t1=t2;
				
				r++;
				if(r==rmin)
					dir++;
			}
			if(dir==3)
			{
				int t2=a[r][c-1];
				a[r][c-1]=t1;
				t1=t2;
				
				c++;
				if(r==rmin)
					dir++;
			}
			counter++;
		}
		}
	}
	public static void display(int[][] arr) {
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
				System.out.print(arr[i][j]+"\t");
			System.out.println();
		}
		System.out.println();
	}
}
