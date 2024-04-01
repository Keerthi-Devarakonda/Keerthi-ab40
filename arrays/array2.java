package arrays;

import java.util.Arrays;

public class array2 
{

	public static void main(String[] args) 
	
{
	String name = "manish910";
	
	boolean ans;
	char[] a1 = name.toCharArray();
	System.out.println(a1);
	char[] a2 = new char[2];
	a2[0] = 'j';
	a2[1]='k';
	
	
	System.out.println(Arrays.toString(a2));
	
	System.out.println(Arrays.toString(a1));
	for (int i=0; i<name.length();i++)
	{
	 ans = Character.isDigit(a1[i]);
	System.out.println(ans);
	
	if(ans==true)
	{
		
		System.out.println("Number is present at index" + i);
	}
	
	}

}

}
