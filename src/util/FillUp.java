package util;

import java.util.Random;

public class FillUp {

	public static int[] array(int[] nums, int count) {
		IOUtil.setScanner();
		
		for (int i = 0; i < count; i++) nums[i] = IOUtil.getInt();
		
		IOUtil.closeScanner();
		
		return nums;
	}
	
	public static Integer[] arrayOfRandoms(int count) {
		Integer[] nums = new Integer[count];
		
		Random random = new Random();
		for (int i = 0; i < count; ++i) nums[i] = random.nextInt();
		
		return nums;
	}
}
