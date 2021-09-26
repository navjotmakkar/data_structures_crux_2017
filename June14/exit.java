package June14;

public class exit {

	public static void main(String[] args) {
		int [][]a={{0,0,1,0},{1,0,0,0},{0,0,0,0},{1,0,1,0}};
		exitpoint(a);
	}
	public static void exitpoint(int [][]a)
	{
		int d=0,r=0,c=0;
		while(true)
		{
			d=(d+a[r][c])%4;
			
			if(d==0){				//east
				c++;
			if(c==a[0].length)
			{
				System.out.println(r+" , "+(c-1));
				break;
			}
			}
			else if(d==1){			//south
				r++;
			if(r==a.length)
			{
				System.out.println((r-1)+" , "+c);
				break;
			}
			}
			else if(d==2){			//west
				c--;
			if(c==-1)
			{
				System.out.println(r+" , "+(c+1));
				break;
			}
			}
			else if(d==3){			//north
				r--;
			if(r==-1)
			{
				System.out.println((r+1)+" , "+c);
				break;
			}
			}
		}
	}
}
