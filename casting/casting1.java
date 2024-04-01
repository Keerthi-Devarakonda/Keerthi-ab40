package casting; //prmitive type casting

public class casting1 
{

	public static void main(String[] args) 
	{
	
	//widening
	double weight =      83; // converting into double implicitly
	System.out.println(weight);

	double weight1 =  (double)    83; // converting into double explicitly
	System.out.println(weight1);
	

	// narrowing
	
	int a1 = (int) 83.95;
	System.out.println(a1);
	
	
	double c = 98.25;
	int d = (int) c;
	System.out.println(d);
	
	
	
	
	}

}
