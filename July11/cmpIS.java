package July11;

import java.util.Arrays;

public class cmpIS {

	public static void main(String[] args) {
		
		System.out.println(cmpIS(2,2));
	}
	public static int cmpIS(int er, int ec)
	{
		int[] arr=new int[ec+1];
		Arrays.fill(arr, 1);
		
		for(int i=er-1;i>=0;i--)
		{
			for(int j=ec-1;j>=0;j--)
				arr[j]=arr[j]+arr[j+1];
		}
		
		//display
		for(int i=0;i<=ec;i++)
			System.out.println(arr[i]);
		return arr[0];
	}
}
