package casting;

class Grandparent {
	
	void add() 
	{
		System.out.println("add Grandparent");
	}
	
}

class Parent extends Grandparent 
{
	void sub() 
	{
		System.out.println("sub parent");
	}
}

public class upcasting2 extends Parent
{
	void mul() 
	{
		System.out.println("mul child");
	}
	
	public static void main(String[] args) 
	{
		
		Parent p1  =	new	upcasting2(); //upcasting
		p1.add();
		p1.sub();
	
		// down casting
		upcasting2 u1 = (upcasting2) p1;
		
		
		
		
		
	}

}
