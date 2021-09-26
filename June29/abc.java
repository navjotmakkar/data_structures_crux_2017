package June29;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.Scanner;

class abc {
    private static Scanner scn;

	public static void main(String args[] ) throws Exception {
        scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scn.nextInt();
            
        }
        for(int j = 0;j<a.length;j++)
        {
        	int k=a[j];
        	for(int i=1;i<=k;i++)
        	{
            if(i%3==0 && i%5==0)
            System.out.println("FizzBuzz");
            else if(i%3==0)
            System.out.println("Fizz");
            else if(i%5==0)
            System.out.println("Buzz");
            else
            System.out.println(i);
        	}
        }
    }
}
