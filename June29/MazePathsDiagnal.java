package June29;

import java.util.ArrayList;

public class MazePathsDiagnal {

	public static void main(String[] args) {
		System.out.println(getMazePathsD(0,0,2,2));

	}
	public static ArrayList<String> getMazePathsD(int cr, int cc, int er, int ec)
	{
		if(cc==ec && cr==er)
		{
			ArrayList<String> br= new ArrayList<>();
			br.add("\n");
			return br;
		}
		if(cc>ec|| cr>er)
		{
			ArrayList<String> br= new ArrayList<>();
			return br;
		}
		
		ArrayList<String> mr= new ArrayList<>();
		
			ArrayList<String> rrh=getMazePathsD(cr,cc+1,er,ec);
			for(String rs: rrh)
			{
				mr.add("H"+rs);
			}

			ArrayList<String> rrv=getMazePathsD(cr+1,cc,er,ec);
			for(String rs: rrv)
			{
				mr.add("V"+rs);
			}

		if(cr==cc || cr+cc==ec)
		{
			ArrayList<String> rrd=getMazePathsD(cr+1,cc+1,er,ec);
			for(String rs: rrd)
			{
				mr.add("D"+rs);
			}
		}
		return mr;
	}

}
