package assignment4_arrays;

import java.util.Scanner;
public class A4Q14_SumOf2Arrays {

public static void main(String[] args) {

    int[] num1 = { 1,0,2,9 };
    int[] num2 = {3,4,5,6,7};

    int[] arraySum=arrayaddition(num1,num2);
    for (int i = 1; i < arraySum.length; i++) {

        System.out.print(arraySum[i]);
    }
    
    }
public static int[] arrayaddition(int[] num1, int[] num2)
{
	 int capacity = 0;
	    if(num1.length>num2.length)
	    	capacity=num1.length;
	    else
	    	capacity=num2.length;
	    int[] arraySum = new int[capacity + 1];
	    int len2 = num2.length;
	    int len1 = num1.length;

	    if (len1 < len2) {
	        int lenDiff = len2 - len1;
	        
	        boolean carry = false;

	        for (int i = len1 - 1; i >= 0; i--) {
	            
	            int sum =0;
	            if (carry) {
	                 sum = num1[i] + num2[i + lenDiff] +1;
	                 carry = false;
	            }else
	            {
	                 sum = num1[i] + num2[i + lenDiff];
	            }

	            if (sum > 9) {
	                    arraySum[i + lenDiff + 1] = sum % 10;
	                carry = true;
	            }else
	            {
	                arraySum[i + lenDiff + 1] = sum % 10;
	            }
	        }

	        for (int i = lenDiff - 1; i >= 0; i--) {
	            if(carry){
	                arraySum[i + 1] = num2[i]+1;
	            }else
	            {
	                arraySum[i + 1] = num2[i] ;
	            }

	            if (arraySum[i + 1] > 9) {
	                arraySum[i + 1] = arraySum[i + 1] % 10;
	                carry = true;
	            } else {
	                carry = false;
	            }
	        }
	        
	        if (carry) {
	            arraySum[0] = 1;
	        } else {
	            arraySum[0] = 0;
	        }

	    } else {
	        int lenDiff = len1 - len2;
	        boolean Carry = false;

	        for (int i = len2 - 1; i >= 0; i--) {
	            int sum = 0;
	            if (Carry) {
	                 sum = num2[i] + num1[i + lenDiff] +1;
	                 Carry = false;
	            }else
	            {
	                 sum = num2[i] + num1[i + lenDiff];
	            }

	            if (sum > 9) {
	                    arraySum[i + lenDiff + 1] = sum % 10;
	                Carry = true;
	            }else
	            {
	                arraySum[i + lenDiff + 1] = sum % 10;
	            }
	        }

	        for (int i = lenDiff - 1; i >= 0; i--) {
	           if(Carry){
	                arraySum[i + 1] = num1[i]+1;
	            }else
	            {
	                arraySum[i + 1] = num1[i] ;
	            }

	            if (arraySum[i + 1] > 9) {
	                arraySum[i + 1] = arraySum[i + 1] % 10;
	                Carry = true;
	            } else {
	                Carry = false;
	            }

	        }
	        if (Carry) {
	            arraySum[0] = 1;
	        } else {
	            arraySum[0] = 0;
	        }
	    }

	    if(arraySum[0] == 1)
	    {
	        System.out.print(1);
	    }
	    return arraySum;
}
}