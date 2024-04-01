package arrays;

import java.util.Arrays;

public class array3 {

	public static void main(String[] args)
	{

		String name = "keer03121990";
		boolean ans;
		int count_of_numeric =0;
		char[] a1 = name.toCharArray();
		
		System.out.println(Arrays.toString(a1));
		for (int i=0; i<name.length();i++)
		{
		 ans = Character.isDigit(a1[i]);
		System.out.println(ans);
		
		if(ans==true)
		{
			count_of_numeric++;
		}
			
			System.out.println(count_of_numeric);
		
		
		
		
		
	}

}
}
