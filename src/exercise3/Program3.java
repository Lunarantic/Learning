package exercise3;

import java.util.Arrays;

import util.FillUp;

public class Program3 {

	public static void main(String[] args) {
		
		System.out.println("Enter 10 elements:");

		int l = 10;
		Integer[] nums = FillUp.arrayOfRandoms(l--);
		
		System.out.println("Initial array is " + Arrays.toString(nums));
		
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, temp;
		
		for (int i = 0; i <= l; ++i, --l) {
			temp = nums[i];
			nums[i] = nums[l];
			nums[l] = temp;
			
			max = Math.max(nums[i], temp);
			min = Math.min(nums[i], temp);
		}
		
		System.out.println("Reversed array is " + Arrays.toString(nums));
		System.out.println("Maximum of them is " + max);
		System.out.println("Minimum of them is " + min);
	}
}
