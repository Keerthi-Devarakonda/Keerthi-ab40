package stringfunctions;

public class String_Ex {

	public static void main(String[] args)
	{
		String name = "Kesrthi12";
	int size = 	name.length()-1;
	System.out.println("size is " + size);
	//System.out.println(name.toUpperCase());
	//System.out.println(name.toLowerCase());
	System.out.println(name.charAt(3));
	//System.out.println(name.));
	//System.out.println(name.indexOf('p'));
	//System.out.println("Keerthi".equals("keerthi")); //System.out.println(name.equals("keerthi"));
	
	String input = "I am Student";
boolean ans1=	input.contains("manish");
String ans2 =	input.substring(5);
String ans3= 	input.substring(2,4);
System.out.println(ans1);
System.out.println(ans2);	
System.out.println(ans3);


System.out.println(input.concat(" Keerthi"));


	
	}

}
