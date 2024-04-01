package stringfunctions;
import java.util.*;

public class palindrome
{

	static void printfromreverse()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter name");
		String name = s1.next();
		//String name = "mom";
		String output = "";
		for (int i=name.length()-1;i>=0;i--)
		{
		char a1= name.charAt(i);
		output = output+a1;
		//System.out.println(a1);
		}
		 System.out.println(output);
		if(name.equals(output))
		{
			System.out.println("palindrome");
		}
		else 
			System.out.println("not palindrome");	
		s1.close();
		}
	
 public static void main(String[] args)
	{
	printfromreverse();
	
		}
}
