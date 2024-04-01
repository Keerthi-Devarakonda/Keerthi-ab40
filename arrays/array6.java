package arrays;

import java.util.Arrays;

public class array6 
{

	public static void main(String[] args)
	{
		int number[] = new int[3];
		int number2[] = new int[3];
		number[0] = 30;
		number[1] = 20;
		number[2] = 40;
		number2[0] = 30;
		number2[1] = 20;
		number2[2] = 40;
		
		
boolean ans =	Arrays.equals(number, number2)	;
System.out.println(ans);
				
			
		
	}

}
