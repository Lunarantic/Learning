package exercise3;

import util.FillUp;

public class Program7 {

	public static void main(String[] args) {
		System.out.println("Enter a number for palindrome test:\n");
		Integer integer = FillUp.getANum();
		
		System.out.println("Numerical method says it is " + isPalindrome(integer));
		System.out.println("String method says it is " + isPalindromeTest(integer));
	}
	
	public static boolean isPalindromeTest(int num) {
		if (num < 0) return false;
		
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append(num);
		
		String org = sBuilder.toString();
		String rev = sBuilder.reverse().toString();
		
		return org.equals(rev);
	}
	
	public static boolean isPalindrome(int num) {
		if (num < 0) return false;
		
		int r = (int) Math.pow(10, Math.log10(num));
		int t;
		
		while (num > 0) {
			if ((t = num / r) != num % 10) return false;
			num -= (r*t);
			r /= 10;
		}
		
		return true;
	}
}
