package June12;
import java.util.Scanner;
public class LogUsingPow {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x=scn.nextInt();
		int n=scn.nextInt();
		int i=log(x,n);
		System.out.println(i);
	}
	public static int power(int x,int n)
	{
		int pow=(int)Math.pow(x, n);
		return pow;
	}
	public static int log(int x, int b)
	{
		int i=0;
		int p=1;
		int val=0;
		while (val<x)
		{
			val=power(b,p);
			p++;
			i++;
		}
		return i;
	}
}
