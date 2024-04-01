package myfirstpackage;

public class test 
	{
	static void add()
	{
	int a = 10;
	int b=10;
	int sum = a+b;
	System.out.println(sum);
	
	}
	void mul()
	
	{
		int a = 10;
		int b=10;
		int mul = a*b;
		System.out.println(mul);
		
		}
	

	test()
	{
		int a = 10;
		int b=10;
		int sub = a-b;
		System.out.println(sub);
		
		}
	
	public static void main(String[] args) 
	{
		add();
		//test t1 = new test(); // constructor
		//t1. mul(); // non static method
		//new mul();
		new test();

	}

}
