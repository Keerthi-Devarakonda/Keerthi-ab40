package constructors;
class One1
{
 void add1()
{
System.out.println("add method");	
}
One1()
{
System.out.println("I am cons1");	
}	
}
class Two2 
//extends One1
{

static void add()
{
System.out.println("add method");	
}
Two2()
{
System.out.println("I am cons2");	
}	
}

public class Cons_Test
//extends Two2
{
	Cons_Test(){
		System.out.println("I am cons3");	
	}
	
	

	public static void main(String[] args)
	{
		Cons_Test ct = new Cons_Test();
		One1 o1 = new One1();
		Two2 t2 = new Two2();
		
		
		o1.add1();
		//add();
		
		
		
	}

}
