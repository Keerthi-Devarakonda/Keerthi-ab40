package abstractclasses;

interface Parent1
{
	void login();
	void logout ();
	static void addi()
	{
	System.out.println("interface static method");
	}
	
}
interface Parent2
{
	void registration();
	
	
}
 class Parent3
{
	 //void add() {}
	 Parent3()
		{
		System.out.println("concrete constructor");	
		}
	 
}
 class Parent4
 extends Parent3
{
	 void add() {}
	
	Parent4()
	{
	System.out.println("abstract constructor");	
	}
	static void addj()
	{
	System.out.println("abstract static method");
	}
}

public class MultipleInh 
//extends Parent4
implements Parent1 , Parent2  
{
public static void main(String[] args)
{

	MultipleInh m1 = new MultipleInh();
	m1.registration();
	m1.login();
	m1.logout();
	//m1.add();
	Parent1.addi();
	Parent4.addj();
		
	}

	public  void registration() 
	{
		System.out.println(1);
		
	}
	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.out.println(2);
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		System.out.println(3);
	}

//	@Override
//	void add() {
	//	// TODO Auto-generated method stub
	//	System.out.println(4);
	//}

}
