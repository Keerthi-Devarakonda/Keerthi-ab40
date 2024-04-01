package abstractclasses;

abstract class Google_Code
{
abstract void login();
abstract void registration();
}

public class abstractex extends Google_Code

{
public static void main(String[] args) 
	
	{
	abstractex a1 = new abstractex();
	a1.login();
	a1.registration();
	}

	void login() 
	{
		System.out.println("Login Method");
		
	}

	@Override
	void registration()
	{
		System.out.println("Registration Method");	
		
	}

}
