package abstractclasses; // MultiLevel Inheritance with Java

abstract class Facebook_class
{
abstract void fcadd1();//abstract method
abstract void fcsub1(); //abstract method
 void fcsub() // Concrete method 2
 {
	System.out.println("CM 2");
}
}
abstract class Google_class extends Facebook_class
{
	void gcadd() // Concrete method 1
	{
		System.out.println("I am Concrete method from Abs Class 2 Google_Class");
		
	}	
abstract void gcadd1();
abstract void gcsub1();
}

public class Login_Class extends Google_class
{

	public static void main(String[] args)
	{
		Login_Class l1 = new Login_Class();
		
		l1.fcadd1();
		l1.fcsub1();
		l1.gcadd1();
		l1.gcsub1();
		l1.gcadd();
		l1.lcadd();
		lcsub();
			}

	@Override
	void gcadd1() 
	{
	System.out.println("I am Google class Add");	
	} 

	@Override
	void gcsub1()
	{
	System.out.println("I am Google class Sub");	
	}

	@Override
	void fcadd1() 
	{
	System.out.println("I am Facebook class Add");	
	}

	@Override
	void fcsub1()
	{
	System.out.println("I am Facebook class Sub");	
	}
	
	void lcadd() // Concrete method 1
	{
		System.out.println("I am Concrete method 1 from Child Class");
		
	}	
	static void lcsub() // Concrete method 2
	
	{
		System.out.println("I am Concrete method 2 from Child Class");
		
	}
}
