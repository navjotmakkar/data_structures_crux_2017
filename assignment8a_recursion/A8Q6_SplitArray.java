package assignment8a_recursion;

public class A8Q6_SplitArray {

	public static void main(String[] args) {
		System.out.println("Enter the size: ");
		int n=scn.nextInt();
		int[] arr1=input(n);
		
	}
	public static int[] input(int n) {
		int[]rv=new int[n];
		System.out.println("Enter the value: ");
		for(int i=0;i<rv.length;i++)
		{
			rv[i]=scn.nextInt();
		}
		return rv;
	}
}
