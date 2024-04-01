package stringfunctions;
public class Name_Ver 
{

	static void printfromreverse()
	{
		String name = "Keerthi";

		for (int i=name.length()-1;i>=0;i--)

		{
			
		char a1 = name.charAt(i);
		System.out.println(a1);

		}}
		
		static void printnormal()	
		{
		String name = "Keerthi";

		for (int i=0;i<name.length();i++)

		{
		char a1 = name.charAt(i);
		System.out.println(a1);
		}
		
	}
	public static void main(String[] args)
	{
		printfromreverse();
		printnormal();
		
	

	}
}
/*		
String name = "Keerthi";

for (int i=0;i<name.length();i++)

{
char a1 = name.charAt(i);
System.out.println(a1);

}*/
