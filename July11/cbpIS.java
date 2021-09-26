package July11;

public class cbpIS {

	public static void main(String[] args) {
		
		System.out.println(cbpIS(10));
	}
	public static int cbpIS(int n)
	{
		int[] arr=new int[6];
		arr[0]=1;
		for(int i=n-1;i>=0;i--)
		{
			int nv=arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+arr[5];
			for(int j=5;j>=1;j--)
				arr[j]=arr[j-1];
			arr[0]=nv;
		}
		
		//display
		for(int i=0;i<=5;i++)
			System.out.println(arr[i]);
		return arr[0];
	}
}
