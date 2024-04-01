package arrays;

import java.util.Arrays;

public class array4 {

	public static void main(String[] args)
	{
		String name = "keer03121990";
		boolean ans;
		int count_of_alpha =0;
		char[] a1 = name.toCharArray();
		
		System.out.println(Arrays.toString(a1));
		for (int i=0; i<name.length();i++)
		{
		 ans = Character.isAlphabetic(a1[i]);
		System.out.println(ans);
		
		if(ans==true)
		{
			count_of_alpha++;
		}
			
		}
		System.out.println(count_of_alpha);
				

	}

}
