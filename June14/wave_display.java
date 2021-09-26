package June14;

public class wave_display {

	public static void main(String[] args) {
		int [][]a={{1,2,3,4},{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
		wave(a);
	}
	public static void wave(int[][] a)
	{
		int row=0;
		int col=0;
		while(col>=0 && col<a[0].length)
		{
			if(col%2==0)
			{
				for(row=0;row<a.length;row++)
				{
					System.out.println(a[row][col]);
				}
				col++;
			}
			else
			{
				for(row=a.length-1;row>=0;row--)
				{
					System.out.println(a[row][col]);
				}
				col++;
			}
			
		}
	}

}
