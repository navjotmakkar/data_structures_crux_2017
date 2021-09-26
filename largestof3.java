
public class largestof3 {

	public static void main(String[] args) {
		int a=25;
		int b=30;
		int c=5;
		if(a>b && a>c)
		{
			System.out.println(a);
			return;
		}
		else
		{
			if(b>c && b>a)
			{
				System.out.println(b);
				return;
			}
			System.out.println(c);
		}

	}

}
