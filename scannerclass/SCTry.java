package scannerclass; 
import java.util.*; //Program using scanner class for all methods using local variables
public class SCTry {
public static void main(String[] args) 	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter 1st no.");
		int a = s1.nextInt();
		System.out.println("Enter 2nd no.");
		int b = s1.nextInt();
		System.out.println("Sum of Int two numbers is " + (a+b)); 
		
		// nextInt
		System.out.println("Enter 1st no.");
		byte a1 = s1.nextByte();
		System.out.println("Enter 2nd no.");
		byte b1 = s1.nextByte();
		System.out.println("Sum of Byte two numbers is " + (a1+b1));		//nextByte
		
		System.out.println("Enter 1st no.");
		short a2 = s1.nextShort();
		System.out.println("Enter 2nd no.");
		short b2 = s1.nextShort();
		System.out.println("Sum of Short two numbers is " +  (a2+b2));		//nextshort
		
		System.out.println("Enter 1st no.");
		long a3 = s1.nextLong();
		System.out.println("Enter 2nd no.");
		long b3 = s1.nextLong();
		System.out.println("Sum of Long two numbers is " + ( a3+b3));
		
		//nextlong
		System.out.println("Enter 1st no.");
		float a4 = s1.nextFloat();
		System.out.println("Enter 2nd no.");
		float b4 = s1.nextFloat();
		System.out.println("Sum of float two numbers is " + ( a4+b4)); //nextfloat
		
		System.out.println("Enter 1st no.");
		double a5 = s1.nextDouble();
		System.out.println("Enter 2nd no.");
		double b5 = s1.nextDouble();
		System.out.println("Sum of Double two numbers is " + ( a5+b5)); //nextdouble
		
		System.out.println("Enter Boolean Value");
		boolean bo = s1.nextBoolean();
		System.out.println("Boolean value is " + ( bo)); //nextboolean
		
		System.out.println("Enter 1st name");
		String a6 = s1.next();
		System.out.println("Enter 2nd no.");
		String b6 = s1.next();
		System.out.println("Full Name is " + ( a6 +" "+ b6));		}} //next  -- String

