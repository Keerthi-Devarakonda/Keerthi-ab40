package assignments;

public class Asg6_sib_iib_con
{
	static 
	{
	System.out.println("I am SIB");	
	}
	{
	System.out.println("I am IIB");	
	}
	{
	System.out.println("I am IIB2");	
	}
	
	Asg6_sib_iib_con()
	{
	System.out.println("I am Constructor");	
	}
	
	Asg6_sib_iib_con(int i, int b)
	{
	System.out.println("I am Constructor 2");	
	}	
	
	public static void main(String[] args) 
	{
		
	System.out.println("I am MainMethod");
	
	Asg6_sib_iib_con s1 = new Asg6_sib_iib_con();
	/*Asg6_sib_iib_con s2 = new Asg6_sib_iib_con(5,7);
	Asg6_sib_iib_con s3 = new Asg6_sib_iib_con(-5,0.12);*/
		
	}

}
