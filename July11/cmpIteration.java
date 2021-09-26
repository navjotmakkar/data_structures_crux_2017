package July11;

public class cmpIteration {

	public static void main(String[] args) {
		System.out.println(cmpI(3,3));

	}
	public static int cmpI(int er, int ec)
	{
		int[][] arr=new int[er+1][ec+1];
		for(int r=er;r>=0;r--)
		{
			for(int c=ec;c>=0;c--)
			{
				if(c==ec || r==er)
					arr[r][c]=1;
				else
					arr[r][c]=arr[r+1][c]+arr[r][c+1];
			}
		}
		for(int r=0;r<=er;r++)
		{
			System.out.println();
			for(int c=0;c<=ec;c++)
			{
				System.out.print(arr[r][c]);
			}
			
		}
		System.out.println();
		return arr[0][0];
	}
}
