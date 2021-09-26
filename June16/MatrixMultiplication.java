package June16;

import java.util.Scanner;

public class MatrixMultiplication {
public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
		 int[][] m1=input();
		 int[][] m2=input();
		 if(m1[0].length!=m2.length)
			{
				System.out.println("Coloums of first matrix dont match with rows of second matrix");
				return;
			}
		 int[][] product=multiply(m1,m2);
		 for(int r=0;r<product.length;r++)
		 {
	    	 for(int c=0;c<product[0].length;c++)
	    	 {
	    		 System.out.print(product[r][c]+"\t");
	         }
	    	 System.out.println();
	     }
	     
	}
	public static int[][] input()
	{
		 System.out.println("Enter no. of rows and coloumns for Matrix: ");
		 int row=scn.nextInt();
		 int col=scn.nextInt();
		 int a[][]=new int[row][col];
	     for(int r=0;r<row;r++){
	    	 for(int c=0;c<col;c++){
	    		 a[r][c]=scn.nextInt();
	         }
	     }
	     return a;
	}
	public static int[][] multiply(int[][] m1, int[][] m2)
	{
		int sum=0;
		int p[][]=new int[m1.length][m2[0].length];
		for(int i=0;i<m1.length;i++)
		{
			for(int j=0;j<m2[0].length;j++)
			{
				for(int k=0;k<m2.length;k++)
				{
					sum=sum+m1[i][k]*m2[k][j];
				}
				p[i][j]=sum;
				sum=0;
			}
		}
		return p;
	}
}
