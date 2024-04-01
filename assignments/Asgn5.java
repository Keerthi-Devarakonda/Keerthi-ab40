package assignments;

public class Asgn5 
{

	Asgn5() 
	{
		this(5);
		System.out.println("Constructor 1");	
	}
	Asgn5(int a) 
	{
	System.out.println(a);	
	}
	Asgn5(int a , int b) 
	{
	System.out.println(a+b);	
	}
	Asgn5(int a , double b) 
	{
		System.out.println(a+b);	
	}
	Asgn5(String a) 
	{
		a = "Hello I am Constructor with String";
		System.out.println(a);	
	}
	
	
	public static void main(String[] args)
	
	{
		Asgn5 a1 = new Asgn5();
		Asgn5 b1 = new Asgn5(5);
		Asgn5 c1 = new Asgn5(5, 9.5);
		Asgn5 d1 = new Asgn5(5,10);
		Asgn5 e1 = new Asgn5("");
			
	
	}

}
