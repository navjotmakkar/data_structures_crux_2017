package July1;

import java.util.Scanner;

public class nQueens {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size: ");
		int r=scn.nextInt();
		boolean board[][]=new boolean [r][r];
		printNQueens(board,0,"");
		
	}
	public static void printNQueens(boolean board[][],int row,String ans)
	{
		if(row==board.length)
		{
			System.out.println(ans);
			return;
		}
		for(int col=0;col<board.length;col++)
		{
			if(isItSafeForQueen(board,row,col))
			{
				board[row][col]=true;
				printNQueens(board,row+1,ans+"["+row+"-"+col+"]");
				board[row][col]=false;
			}
		}
	}
	public static boolean isItSafeForQueen(boolean[][] board,int row,int col)
	{
		for(int r=row-1;r>=0;r--)
		{
			if(board[r][col]==true)
				return false;
		}
		for(int ldr=row-1,ldc=col-1;ldr>=0 && ldc>=0;ldr--,ldc--)
		{
				if(board[ldr][ldc]==true)
					return false;
		}
		for(int rdr=row-1,rdc=col+1;rdr>=0 && rdc<board.length;rdr--,rdc++)
		{
				if(board[rdr][rdc]==true)
					return false;
		}
		return true;
	}
}
