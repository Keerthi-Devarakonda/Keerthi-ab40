package myfirstpackage;

public class Howtoaccessstaticmethod 
{
	static void Add() //Method 1
	{
		int a = 10;
		int b = 20;
		int sum = a+b; 
	System.out.println("Sum is: " + sum);
	}
	static void Subtraction() //Method 2
	{
		int a = 10;
		int b = 20;
		int sub = a-b; 
	System.out.println("Subtraction is: " + sub);
	}
	static void Multiplication() //Method 3
	{
		int a = 10;
		int b = 20;
		int mul = a*b; 
	System.out.println("Multiplication is: " + mul);
	}
	static void Division() //Method 4
	{
		int a = 10;
		int b = 20;
		int div = b/a; 
	System.out.println("Division is: " + div);
	}
public static void main(String[] args)
{
	//System.out.println("Main Method");
	Add();
	Subtraction();
	Multiplication();
	Division();	
}	
}
