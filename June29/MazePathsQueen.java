package June29;

import java.util.ArrayList;

public class MazePathsQueen {

	public static void main(String[] args) {
		System.out.println(getMazePathsQueen(0,0,2,2) );

	}
	public static ArrayList<String> getMazePathsQueen(int cr, int cc, int ec, int er)
	{
		if(cc==ec && cr==er)
		{
			ArrayList<String> br= new ArrayList<>();
			br.add("\n");
			return br;
		}
		if(cc>ec || cr>er)
		{
			ArrayList<String> br= new ArrayList<>();
			return br;
		}
		
		ArrayList<String> mr=new ArrayList<>();
		for (int i = 1;  i <= ec; i++) {
			ArrayList<String> rrh = getMazePathsQueen(cr, cc + i, er, ec);
			for (String rs : rrh) {
				mr.add("H" + i + rs);
			}
		}
		for (int i = 1;  i <= er; i++) {
			ArrayList<String> rrv = getMazePathsQueen(cr+i, cc , er, ec);
			for (String rs : rrv) {
				mr.add("V" + i + rs);
			}
		}for 
			(int i = 1;  i <= er && i<=ec; i++) {
				ArrayList<String> rrd = getMazePathsQueen(cr+i, cc+i , er, ec);
				for (String rs : rrd) {
					mr.add("D" + i + rs);
				}
			}
		
		return mr;
	}
}
