package myfirstpackage;

public class testarraysequ 
{
	
	static void compareArrays()
		{
		int[] array1 = new int[4];
		int[] array2 = new int[4];
		    boolean b = true;
		    for (int i = 0; i < array2.length; i++) 
		    {
		        if (array2[i] == array1[i])
		        {
		            System.out.println("true");
		        } 
		        else 
		        {
		            b = false;
		            System.out.println("False");
		        }
		    } 
		}
		 //  return b;
	public static void main(String[] args)
	{
		compareArrays();
		
	}
	
}
