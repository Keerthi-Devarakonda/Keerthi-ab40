package stringfunctions;

import java.util.Arrays;

public class Remva {

	public static void main(String[] args) {
		
		
		
		String name = "I am Studenta12";
	String output =	name.replace('a',' ');
	System.out.println(output);
		
	System.out.println(name.replace('a','n'));	//replace small a with n
	
	System.out.println(name.replaceAll("[A-Z]",""));//replace all caps
	
	System.out.println(name.replaceAll("[a-z]",""));// replace all small
	
	System.out.println(name.replaceAll("[0-9]",""));//replace all caps
		
	System.out.println(name.replaceAll("[A-Z]","Manish"));
	
	String name3 = "";
	System.out.println(name.isEmpty());
	System.out.println(name3.isEmpty());
	System.out.println(name.lastIndexOf('a')); // 
	System.out.println(name.equalsIgnoreCase("i am student"));
	System.out.println(name.repeat(5));
	
	String name4 = "manish" ;
	char[] val = name4.toCharArray();
			System.out.println(name4.toCharArray());
			
			System.out.println(Arrays.toString(val));
			
			
			
	}

}
//take name as input, replace all caps with Manish