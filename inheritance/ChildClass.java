package inheritance;
//static and non static methods
//but not constructors
//Constructors cannot be inherited in Java
class Parentclass
{
	static void parent()
	{
		System.out.println("I m parent class");
		
	}
	
	
}

public class ChildClass extends Parentclass 
{

	static void child()
	{
		System.out.println("I m child class");
		
	}
	
	
	public static void main(String[] args) 
	{
		
		parent();
		child();
	}

}
