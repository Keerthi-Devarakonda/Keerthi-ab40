package arrays;

// check a number is available in array of numbers;

public class array10 
{

	public static void main(String[] args)
	{
		int rollno[]= new int[4];
		rollno[0] =1;
		rollno[1] =2;
		rollno[2] =3;
		rollno[3] =6;
		
		int val = 6;
		for(int i=0;i< rollno.length; i++)
{
	if(rollno[i]== val)
	{
		System.out.println("6 is there");
		
	}

		
	else
	{
		System.out.println("6 is not there");
	}

}		
		
		
		
		
		
	}

}
