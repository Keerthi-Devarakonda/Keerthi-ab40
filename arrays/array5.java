package arrays;

import java.util.Arrays;

public class array5 {

	public static void main(String[] args)
	{
		
		String name = " keer 03 12 1990 ";
		boolean ans;
		int count_of_space =0;
		char[] a1 = name.toCharArray();
		
		System.out.println(Arrays.toString(a1));
		for (int i=0; i<name.length();i++)
		{
		 ans = Character.isSpaceChar(a1[i]);
		System.out.println(ans);
		
		if(ans==true)
		{
			count_of_space++;
		}
			
		}
		System.out.println(count_of_space);
	}

}
