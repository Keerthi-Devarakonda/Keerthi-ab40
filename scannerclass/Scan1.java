package scannerclass;

import java.util.Scanner; // syntax1 for 

//import java.util.*; //syntax2

public class Scan1 

{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter first no");
		
		int firstno = 
				s1.nextInt();
		System.out.println("Enter second no");
		int secondno = 
				s1.nextInt();
		
		int sum = firstno + secondno;
		System.out.println("Sum is " +sum);
		s1.close();
	}

}
