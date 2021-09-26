package July6;

public class countBoardPathBtr {

	public static void main(String[] args) {
		int[] arr=new int[11];
		int c=cbp(0,10,arr);
		System.out.println(c);

	}
	public static int cbp(int curr, int end, int[] strg)
	{
		if(curr==end)
			return 1;
		if(curr>end)
			return 0;
		if(strg[curr]!=0)
			return strg[curr];
		int count=0;
		for(int dice=1;dice<=6;dice++)
		{
			int cdice=cbp(curr+dice,end,strg);
			count+=cdice;
			strg[curr]=count;
		}
		return count;
	}
}
