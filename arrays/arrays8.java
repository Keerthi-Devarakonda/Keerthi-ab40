package arrays;

import java.util.Arrays;

public class arrays8 {

	public static void main(String[] args) 
	{
	String a1 = "horse";
	String a2 = "yutuu";

	char c1[] = a1.toCharArray();
	char c2[] = a2.toCharArray();
	System.out.println(Arrays.toString(c1));
	System.out.println(Arrays.toString(c2));
	Arrays.sort(c1);
	System.out.println(Arrays.toString(c1));
	Arrays.sort(c2);
	System.out.println(Arrays.toString(c2));
	boolean ans = Arrays.equals(c1, c2);
	if(ans==true)
	{
	System.out.println("anagram");	
		}
	else 
	{
		System.out.println("not anagram");
		
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	}

}
