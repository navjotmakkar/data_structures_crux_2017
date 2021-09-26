package assignment5_strings;

import java.util.Scanner;

public class A5Q6_Subsequences {
public static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		String s=scn.nextLine();
		int limit = (int)Math.pow(2,s.length());
		int counter = 0;
		
		while(counter < limit){
			int temp = counter;
			
			System.out.print("[");
			for(int i = 0; i < s.length(); i++){
				int rem = temp % 2;
				
				if(rem == 1){
					System.out.print(s.charAt(i) + " ");
				}
				
				temp = temp / 2;
			}
			System.out.println("]");
			
			counter++;
		}
	}
}
