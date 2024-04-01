package myfirstpackage;
class Parent_class
{
	 void add()
	{
		System.out.println("Add 3 num");
	}
}
public class Method_Overriding_1 extends Parent_class
{
	  //void add() // change name to sub to remove error when using final keyword
	void add ()
	{
		
		System.out.println("Add 2 num");
		//super.add();
	}
	
	public static void main(String[] args) 
	{
		
		Method_Overriding_1 m1 = new Method_Overriding_1();
		m1.add();		
		
		

	}

}
