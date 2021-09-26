package June21;

public class InvertedTriangle {

	public static void main(String[] args) {
		
		printInvTriangle(1,1,5);
	}
	public static void printInvTriangle(int row,int col,int n)
	{
		if(row>n)
			return;
		if(col>row)
		{
			printInvTriangle(row+1,1,n);
			System.out.println();
			return;
		}
		
		printInvTriangle(row,col+1,n);
		System.out.print("*");
	}

}
