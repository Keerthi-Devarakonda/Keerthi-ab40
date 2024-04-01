package assignments;
import java.util.*; //Program using scanner class for all methods using Local variables
public class Asgn7_Sc_Locvar {

	static int a;
	static int b;
	
	 void add()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter 1st no.");
		int a = s1.nextInt();
		System.out.println("Enter 2nd no.");
		int b = s1.nextInt();
		System.out.println("Sum of Int two numbers is " + (a+b)); 
		}
	
	 void sub ()
	 {
		 Scanner s1 = new Scanner(System.in);
			System.out.println("Enter 1st no.");
			int a = s1.nextInt();
			System.out.println("Enter 2nd no.");
			int b = s1.nextInt();
			System.out.println("Subtraction of  two numbers is " + (a-b)); 
			} 
	 void mul ()
	 {
		 Scanner s1 = new Scanner(System.in);
			System.out.println("Enter 1st no.");
			short a = s1.nextShort();
			System.out.println("Enter 2nd no.");
			short b = s1.nextShort();
			System.out.println("Multiplication of  two numbers is " + (a*b)); 
			} 
	 void div ()
	 {
		 Scanner s1 = new Scanner(System.in);
			System.out.println("Enter 1st no.");
			Long a = s1.nextLong();
			System.out.println("Enter 2nd no.");
			Long b = s1.nextLong();
			System.out.println("Division of  two numbers is " + (a/b)); 
			} 		 
	 void mod ()
	 {
		 Scanner s1 = new Scanner(System.in);
			System.out.println("Enter 1st no.");
			int a = s1.nextInt();
			System.out.println("Enter 2nd no.");
			int b = s1.nextInt();
			System.out.println("Modulus of  two numbers is " + (a%b)); 
			} 
	 	 
	public static void main(String[] args) {

		Asgn7_Sc_Locvar ad1 = new Asgn7_Sc_Locvar();
		ad1.add();
		ad1.sub();
		ad1.div();
		ad1.mul();
		ad1.mod();
		
		
	}

}
