package inheritance;

class Mentor  // parent class
{
	Mentor()
	{
		System.out.println("Mentor");
	}
}
public class Student extends Mentor  // student class
{
	Student()
	{
		//super();  // super calling statement
		System.out.println("Student");
	}
	
public static void main(String[] args)
{

	Student s1 = new Student();
	
}
}

