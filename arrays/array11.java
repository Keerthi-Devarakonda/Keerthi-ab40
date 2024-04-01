package arrays;

import java.util.Arrays;

public class array11 {

	public static void main(String[] args) 
	{
		int num[]	= new int[4];
		int copy[]= new int[4];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		
		
		for (int i=0;i<num.length;i++)
		{
			copy[i]= num[i]	;
		
		if (copy[i]==num[i])
		{
			System.out.println("both arrays are equal at index position " + i);
				
		}
			else 
			{
				System.out.println("both are not equal");
			}
		}
		
}
}



//System.out.println("original array is "+ Arrays.toString(num));
//System.out.println("copied array is "+ Arrays.toString(num1));