package arrays; // calculate avg of numbers

public class array9 {

	public static void main(String[] args) {
		

int number[] = new int[5];
		
		number[0] = 1;
		number[1] = 1;
		number[2] = 1;
		number[3] = 1;
		number[4] = 1;
		int sum = 0;
		System.out.println(number.length);
		
		for (int i=0;i<number.length;i++)
		{
			sum=sum+number[i];
		
					
		}
		
		System.out.println(sum);
double average = sum / number.length;
	System.out.println("Avg is " + average);	
		
	}

}
