package June16;

public class Recursion_PDIskip {

	public static void main(String[] args) {
		pdiskip(5);
		int xpn=PoorPower(2,7);
		System.out.println(xpn);
		xpn=BetterPower(2,7);
		System.out.println(xpn);
	}
	public static void pdiskip(int n)
	{
		if(n==0)
			return;
		if(n%2!=0)
		{System.out.println("hi "+ n);
		}
		pdiskip(n-1);
		if(n%2==0)
		System.out.println("bye"+ (n));
	}
	public static int PoorPower(int x,int n)
	{
		if(n==0)
			return 1;
		int xpnm1=PoorPower(x,n-1);
		int xpn=x*xpnm1;
		return xpn;
	}
	public static int BetterPower(int x, int n)
	{
		if(n==0)
		{
			return 1;
		}
		
		int val=BetterPower(x,n/2);
		if(n%2==0)
			val=val*val;
		else
			val=x*val*val;
		return val;
	}
}
