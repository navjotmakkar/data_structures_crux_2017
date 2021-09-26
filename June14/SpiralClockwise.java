package June14;

import java.util.Scanner;

public class SpiralClockwise {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
		 int row=scn.nextInt();
		 int col=scn.nextInt();
		 int a[][]=new int[row][col];
	     for(int r=0;r<row;r++){
	    	 for(int c=0;c<col;c++){
	    		 a[r][c]=scn.nextInt();
	         }
	     }
		spiral(a);
		System.out.print("END");
	}

	public static void spiral(int[][] a) {
		int cmin = 0, rmin = 0, cmax = a[0].length - 1, rmax = a.length - 1, counter = 0,n=a.length * a[0].length;
		while (counter < n) {
			//top
			for(int c=cmin;counter<n && c<=cmax;c++)
			{
				System.out.print(a[rmin][c]+", ");
				counter++;
			}
			rmin++;
			//right
			for(int r=rmin;counter<n && r<=rmax;r++)
			{
				System.out.print(a[r][cmax]+", ");
				counter++;
			}
			cmax--;
			//bottom
			for(int c=cmax;counter<n && c>=cmin;c--)
			{
				System.out.print(a[rmax][c]+", ");
				counter++;
			}
			rmax--;
			//left
			for(int r=rmax;counter<n && r>=rmin;r--)
			{
				System.out.print(a[r][cmin]+", ");
				counter++;
			}
			cmin++;
		}
	}

}
