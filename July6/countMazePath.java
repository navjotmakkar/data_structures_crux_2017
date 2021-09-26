package July6;

public class countMazePath {

	public static void main(String[] args) {
		int[][] strg=new int[3][3];
		System.out.println(cmp(0, 0, 2, 2, strg));

	}
	public static int cmp(int cr, int cc, int er, int ec, int[][] strg )
	{
		if(cr==er && cc==ec)
			return 1;
		if(cr>er || cc>ec)
			return 0;
		if(strg[cr][cc]!=0)
			return strg[cr][cc];
		
		int ch=cmp(cr+1, cc, er, ec, strg);
		int cv=cmp(cr, cc+1, er, ec, strg);
		int count=ch+cv;
		strg[cr][cc]=count;
		return count;
	}
}
