package exercise3;

import java.util.Arrays;

import util.FillUp;

public class Program2 {

	public static void main(String[] args) {
		
		System.out.println("Provide 10 numbers for see their sum:");
		
		int[] nums = FillUp.array(new int[10], 10);
		
		System.out.println("The sum of these numbers is " + Arrays.stream(nums).sum());
	}
}
