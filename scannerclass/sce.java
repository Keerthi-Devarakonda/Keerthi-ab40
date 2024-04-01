package scannerclass;
import java.util.*;

public class sce 
{

	public static void main(String[] args)
	{
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Ente Name");
		String name = s1.next();
		System.out.println("Ente Byte");
		byte b1 = s1.nextByte();
		System.out.println("Ente Short no");
		short b2 = s1.nextShort();
		System.out.println("Ente Int");
		int b3 = s1.nextInt();
		System.out.println("Ente Long No");
		long b4 = s1.nextLong();
		System.out.println("Ente Float");
		float b5 = s1.nextFloat();
		System.out.println("Ente double");
		double b6 = s1.nextDouble();
		System.out.println("Ente boolean");
		boolean b7 = s1.nextBoolean();
		
		
		s1.close();	
			
	}

}
