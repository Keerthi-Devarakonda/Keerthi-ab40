package inheritance;
//Program 2 // single level inheritance

public class City_class extends State_class
{

static void add()	
{
	
System.out.println("adding");

}

 void subtracting()	
{
	
System.out.println("subtracting");

}
	
		
public static void main(String[] args) 
{
add();
mul();
City_class c1 = new City_class();
c1.subtracting();
c1.division();
}

}

class State_class //parentclass
{ 
	static void mul()	
	{
		
	System.out.println("mul");

	}
	
	 void division()	
	 {
	 	
	 System.out.println("division");

	 }
	
}