package assignment5_strings;

import java.util.Scanner;

public class A5Q8_Max_Char_Freq {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s=scn.nextLine();
		char c=max_freq(s);
		System.out.println(c);
	}
	public static char max_freq(String str)
	{
		int[] arr=new int[256];
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			arr[ch]++;
		}
		int max=arr[0];
		int maxidx=0;
		for(int i=0;i<arr.length;i++)
		{
			int freq=arr[i];
			if(freq>max)
			{
				max=freq;
				maxidx=i;
			}
		}
		return (char)maxidx;
	}
}
