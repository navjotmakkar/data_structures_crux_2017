package July11;

import java.util.Arrays;

public class cbpIT {

	public static void main(String[] args) {
		System.out.println(cbpi(10));
	}
	public static int cbpi(int n)
	{
		int[] arr=new int[n+6];
		arr[n]=1;
		for(int j=n-1;j>=0;j--)
		{
			for(int k=j+1;k<=j+6;k++)
				arr[j]=arr[j]+arr[k];
		}
		
		
		for(int i=0;i<=n;i++)
			System.out.println(arr[i]);
		return arr[0];
	}
}
