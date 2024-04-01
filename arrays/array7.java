package arrays;

import java.util.Arrays;

public class array7 {

	public static void main(String[] args) {
		int number[] = new int[3];
		
		number[0] = 30;
		number[1] = 20;
		number[2] = 40;
		System.out.println(number[0]);
		System.out.println(Arrays.toString(number));
		Arrays.sort(number);
		
	System.out.println(Arrays.toString(number));	
		
	}

}
