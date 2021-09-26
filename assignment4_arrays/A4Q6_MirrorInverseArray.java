package assignment4_arrays;
import java.util.Scanner;
public class A4Q6_MirrorInverseArray {

	public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        
        boolean b=true;
		int[]arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
		int[] inv= inverse(arr);
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]!=inv[i])
		    {
		        b=false;
		        break;
		    }
		}
		System.out.println(b);
    }
    public static int[] inverse(int[] arr){
		int[] rv=new int[5];
		int val=0;
		for(int i=0; i<arr.length;i++)
		{
			val=arr[i];
			rv[val]=i;
		}
		return rv;
	}
}
