package constructors;

public class Global_variables
{
int c; //global variable //non static//you have to access it in the same 
//fashion how you access the non static method
static double pi = 3.14; //global variable
static boolean value1;
void add()
{
int a = 10;
int b = 20;

System.out.println(a + pi);
System.out.println(b + pi);
}
	

void sub()
{
int a = 10;
int b= 20;

System.out.println(a + pi);
System.out.println(b + pi);
}
//variables()
//{}

	public static void main(String[] args) 
	{
		new Global_variables().add();
		new Global_variables();
		System.out.println(new Global_variables().c + pi);
		
		
	}

}
