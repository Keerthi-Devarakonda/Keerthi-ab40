package encapsulation;

class login
{
	private String email_id="contact@grotechminds.com";//default email id of the system with my custmer emailid
	
	public String getEmai_id() 
	{
		return email_id;
		
	}
	public void setEmail_id(String email_id)
	{
		this.email_id= email_id;
	}
	
	private String password="contact@password.com";

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	private int age=18;

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class encaps1
{

	public static void main(String[] args)
	{
		login l1 = new login();
		l1.setEmail_id("keerthi@gmail.com");
		System.out.println(l1.getEmai_id());
		
		l1.setPassword("keerthi123");
		System.out.println(l1.getPassword());
		
		l1.setAge(32);
		System.out.println(l1.getAge());
		
		
		
		
		
		

	}

}
