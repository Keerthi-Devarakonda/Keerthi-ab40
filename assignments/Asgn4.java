package assignments; 
//create 5 static method and 5 non static method and call it inside main method
public class Asgn4 
{
	static void Add() //Method 1
	{
		int a = 10;
		int b = 20;
		int sum = a+b; 
	System.out.println("Sum is: " + sum);
	}
	static void Sub() //Method 2
	{
		int a = 10;
		int b = 20;
		int sub = a-b; 
	System.out.println("Subtraction is: " + sub);
	}
	static void Mul() //Method 3
	{
		int a = 10;
		int b = 20;
		int mul = a*b; 
	System.out.println("Multiplication is: " + mul);
	}
	static void Div() //Method 4
	{
		int a = 10;
		int b = 20;
		int div = b/a; 
	System.out.println("Division is: " + div);
	}

	static void Mod() //Method 5
	{
		int a = 10;
		int b = 20;
		int div = b%a; 
	System.out.println("Modulus is: " + div);
	}
	public void add1()
	{
		int a = 10;
		int b=10;
		int add1 = a+b;
		System.out.println(add1);
	}
	void sub1()
	{
		int a = 20;
		int b=10;
		int sub1 = a-b;
		System.out.println(sub1);
	}
	void mul1()
	{
	int a = 20;
	int b=10;
	int mul1 = a*b;
	System.out.println(mul1);
	}
	void div1() //Method 4
	{
	int a = 10;
	int b = 20;
	int div1 = b/a; 
	System.out.println(div1);
	}
	void mod1() //Method 4
	{
	int a = 10;
	int b = 20;
	int Mod1 = b%a; 
	System.out.println(Mod1);
	}
		public static void main(String[] args)
	{
		//System.out.println("Main Method");
		Add();
		Sub();
		Mul();
		Div();	
		Mod();
		new Asgn4().add1();
		new Asgn4().sub1();
		new Asgn4().mul1();
		new Asgn4().div1();
		new Asgn4().mod1();
	}
}
