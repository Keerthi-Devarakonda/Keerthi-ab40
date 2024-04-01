package inheritance;
class A
{
static 	int  i=1;
static 	void printi(int i)
    {
	System.out.println(i);  
    }}
class B extends A
{
  static  int  j=2;
  static void printj()
  {
 System.out.println(i + j);  
  } }
class C extends B
{
	static  int  k=3;
	  void printk1()
	{
	System.out.println(i + j + k);  
	}}
class X extends C
	{		static  int  m=2;
		static void printi()
		{
		System.out.println(i + j + k +m);  
		}	}
 public class D extends X
{
	static  int  l=2;
	static void printi()
	{
	System.out.println(i + j + k +l+m);  
	}

public static void main(String args[])
{	
	printi();
	new C(). printk1();
	}
}
