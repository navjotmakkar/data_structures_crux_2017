package June29;


public class MazePathSuperior {

	public static void main(String[] args) {
		getMazePathsS(0,0,2,2," ");

	}
	public static void getMazePathsS(int cr, int cc, int er, int ec,String ans)
	{
		if(cc==ec && cr==er)
		{
			System.out.println(ans);
			return;
		}
		if(cc>ec|| cr>er)
		{
			return;
		}
		
		getMazePathsS(cr, cc+1, er, ec, ans+"H");
		getMazePathsS(cr+1, cc, er, ec, ans+"V");
	}
}
