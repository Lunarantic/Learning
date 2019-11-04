package exercise3;

import util.IOUtil;

public class Program5 {

	public static void main(String[] args) {
		IOUtil.setScanner();
		
		System.out.println("Enter number to test for even/odd:");
		int num = IOUtil.getInt();
		System.out.println("It is " + isEven(num));
		
		IOUtil.closeScanner();
	}
	
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}
}
