package myfirstpackage;

public class sib_iib_con
{
	static 
	{
	System.out.println("I am SIB");	
	}

	{
	System.out.println("I am IIB");	
	}
	
	sib_iib_con()
	{
	System.out.println("I am Constructor");	
	}
	
	
	public static void main(String[] args) 
	{
		
	System.out.println("I am MainMethod");
	
	sib_iib_con s1 = new sib_iib_con();
	sib_iib_con s2 = new sib_iib_con();
		
	}

}
